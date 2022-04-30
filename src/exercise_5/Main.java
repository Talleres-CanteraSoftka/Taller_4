package exercise_5;

import java.util.ArrayList;
import exercise_4.Vehicle;

import java.util.Calendar;
import java.util.Scanner;
/**.
 * executes the program
 *@version 01.00.00 2022-04-23, The class corresponds to version 1 of the system,
 *it has suffered 0 refactorings during the version
 *0 minor changes were made
 *@author Jhon Dorado jhd400@gmail.com
 *@since 01.00.00 2022-04-24
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        int add = 0;
        System.out.println("Welcome to the Ferry control system.");
        try{
            do
            {
                Scanner s = new Scanner(System.in);
                System.out.println("""
                               Please enter the number that corresponds to the type of vehicle you wish to add. The possible options are:
                               1. Car.
                               2. Motorcycle.
                               3. Truck.
                               4. Bicycle.
                               5. Boat""");
                int Vehicle = Integer.parseInt(s.nextLine());
                System.out.println("Enter the plate of the vehicle");
                String plate = s.nextLine();
                System.out.println("Enter the registration date, please use the format yyyy-MM-dd: ");
                String lD = s.nextLine();
                String[] l = lD.split("-");
                Calendar registrationDate = Calendar.getInstance();
                registrationDate.set(Integer.parseInt(l[0]),Integer.parseInt(l[1]), Integer.parseInt(l[2]));
                System.out.println("Enter the number of passengers");
                int passengers = Integer.parseInt(s.nextLine());
                System.out.println("If the vehicle has a crew enter 1 otherwise enter 0");
                int crew = Integer.parseInt(s.nextLine());
                System.out.println("Enter the number of wheels of the vehicle");
                int wheels = Integer.parseInt(s.nextLine());
                System.out.println("Enter the medium of transport (land or water");
                String mediumTransport = s.nextLine();

                switch(Vehicle){
                    case 1 -> {
                        System.out.println("If the car has 2 doors write 2, if the car has 4 doors write 4");
                        int doors= Integer.parseInt(s.nextLine());

                        Car v = new Car((doors != 4), plate, registrationDate, passengers, (crew != 0), wheels, mediumTransport);
                        vehicleList.add(v);
                    }

                    case 2 -> {
                        System.out.println("If the motorcycle has a motor of 2 cycles write 2, if the morocycle has a motor of 4 cycles write 4");
                        int engineCycles= Integer.parseInt(s.nextLine());

                        Motorcycle v = new Motorcycle((engineCycles != 4), plate, registrationDate, passengers, (crew != 0), wheels, mediumTransport);
                        vehicleList.add(v);
                    }

                    case 3 -> {
                        System.out.println("write the height of the truck");
                        float height= Float.parseFloat(s.nextLine());

                        Truck v = new Truck(height, plate, registrationDate, passengers, (crew != 0), wheels, mediumTransport);
                        vehicleList.add(v);
                    }

                    case 4 -> {
                        System.out.println("write the number of spokes of the bicycle: ");
                        int bicycleSpokes= Integer.parseInt(s.nextLine());

                        Bicycle v = new Bicycle(bicycleSpokes, plate, registrationDate, passengers, (crew != 0), wheels, mediumTransport);
                        vehicleList.add(v);
                    }

                    case 5 -> {
                        System.out.println("if the boat has a motor write 1 otherwise write 0");
                        int engine= Integer.parseInt(s.nextLine());

                        Boat v = new Boat((engine != 0), plate, registrationDate, passengers, (crew != 0), wheels, mediumTransport);
                        vehicleList.add(v);
                    }
                }

                add = add + 1;
                System.out.println(add);

            }

            while (add < 10);
            System.out.println(vehicleList);
        }

        catch (NumberFormatException e){
            System.out.println("Only numbers are allowed");
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The requested data was not delivered");
        }

        finally {
            System.out.println(vehicleList);
        }
    }
}
