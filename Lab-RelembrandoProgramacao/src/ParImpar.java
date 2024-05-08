/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axlre
 */
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int number = scan.nextInt();
        int numbers[] = new int[100];
        int index = 0;
        
        while (number != -1) {
            numbers[index] = number;
            index++;
            number = scan.nextInt();
        }
        
        for (int i=0; i < index; i++) {
            if (numbers[i] % 2 == 0) System.out.println("PAR");
            else System.out.println("IMPAR");
        }
        
        scan.close();
    }
}
