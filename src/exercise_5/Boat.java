package exercise_5;
import exercise_4.Vehicle;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * The Boat class defines the attributes of the boat.
 *@version 01.00.00 2022-04-23, The class corresponds to version 1 of the system,
 *it has suffered 0 refactorings during the version
 *0 minor changes were made
 *@author Jhon Dorado jhd400@gmail.com
 *@since 01.00.00 2022-04-24
 */
public class Boat extends Vehicle {
    private boolean engine;

    /**
     * Constructor: allows to create an instance of the class Boat.
     *
     * @param engine if the boat has a motor or not
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
    public Boat(
            boolean engine,
            String plate,
            Calendar registrationDate,
            int passengers,
            boolean crew,
            int wheels,
            String mediumTransport)
    {
        super(plate, registrationDate, passengers, crew, wheels, mediumTransport);
        this.engine = engine;
    }

    /**
     * gets if the boat has a motor or not
     *@return
     *@version 01.00.00 2022-04-23, The class corresponds to version 1 of the system,
     *it has suffered 0 refactorings during the version
     *0 minor changes were made
     *@author Jhon Dorado jhd400@gmail.com
     *@since 01.00.00 2022-04-24
     */
    public boolean getEngine() {
        return engine;
    }

    /**
     * sets if the boat has engine or not
     * @param engine
     *@version 01.00.00 2022-04-23, The class corresponds to version 1 of the system,
     *it has suffered 0 refactorings during the version
     *0 minor changes were made
     *@author Jhon Dorado jhd400@gmail.com
     *@since 01.00.00 2022-04-24
     */
    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    /**
     *overrides the method  toString to show all the data about the boat
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
                + "\nMedium of transport: " + getMediumTransport() + "\n¿Has motor?"
                + (getEngine()==true?"Yes":"No");
    }

}
