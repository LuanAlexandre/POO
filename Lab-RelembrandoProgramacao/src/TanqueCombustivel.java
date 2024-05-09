/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axlre
 */
import java.util.Scanner;

public class TanqueCombustivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float ray = scan.nextFloat();
        float height = scan.nextFloat();
        int option = scan.nextInt();
        
        double totalVolume = (4.0/3.0)*Math.PI*Math.pow(ray, 3);
        double airVolume = (Math.PI/3.0)*Math.pow(height, 2)*(3*ray - height);
        double fuelVolume = totalVolume - airVolume;
        
        if (option == 1) System.out.printf("%.4f\n", airVolume);
        else System.out.printf("%.4f\n", fuelVolume);
        scan.close();
    }
}
