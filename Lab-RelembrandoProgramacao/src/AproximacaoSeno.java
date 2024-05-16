/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axlre
 */
import java.util.Scanner;

public class AproximacaoSeno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double angle = scan.nextDouble();
        double kTerm = scan.nextDouble();
        angle = Math.toRadians(angle);
        double sen = 0;
        double exp = 1;
        double den;
        
        for (double i=1; i <= kTerm; i++) {
            if (i % 2 != 0) {
                den = fatorial(exp);
                sen = sen + Math.pow(angle, exp) / den;
                exp += 2;
            }
            else {
                den = fatorial(exp);
                sen = sen - Math.pow(angle, exp) / den;
                exp += 2;
            }
            System.out.printf("%.10f\n", sen);
        }        
        
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
