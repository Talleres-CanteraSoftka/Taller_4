package exercise_4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/**
 * The Main class contains the method to start the program and the menu.
 *@version 01.00.00 2022-04-24, The class corresponds to version 1 of the system,
 *it has suffered 0 refactorings during the version
 *0 minor changes were made
 *@author Jhon Dorado jhd400@gmail.com
 *@since 01.00.00 2022-04-24

 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        int add = 0;
        System.out.println("Welcome to the Ferry control system. Please indicate the data of the vehicles to be transported");
        try {
            do {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter the vehicle plate");
                String plate = s.nextLine();
                System.out.println("Enter the registration date, please use the format yyyy-MM-dd: ");
                String lD = s.nextLine();
                String[] l = lD.split("-");
                Calendar registrationDate = Calendar.getInstance();
                registrationDate.set(Integer.parseInt(l[0]), Integer.parseInt(l[1]), Integer.parseInt(l[2]));
                System.out.println("Enter the number of passengers");
                int passengers = Integer.parseInt(s.nextLine());
                System.out.println("If the vehicle has a crew enter 1, otherwise enter 0");
                int crew = Integer.parseInt(s.nextLine());
                System.out.println("Enter the number of wheels");
                int wheels = Integer.parseInt(s.nextLine());
                System.out.println("Enter the medium of transport");
                String meansTransport = s.nextLine();
                System.out.println("Enter the data of the next vehicle");

                Vehicle vh = new Vehicle(plate, registrationDate, passengers, (crew != 0), wheels, meansTransport) {
                };
                vehicleList.add(vh);

                add = add + 1;

            } while (add < 10);
            System.out.println(vehicleList);

        } catch (NumberFormatException e) {
            System.out.println("You must enter a number");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The requested data was not delivered");

        }
    }
}
