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
    int year;
    int mileage;
    
    public Car(String makeIn, String modelIn, int yearIn, int mileageIn){
        this.make = makeIn;
        this.model = modelIn;
        this.year = yearIn;
        this.mileage = mileageIn;
    }
    
    void setMake(String newMake){
        this.make = newMake;
    }
    
    void setModel(String newModel){
        this.model = newModel;
    }
    
    void setYear(int newYear){
        this.year = newYear;
    }
    
    void setMileage(int newMileage){
        this.mileage = newMileage;
    }
    
    String getMake(){
        return this.make;
    }
    
    String getModel(){
        return this.model;
    }
    
    int getYear(){
        return this.year;
    }
    
    int getMileage(){
        return this.mileage;
    }
}
