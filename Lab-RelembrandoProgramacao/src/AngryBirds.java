/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axlre
 */
import java.util.Scanner;

public class AngryBirds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double GRAVITY = 9.8;
        double vInitial = scan.nextDouble();
        double alpha = scan.nextDouble();
        double distance = scan.nextDouble();
        
        vInitial = Math.pow(Math.abs(vInitial), 2);
        alpha = Math.toRadians(alpha);
        
        double range = (vInitial * Math.sin(2*alpha)) / GRAVITY;
        
        if (Math.abs(distance - range) <= 0.1) {
            System.out.println(1);
        }
        else System.out.println(0);
        
        scan.close();
    }
}
