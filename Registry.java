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



    public void addVehicle(int vin, String LicensePlate, String make, String model, int year,HashSet<CarInfo> registry){

        
        CarInfo vehicle=new CarInfo(vin,LicensePlate, make, model , year);
        if (registry.contains(vehicle)) {
            registry.remove(vehicle);
        }        

        registry.add(vehicle);
        System.out.println("Vehicle added ! ");
        System.out.println(vehicle.toString());
    }


    public void removeVehicle(int vinToDelete,HashSet<CarInfo>registry){

        boolean removed = registry.remove(new CarInfo(vinToDelete, null, null, null, 0));

        if (removed) {
            System.out.println("Car succesfully removed ! ");
        } else {
            System.out.println("Car not found in the registry! ");
        }
    }

    public boolean checkVehicle(int vinToSearch, HashSet<CarInfo> registry){

        boolean found= registry.contains(new CarInfo(vinToSearch,null,null,null,0));
        if(!found) System.out.println("Car not found in the registry! ");
        else System.out.println("Car found ! ");
            return found;
    }

    public void displayVehicle(){

        if(registry.isEmpty()) System.out.println("The registry is empty! ");
        for( CarInfo r: registry) System.out.println(r.toString());

    }



}
