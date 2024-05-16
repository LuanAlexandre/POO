/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luan-dev
 */
import java.util.Scanner;

public class NumeroNarcisista {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int number = scan.nextInt();
        int rest = number % 10;
        int quocient = number / 10;
        int sum = 0;
        int countDigits = 1;
        
        while (quocient > 0) {
            rest = quocient % 10;
            quocient /= 10;
            countDigits++;
        }
        
        rest = number % 10;
        quocient = number / 10;
        
        while (quocient > 0) {
            sum += Math.pow(rest, countDigits);
            rest = quocient % 10;
            quocient /= 10;
            if (quocient < 10) sum += Math.pow(quocient, countDigits);
        }
        
        if (number == sum) System.out.println("SIM");
        else System.out.println("NAO");
        
        scan.close();
    }
}
