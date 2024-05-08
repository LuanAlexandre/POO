/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axlre
 */
import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float celsius = scan.nextFloat();
        float fahrenheit = (float) ((9*celsius) / 5) + 32;
        
        System.out.printf("%.1f\n", fahrenheit);
        
        
        scan.close();
    }
}
