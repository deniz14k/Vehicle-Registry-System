package isp.lab6.exercise2;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        HashSet<Registry> registry = new HashSet<Registry>();
        boolean exit = false;
        while (!exit) {

            System.out.println("Enter choice ! ");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Check Vehicle");
            System.out.println("4. Display Vehicles");
            System.out.println("0. Quit");

            try {
                int choice = read.nextInt();
                read.nextLine();

                switch (choice) {

                    case 1:
                        boolean rejected=false;
                        System.out.println("Enter the VIN : ");
                        int vin=read.nextInt();
                        read.nextLine();
                        System.out.println("Enter the License Plate  : ");
                        String LicensePlate=read.nextLine();

                        System.out.println("Enter the Make : ");
                        String make=read.nextLine();
                        System.out.println("Enter the Model : ");
                        String model=read.nextLine();
                        System.out.println("Enter the year : ");
                        int year= read.nextInt();
                        read.nextLine();
                        Registry vehicle=new Registry(vin,LicensePlate, make, model , year);
                        for(Registry v: registry){

                            if(vin==v.getVin()) {
                                System.out.println("Unable to add vehicle because this VIN allready exists in our registry !");
                                rejected=true;
                                break;

                            }
                        }
                        if(!rejected) {

                            registry.add(vehicle);
                            System.out.println("Vehicle added ! ");
                            System.out.println(vehicle.toString());
                        }
                        break;


                    case 2:
                        boolean removed=false;
                        System.out.println("Enter the VIN of the car to delete it : ");
                        int vinToDelete=read.nextInt();
                        for(Registry r : registry){
                            if(r.getVin()==vinToDelete) {
                                registry.remove(r);
                                System.out.println("Car succesfully removed ! ");
                                removed=true;
                                break;
                            }
                        }
                        if(!removed) System.out.println("Car not found in the registry! ");
                        break;

                    case 3:

                        boolean found=false;
                        System.out.println("Enter the VIN of the car to check if it is in the registry : ");
                        int vinToSearch=read.nextInt();
                        for(Registry r : registry){
                            if(r.getVin()==vinToSearch) {
                                System.out.println("Car found in the registry ! ");
                                found=true;
                                break;
                            }
                        }
                        if(!found) System.out.println("Car not found in the registry! ");
                        break;


                    case 4:

                        if(registry.isEmpty()) System.out.println("The registry is empty! ");
                        for( Registry r: registry) System.out.println(r.toString());
                        break;


                    case 0: exit=true;
                    break;

                    default: System.out.println("Wrong input !!!");
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input format. Please enter an integer.");
                read.nextLine();

            }
        }

    }
}