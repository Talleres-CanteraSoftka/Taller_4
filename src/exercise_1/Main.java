package exercise_1;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 This is the main class that executes the program
 @version 01.00.00 2022-04-22, The class corresponds to version 1 of the system,
  * * it has suffered 0 refactorings during the version
  * * 0 minor changes were made
  * @author Jhon Dorado jhd400@gmail.com
  * @since 01.00.00 2022-04-22
 */
public class Main {

    public static void main(String[] args) {


        final double gravity = 6.673E-11;
        int planet1, planet2, end = 0, selection = 0;

        Scanner scanner = new Scanner(System.in);
/**
 * Represents an ArrayList of the solar system, with specific data on the planets and the sun.
 * @version 01.00.00 2022-04-22, The class corresponds to version 1 of the system,
 *   * * it has suffered 0 refactorings during the version
 *   * * 0 minor changes were made
 *   * @author Jhon Dorado jhd400@gmail.com
 *   * @since 01.00.00 2022-04-22
 */
        try {

            ArrayList<Planet> solarSystem = new ArrayList<>();
            Planet sun = new Planet(1.989 * 10E30, 1.41, 1390000, 0, 1, "Sol" + "\n");
            Planet p1 = new Planet(3.285 * 10E23, 5.43, 4879, 5.79*10E10, 2, "Mercurio" + "\n");
            Planet p2 = new Planet(4.867 * 10E24, 5.24, 12104, 1.08*10E11, 3, "Venus" + "\n");
            Planet p3 = new Planet(5.972 * 10E24, 5.51, 12742, 1.49*10E11, 4, "Tierra" + "\n");
            Planet p4 = new Planet(6.39 * 10E23, 3.93, 6779, 2.27*10E11, 5, "Marte" + "\n");
            Planet p5 = new Planet(1.898 * 10E27, 1.33, 139820, 7.78*10E11, 6, "Júpiter" + "\n");
            Planet p6 = new Planet(5.683 * 10E26, 0.7, 116460, 1.42*10E12, 7, "Saturno" + "\n");
            Planet p7 = new Planet(8.681 * 10E25, 1.27, 50724, 2.78*10E12, 8, "Urano" + "\n");
            Planet p8 = new Planet(1.024 * 10E26, 1.64, 49244, 4.30*10E12, 9, "Neptuno" + "\n");
            solarSystem.add(sun);
            solarSystem.add(p1);
            solarSystem.add(p2);
            solarSystem.add(p3);
            solarSystem.add(p4);
            solarSystem.add(p5);
            solarSystem.add(p6);
            solarSystem.add(p7);
            solarSystem.add(p8);


            while (end == 0) {



                switch (selection + 1) {

                    case 1:
                        System.out.println("Calculate gravitational attraction");
                        System.out.println("Select a body of the solar system:");
                        System.out.println("0.Sun\n1.Mercury\n2.Venus\n3.Earth\n4.Mars\n5.Jupiter\n6.Saturn\n7.uranus\n8.Neptune\n");
                        planet1 = scanner.nextInt();

                        System.out.println("Select another body from the solar system");
                        System.out.println("0.Sun\n1.Mercury\n2.Venus\n3.Earth\n4.Mars\n5.Jupiter\n6.Saturn\n7.uranus\n8.Neptune\n");
                        planet2 = scanner.nextInt();


                        double distancePlanet = Math.abs(solarSystem.get(planet1).getDistanceSun() - solarSystem.get(planet2).getDistanceSun());

                        double squaredDistance = Math.pow(distancePlanet, 2);


                        double attraction = gravity * ((solarSystem.get(planet1).getMass() * (solarSystem.get(planet2).getMass()) / squaredDistance));
                        System.out.println("The gravitational attraction of both bodies is: " + attraction + " N");
                        System.out.println("\nDo you want to continue the program?");
                        System.out.println("0.Yes\n1.No");
                        end = scanner.nextInt();
                        break;

                    default:
                        end = 1;
                }
            }
        }catch (InputMismatchException e) {
            System.out.println("You must type a number");
            scanner.next();
        }
    }
}

