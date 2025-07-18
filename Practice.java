/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice;

/**
 *
 * @author anzoh
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instance of vehicle
        Vehicle car = new Vehicle("Toyota", 2020);
        car.displayVehicleInfo();
        
        Motorcycle bike = new Motorcycle("Harley-Davidson", 2023, true);
        bike.displayMotorcycleInfo();
        
        System.out.print("\n");
        
        System.out.println("Motorcycle brand: " + bike.getBrand());
    }
    
}
