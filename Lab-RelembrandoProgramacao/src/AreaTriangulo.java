/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axlre
 */
import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float ladoA = scan.nextFloat();
        float ladoB = scan.nextFloat();
        float ladoC = scan.nextFloat();
        boolean aMaisB = (ladoA + ladoB) > ladoC;
        boolean aMaisC = (ladoA + ladoC) > ladoB;
        boolean bMaisC = (ladoB + ladoC) > ladoA;
        float s = (float) (ladoA + ladoB + ladoC) / 2;
        float area = (float) Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
        
        if ((aMaisB && aMaisC && bMaisC) == false) {
            System.out.println("Triangulo invalido");
        }
        else {
            System.out.printf("%.2f\n", area);
        }
        
        scan.close();
    }
}
