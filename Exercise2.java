package isp.lab6.exercise2;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {

        Registry registry=new Registry();
        Scanner read = new Scanner(System.in);
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
                                registry.addVehicle(vin,LicensePlate,make,model,year,registry.getRegistry());
                        break;


                    case 2:
                                System.out.println("Enter the VIN to delete : ");
                                int vinToDelete=read.nextInt();
                                registry.removeVehicle(vinToDelete, registry.getRegistry());
                        break;

                    case 3:
                                System.out.println("Enter the VIN of the car to check if it is in the registry : ");
                                int vinToSearch=read.nextInt();
                                registry.checkVehicle(vinToSearch,registry.getRegistry());

                        break;


                    case 4:
                                    registry.displayVehicle();

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
