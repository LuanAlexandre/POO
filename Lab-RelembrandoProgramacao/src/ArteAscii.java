/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luan-dev
 */
import java.util.Scanner;

public class ArteAscii {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int base = scan.nextInt();
        
        for (int i=base; i > 0; i--) {
            for (int j=0; j < i; j++) {
             System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i=0; i < base; i++) {
            for (int j=0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("");
        
        scan.close();
    }
}
