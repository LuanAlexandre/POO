/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axlre
 */
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float numberOne = scan.nextFloat();
        float numberTwo = scan.nextFloat();
        float numberThree = scan.nextFloat();
        
        float media = (float) (numberOne + numberTwo + numberThree) / 3;
        
        System.out.printf("%.2f\n", media);
        
        scan.close();
    }
}
