/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Test {

    private static Van van;

    public static void displayHeader(Van van) {
        System.out.println("==================================================");
        System.out.println("DINA AND GAT RENT A RIDE SERVICE");
        System.out.println("VEHICLE RENTAL SYSTEM");
        System.out.println("==================================================");
    }

    static void displayHeader(Vehicle v) {
        v.displayVehicleInfo(); // Fixed typo: displayVehicleiInfo -> displayVehicleInfo
        v.displayVehicleType();

      
        System.out.printf("Rental fee: PHP %.2f%n", v.calculateRentalFee());
        System.out.println("\n------------------------------------------------\n");
    }

    public static void main(String[] args) {
        displayHeader(van);

        Sedan sedan = new Sedan("SD001", "Toyota", "Vios", 2024, 3, 1500.00, 500.00);
        Van van = new Van("VN001", "Toyota", "HiAce", 2023, 2, 3000.00, 1000.00); 

       
        displayHeader(sedan);
        displayHeader(van);
    }
}


