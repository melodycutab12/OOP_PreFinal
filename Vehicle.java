/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public abstract class Vehicle {
   
    private String vehicleID;
    private String brand;
    private String model;
    private int year;
    private int rentalDays;
    
 
    static int vehicleCount = 0;

   
    public Vehicle() {
        this.vehicleID = "";
        this.brand = "";
        this.model = "";
        this.year = 0;
        this.rentalDays = 0;
        vehicleCount++;
    }

    
    public Vehicle(String vehicleID, String brand, String model, int year, int rentalDays) {
        this.vehicleID = vehicleID;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.rentalDays = rentalDays;
        vehicleCount++;
    }

   
    public abstract double calculateRentalFee();

   
    public void displayVehicleInfo() {
        System.out.printf("%-15s: %s%n", "Vehicle ID", vehicleID);
        System.out.printf("%-15s: %s%n", "Brand", brand);
        System.out.printf("%-15s: %s%n", "Model", model);
        System.out.printf("%-15s: %d%n", "Year", year);
        System.out.printf("%-15s: %d%n", "Rental Days", rentalDays);
    }

    
    public void displayVehicleInfo(boolean showRentalFee) {
        displayVehicleInfo();
        if (showRentalFee) {
            System.out.printf("%-15s: PHP %,.2f%n", "Rental Fee", calculateRentalFee());
        }
    }

   
    public static int getVehicleCount() {
        return vehicleCount;
    }

    
    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    void displayVehicleType() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}