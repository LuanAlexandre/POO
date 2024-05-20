/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axlre
 */
import java.util.Scanner;

public class VolumeCombustivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double height = scan.nextDouble();
        double fuelLevel = scan.nextDouble();
        double ray = scan.nextDouble();
        
        boolean empty = fuelLevel == 0; //tanque vazio
        boolean veryLow = fuelLevel < ray; //combustivel abaixo da semiesfera inferior
        boolean low = fuelLevel == ray; //combustivel ate a semiesfera inferior
        boolean mid = (fuelLevel > ray) && (fuelLevel < (height - ray));//combustivel passa da semiesfera inferior
        boolean midHigh = fuelLevel == (height - ray);//tanque cheio ate a semiesfera superior
        boolean high = fuelLevel > height - ray;//combustivel acima da semiesfera superior
        boolean full = fuelLevel == height; //tanque cheio
        
        double capVolume = (Math.PI/3.0) * Math.pow(fuelLevel, 2.0) * (3.0*ray - fuelLevel);
        double sphereVolume = ((4.0/3.0) * Math.PI * Math.pow(ray, 3.0));
        double cylinderVolume = Math.PI * (Math.pow(ray, 2.0) * (fuelLevel - ray));
        double volume;
        
        if (height < 0 || fuelLevel < 0 || ray < 0) {
            volume = -1;
            System.out.printf("%.3f\n", volume);
        }
        else if (empty == true) {
            volume = 0;
            System.out.printf("%.3f\n", volume);
        }
        else if (veryLow == true) {
            volume = capVolume;
            System.out.printf("%.3f\n", volume);
            
        }
        else if (low == true) {
            volume = sphereVolume / 2;
            System.out.printf("%.3f\n", volume);
        }
        else if (mid == true) {
            volume = (sphereVolume / 2) + cylinderVolume;
            System.out.printf("%.3f\n", volume);
        }
        else if (midHigh == true) {
            volume = (sphereVolume / 2) + cylinderVolume;
            System.out.printf("%.3f\n", volume);
        }
        else if (high == true) {
            volume = (sphereVolume / 2) + cylinderVolume + capVolume;
            System.out.printf("%.3f\n", volume);
        }
        else if (full == true) {
            volume = sphereVolume + cylinderVolume;
            System.out.printf("%.3f\n", volume);
        }
        
        scan.close();
    }
}
