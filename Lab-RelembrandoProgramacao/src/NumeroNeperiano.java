/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axlre
 */
import java.util.Scanner;

public class NumeroNeperiano {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double nTerm = scan.nextDouble();
        double e = 0;
        double den;
        
        for (double i=0; i < nTerm; i++) {
            den = fatorial(i);
            e += (1/den);
        }
        
        System.out.printf("%.6f\n", e);
        
        scan.close();
    }
    
    public static double fatorial(double number) {
        if (number == 0) return 1;
        
        double fatorial = number;
        while (number > 1) {
            fatorial = fatorial * (number - 1);
            number--;
        }
        return fatorial;
    }
}
