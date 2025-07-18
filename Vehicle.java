/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author anzoh
 */
public class Vehicle {
    //Private variables ecapsulation
    private String brand;
    private int year;
    
    //Parameterized constructor
    public Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }
    //setter methods
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    //getter methods
    public String getBrand(){
        return brand;
    }
    
    public int getYear(){
        return year;
    }
    //Prints out the info
    public void displayVehicleInfo(){
    System.out.println("-----------");
    System.out.println("Brand: " + brand);
    System.out.println("Year: " + year);
    }
}
