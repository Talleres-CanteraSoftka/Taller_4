package exercise_5;

import exercise_4.Vehicle;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * The Boat class defines the attributes of the Truck.
 *
 *@version 01.00.00 2022-04-24, The class corresponds to version 1 of the system,
 *it has suffered 0 refactorings during the version
 *0 minor changes were made
 *@author Jhon Dorado jhd400@gmail.com
 *@since 01.00.00 2022-04-24
 */
public class Truck extends Vehicle {
    private float height;

    /**
     * Constructor: Constructor: allows to create an instance of the class Truck.
     *
     * @param height is the height of the truck
     * @param plate the number of the plate
     * @param registrationDate is the registration date
     * @param passengers is the number of passengers
     * @param crew is the size of the crew
     * @param wheels is the number of wheels
     * @param mediumTransport is the medium of transport
     *
     *@version 01.00.00 2022-04-24, The class corresponds to version 1 of the system,
     *it has suffered 0 refactorings during the version
     *0 minor changes were made
     *@author Jhon Dorado jhd400@gmail.com
     *@since 01.00.00 2022-04-24
     */
    public Truck(
            float height,
            String plate,
            Calendar registrationDate,
            int passengers,
            boolean crew,
            int wheels,
            String mediumTransport)
    {
        super(plate, registrationDate, passengers, crew, wheels, mediumTransport);
        this.height = height;
    }

    /**
     * @return gets the height of the truck
     *
     *@version 01.00.00 2022-04-24, The class corresponds to version 1 of the system,
     *it has suffered 0 refactorings during the version
     *0 minor changes were made
     *@author Jhon Dorado jhd400@gmail.com
     *@since 01.00.00 2022-04-24
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height sets the height of the truck
     *
     *@version 01.00.00 2022-04-24, The class corresponds to version 1 of the system,
     *it has suffered 0 refactorings during the version
     *0 minor changes were made
     *@author Jhon Dorado jhd400@gmail.com
     *@since 01.00.00 2022-04-24
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     *overrides the method  toString to show all the data about the truck.
     *@return data about the truck.
     *@version 01.00.00 2022-04-24, The class corresponds to version 1 of the system,
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
                + "\nMedium of transport: " + getMediumTransport() + "Height of the vehicle:"
                + getHeight();
    }

}
