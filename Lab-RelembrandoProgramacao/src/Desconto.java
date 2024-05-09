/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axlre
 */
import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float value = scan.nextFloat();
        float valueToPay = value;
        if (value >= 200.0) valueToPay = (float) value * 0.95f;
        System.out.printf("%.2f\n", valueToPay);
        
        scan.close();
    }
}
