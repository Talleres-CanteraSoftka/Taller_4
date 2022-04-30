package exercise_4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * The Vehicle class defines the attributes (characteristics) that the different vehicle types share.
 * plate
 * registrationDate
 * passengers
 * crew
 * wheels
 * meansTransport
 * @version 01.00.00 2022-04-24, The class corresponds to version 1 of the system,
 * it has suffered 0 refactorings during the version
 * 0 minor changes were made
 * @author Jhon Dorado jhd400@gmail.com
 * @since 01.00.00 2022-04-24
 */


public abstract class Vehicle {
    private String plate;
    private Calendar registrationDate;
    private int passengers;
    private boolean crew;
    private int wheels;
    private String mediumTransport;

    /**
     * Constructor: allows you to create an instance of the Vehicle class according to the stipulated parameters.
     *
     * @param plate is the number plate of the vehicle
     * @param registrationDate is the registration date of the vehicle
     * @param passengers is the number of passengers
     * @param crew is  boolean variable to indicate if the vehicle has a crew or not
     * @param wheels is the number of wheels of the vehicle
     * @param mediumTransport is the medium the vehicle uses to move, water or land
     * @version 01.00.00 2022-04-24, The class corresponds to version 1 of the system,
     * it has suffered 0 refactorings during the version
     * 0 minor changes were made
     * @author Jhon Dorado jhd400@gmail.com
     * @since 01.00.00 2022-04-24
     */
    public Vehicle(
            String plate,
            Calendar registrationDate,
            int passengers,
            boolean crew,
            int wheels,
            String mediumTransport
    )
    {
        this.plate = plate;
        this.registrationDate = registrationDate;
        this.passengers = passengers;
        this.crew = crew;
        this.wheels = wheels;
        this.mediumTransport = mediumTransport;
    }
    /**
     * these are the getters and setters of the vehicle class,
     * these respectively are used to set and get  the values of the attributes:
     * plate
     * registrationDate
     * passengers
     * crew
     * wheels
     * mediumTransport
     * @version 01.00.00 2022-04-24, The class corresponds to version 1 of the system,
     * it has suffered 0 refactorings during the version
     * 0 minor changes were made
     * @author Jhon Dorado jhd400@gmail.com
     * @since 01.00.00 2022-04-24
     */

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }


    public Calendar getRegistrationDate() {
        return registrationDate;
    }


    public void setRegistrationDate(Calendar registrationDate) {
        this.registrationDate = registrationDate;
    }


    public int getPassengers() {
        return passengers;
    }


    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }


    public boolean isCrew() {
        return crew;
    }


    public void setCrew(boolean crew) {
        this.crew = crew;
    }


    public int getWheels() {
        return wheels;
    }


    public void setWheels(int wheels) {
        this.wheels = wheels;
    }


    public String getMediumTransport() {
        return mediumTransport;
    }


    public void setMediumTransport(String mediumTransport) {
        this.mediumTransport = mediumTransport;
    }

    /**
     * Override the toString method to display all the vehicle data as a string.
     * @return returns all the attributes of the vehicle
     * @version 01.00.00 2022-04-24, The class corresponds to version 1 of the system,
     * it has suffered 0 refactorings during the version
     * 0 minor changes were made
     * @author Jhon Dorado jhd400@gmail.com
     * @since 01.00.00 2022-04-24
     */
    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        String strDate = dateFormat.format(registrationDate.getTime());
        return "\nVehicle information\nPlate: " + plate + "\nRegistration date: "
                + strDate + "\nNumber of passengers: " + passengers + "\nCrew: "
                + (crew==true?"Present":"Absent") + "\nNumber of wheels: " + wheels
                + "\nMedium of transport: " + mediumTransport + "\n";
    }
}
