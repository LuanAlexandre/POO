/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luan-dev
 */
import java.util.Scanner;

//Nao funciona para numeros que possuem 0 entre os digitos

public class SomaDigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int number = scan.nextInt();
        int sum = 0;
        
        while (number / 10 > 0) {
            sum += number % 10;
            number /= 10;
            if (number < 10) sum += number;
        }
        
        System.out.printf("%d\n", sum);
        
        scan.close();
    }
}
