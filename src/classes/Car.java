/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Joen
 */
public class Car {

    String make;
    String model;
    String engine;
    String fuel;
    int year;
    int cost;

    public Car(String makeIn, String modelIn, String engineIn, String fuelIn, int yearIn, int costIn) {
        this.make = makeIn;
        this.model = modelIn;
        this.year = yearIn;
        this.cost = costIn;
        this.engine = engineIn;
        this.fuel = fuelIn;
    }

    void setMake(String newMake) {
        this.make = newMake;
    }

    void setModel(String newModel) {
        this.model = newModel;
    }

    void setYear(int newYear) {
        this.year = newYear;
    }

    public String getMake() {
        return this.make;
    }

    public String getEngine() {
        return this.engine;
    }

    public String getFuel() {
        return this.fuel;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public int getCost() {
        return this.cost;
    }
}
