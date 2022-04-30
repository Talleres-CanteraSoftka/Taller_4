package exercise_5;

import exercise_4.Vehicle;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * this class defines the unique attributes of the class car.
 *
 *@version 01.00.00 2022-04-23, The class corresponds to version 1 of the system,
 *it has suffered 0 refactorings during the version
 *0 minor changes were made
 *@author Jhon Dorado jhd400@gmail.com
 *@since 01.00.00 2022-04-24
 */
public class Car extends Vehicle {
    private boolean doors;

    /**
     * Constructor: allows to create an object of the class car
     *
     * @param doors is the number of doors
     * @param plate the number of the plate
     * @param registrationDate is the registration date
     * @param passengers is the number of passengers
     * @param crew is the size of the crew
     * @param wheels is the number of wheels
     * @param mediumTransport is the medium of transport
     *
     *@version 01.00.00 2022-04-23, The class corresponds to version 1 of the system,
     *it has suffered 0 refactorings during the version
     *0 minor changes were made
     *@author Jhon Dorado jhd400@gmail.com
     *@since 01.00.00 2022-04-24
     */
    public Car(
            boolean doors,
            String plate,
            Calendar registrationDate,
            int passengers,
            boolean crew,
            int wheels,
            String mediumTransport)
    {
        super(plate, registrationDate, passengers, crew, wheels, mediumTransport);
        this.doors = doors;
    }

    /**

     *@return the number of doors
     *@version 01.00.00 2022-04-23, The class corresponds to version 1 of the system,
     *it has suffered 0 refactorings during the version
     *0 minor changes were made
     *@author Jhon Dorado jhd400@gmail.com
     *@since 01.00.00 2022-04-24
     */
    public boolean getDoors() {
        return doors;
    }

    /**
     * sets the number of doors
     * @param doors return the number of doors
     *@version 01.00.00 2022-04-23, The class corresponds to version 1 of the system,
     *it has suffered 0 refactorings during the version
     *0 minor changes were made
     *@author Jhon Dorado jhd400@gmail.com
     *@since 01.00.00 2022-04-24
     */
    public void setDoors(boolean doors) {
        this.doors = doors;
    }

    /**
     * overrides the method  toString to show all the data about the car
     *@return
     *@version 01.00.00 2022-04-23, The class corresponds to version 1 of the system,
     *it has suffered 0 refactorings during the version
     *0 minor changes were made
     *@author Jhon Dorado jhd400@gmail.com
     *@since 01.00.00 2022-04-24
     */
    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        String strDate = dateFormat.format(getRegistrationDate().getTime());
        return "\nVehicle information\nPlate: " + getPlate() + "\nRegistration date: "
                + strDate + "\nNumber of passengers: " + getPassengers() + "\nCrew: "
                + (isCrew()==true?"Present":"Absent") + "\nNumber of wheels: " + getWheels()
                + "\nMedium of transport: " + getMediumTransport() + "Number of doors: "
                + (getDoors()==true?"2":"4");
    }

}
