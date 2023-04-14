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
                                registry.addVehicle();
                        break;


                    case 2:
                                registry.removeVehicle();
                        break;

                    case 3:
                                registry.checkVehicle();

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