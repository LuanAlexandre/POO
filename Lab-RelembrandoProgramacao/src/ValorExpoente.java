/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axlre
 */
import java.util.Scanner;

public class ValorExpoente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int number = scan.nextInt();
        int sum = 0;
        int kTerm = 1;
        
        if (number == 1) kTerm = 1;
        else {
            while (sum <= number) {
                kTerm++;
                sum += Math.pow(2, kTerm);
            }
        }
        
        System.out.printf("%d\n", kTerm);
        
        scan.close();
    }
}
