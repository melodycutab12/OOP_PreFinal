/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Motorcycle extends Vehicle {
    private double dailyRate;
    private double helmetFee;

    public Motorcycle(String vehicleID, String brand, String model, int year, int rentalDays, double dailyRate, double helmetFee) {
        super(vehicleID, brand, model, year, rentalDays);
        this.dailyRate = dailyRate;
        this.helmetFee = helmetFee;
    }

    @Override
    public double calculateRentalFee() {
        return (getRentalDays() * dailyRate) + helmetFee;
    }

    
}