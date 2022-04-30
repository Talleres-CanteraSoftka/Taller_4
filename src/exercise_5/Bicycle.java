package exercise_5;

import exercise_4.Vehicle;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 * The Bicycle class defines the attributes (characteristics) of the bicycle.
 *@version 01.00.00 2022-04-24, The class corresponds to version 1 of the system,
 *it has suffered 0 refactorings during the version
 *0 minor changes were made
 *@author Jhon Dorado jhd400@gmail.com
 *@since 01.00.00 2022-04-24
 */
public class Bicycle extends Vehicle {
    private int bicycleSpokes;



    /**
     * Constructor: Allows you to create an instance of the Bicycle class.
     * @param bicycleSpokes is the number of spokes
     * @param plate is the number of the plate
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
    public Bicycle(
            int bicycleSpokes,
            String plate,
            Calendar registrationDate,
            int passengers,
            boolean crew,
            int wheels,
            String mediumTransport
    )
    {
        super(plate, registrationDate, passengers, crew, wheels, mediumTransport);
        this.bicycleSpokes = bicycleSpokes;

    }

    /**
     * this method is used to get the number of spokes of the bicycle
     * @return the number of spokes of the bicycle
     *@version 01.00.00 2022-04-23, The class corresponds to version 1 of the system,
     *it has suffered 0 refactorings during the version
     *0 minor changes were made
     *@author Jhon Dorado jhd400@gmail.com
     *@since 01.00.00 2022-04-24
     */
    public int getSpokes() {
        return bicycleSpokes;
    }

    /**
     * this helps to set the number of spokes
     * @param bicycleSpokes is the number of spokes
     *@version 01.00.00 2022-04-23, The class corresponds to version 1 of the system,
     *it has suffered 0 refactorings during the version
     *0 minor changes were made
     *@author Jhon Dorado jhd400@gmail.com
     *@since 01.00.00 2022-04-24
     */
    public void setSpokes(int bicycleSpokes) {
        this.bicycleSpokes = bicycleSpokes;
    }


    /**
     * Override the toString method to display the ship's data in the following format
     * @return all the data of the vehicle
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
                + "\nMedium of transport: " + getMediumTransport() + "Number of spokes: " + bicycleSpokes;
    }

}
