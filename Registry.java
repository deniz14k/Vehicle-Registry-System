package isp.lab6.exercise2;
import java.util.HashSet;
import java.util.Scanner;
public class Registry {

    CarInfo vehicle;

    public HashSet<CarInfo> registry = new HashSet<CarInfo>();

    public HashSet<CarInfo> getRegistry(){
        return this.registry;
    }

    public Scanner read = new Scanner(System.in);


    public void addVehicle(){

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
        CarInfo vehicle=new CarInfo(vin,LicensePlate, make, model , year);
        for(CarInfo v: registry){

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

    }

    public void addVehicleWithParameters(int vin, String LicensePlate, String make, String model, int year,HashSet<CarInfo> registry){

        boolean rejected=false;
        CarInfo vehicle=new CarInfo(vin,LicensePlate, make, model , year);
        for(CarInfo v: registry){

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

    }

    public void removeVehicle(){

        boolean removed=false;
        System.out.println("Enter the VIN of the car to delete it : ");
        int vinToDelete=read.nextInt();
        for(CarInfo r : registry){
            if(r.getVin()==vinToDelete) {
                registry.remove(r);
                System.out.println("Car succesfully removed ! ");
                removed=true;
                break;
            }
        }
        if(!removed) System.out.println("Car not found in the registry! ");

    }

    public void removeVehicleWithParameters(int vinToDelete,HashSet<CarInfo>registry){

        boolean removed=false;
        for(CarInfo r : registry){
            if(r.getVin()==vinToDelete) {
                registry.remove(r);
                System.out.println("Car succesfully removed ! ");
                removed=true;
                break;
            }
        }
        if(!removed) System.out.println("Car not found in the registry! ");

    }

    public void checkVehicle(){

        boolean found=false;
        System.out.println("Enter the VIN of the car to check if it is in the registry : ");
        int vinToSearch=read.nextInt();
        for(CarInfo r : registry){
            if(r.getVin()==vinToSearch) {
                System.out.println("Car found in the registry ! ");
                found=true;
                break;
            }
        }
        if(!found) System.out.println("Car not found in the registry! ");


    }
    public boolean checkVehicleWithParameters(int vinToSearch, HashSet<CarInfo> registry,boolean found){

        for(CarInfo r : registry){
            if(r.getVin()==vinToSearch) {
                System.out.println("Car found in the registry ! ");
                found=true;
                break;
            }
        }
        if(!found) System.out.println("Car not found in the registry! ");

            return found;
    }

    public void displayVehicle(){

        if(registry.isEmpty()) System.out.println("The registry is empty! ");
        for( CarInfo r: registry) System.out.println(r.toString());


    }



}
