/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axlre
 */
import java.util.Scanner;

public class RotaOrtodromica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        double RAY = 6371;
        double t1 = scan.nextDouble();
        double g1 = scan.nextDouble();
        double t2 = scan.nextDouble();
        double g2 = scan.nextDouble();
        
        double t1Radians = Math.toRadians(t1);
        double g1Radians = Math.toRadians(g1);
        double t2Radians = Math.toRadians(t2);
        double g2Radians = Math.toRadians(g2);
        
        double senProduct = Math.sin(t1Radians) * Math.sin(t2Radians);
        double cosProduct = Math.cos(t1Radians) * Math.cos(t2Radians) * Math.cos(g1Radians - g2Radians);
        double arcsen = Math.acos(senProduct + cosProduct);
        
        double distance = RAY * arcsen;
        
        System.out.printf("A distancia entre os pontos (%.6f, %.6f) e (%.6f, %.6f) e de %.2f km\n", t1, g1, t2, g2, distance);
    
        scan.close();
    }
}
