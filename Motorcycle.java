/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author anzoh
 */
public class Motorcycle extends Vehicle{
    //Private variable for Motorcycle.
    private boolean hasSideCar;
    
    //Parameterized constructor
    public Motorcycle(String brand, int year, boolean hasSideCar){
    super(brand, year);
    this.hasSideCar = hasSideCar;
    }
    
    public Boolean getHasSideCar(){
        return hasSideCar;
    }
    
    public void displayMotorcycleInfo(){
    System.out.println("-------------");
    System.out.println("Brand: " + getBrand());
    System.out.println("Year: " + getYear());
    System.out.println("has side car?: " + getHasSideCar());
    }
    
}
