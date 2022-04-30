package exercise_5;

import exercise_4.Vehicle;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *The Boat class defines the attributes of the Motorcycle.
 *@version 01.00.00 2022-04-23, The class corresponds to version 1 of the system,
 *it has suffered 0 refactorings during the version
 *0 minor changes were made
 *@author Jhon Dorado jhd400@gmail.com
 *@since 01.00.00 2022-04-24
 */
public class Motorcycle extends Vehicle {
    private boolean engineCycles;

    /**
     * Constructor: Constructor: allows to create an instance of the class Motorcycle.
     *
     * @param engineCycles the number of cycles of the motor
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
    public Motorcycle(
            boolean engineCycles,
            String plate,
            Calendar registrationDate,
            int passengers,
            boolean crew,
            int wheels,
            String mediumTransport)
    {
        super(plate, registrationDate, passengers, crew, wheels, mediumTransport);
        this.engineCycles = engineCycles;
    }

    /**
     *gets the number of cycles of the motor
     *@return the number of cycles of the motor
     *@version 01.00.00 2022-04-23, The class corresponds to version 1 of the system,
     *it has suffered 0 refactorings during the version
     *0 minor changes were made
     *@author Jhon Dorado jhd400@gmail.com
     *@since 01.00.00 2022-04-24
     */
    public boolean getEngineCycles() {
        return engineCycles;
    }

    /**
     *sets the number of cycles of the motor
     *@param engineCycles
     *
     *@version 01.00.00 2022-04-23, The class corresponds to version 1 of the system,
     *it has suffered 0 refactorings during the version
     *0 minor changes were made
     *@author Jhon Dorado jhd400@gmail.com
     *@since 01.00.00 2022-04-24
     */
    public void setEngineCycles(boolean engineCycles) {
        this.engineCycles = engineCycles;
    }

    /**
     *overrides the method  toString to show all the data about the motorcycle.
     *@return
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
                + "\nMedium of transport: " + getMediumTransport() + "Motor of: "
                + (getEngineCycles()==true?"2":"4") + "cycles";
    }

}
