package exercise_1;
/**
 * this class represents the planets that will be created in the main class and it's attributes:
 *
 *      mass, is the mass of the planet.
 *      density, is the density of the planet.
 *      diameter, is the diameter of the planet .
 *      distanceSun, is the distance from the planet to the sun.
 *      identifier , is an id to identify each planet.
 *      name , is the name of the planet.
 *
 @version 01.00.00 2022-04-22, The class corresponds to version 1 of the system,
   it has suffered 0 refactorings during the version
   0 minor changes were made.
  * @author Jhon Dorado jhd400@gmail.com
 * @since 01.00.00 2022-04-22
 */

public class Planet {

    private double mass;
    private double density;
    private int diameter;
    private double distanceSun;
    private int identifier;
    private String name;

    /**
     * this is the constructor of the class planet
     * @param mass is a double, is the mass of the planet.
     * @param density is double, is the density of the planet.
     * @param diameter is an int, is the diameter of the planet .
     * @param distanceSun is a double, is the distance from the planet to the sun.
     * @param identifier is an int, is an id to identify each planet.
     * @param name is a String, is the name of the planet.
     */


    public Planet(double mass, double density, int diameter, double distanceSun, int identifier, String name) {
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distanceSun = distanceSun;
        this.identifier = identifier;
        this.name = name;
    }

    /**
     * these are the getters and setters of the Planet class,
     * these respectively are used to set and get  the values of the attributes:
     * mass
     * density
     * diameter
     * distanceSun
     * identifier
     * name
     */

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public double getDistanceSun() {
        return distanceSun;
    }

    public void setDistanceSun(double distanceSun) {
        this.distanceSun = distanceSun;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

