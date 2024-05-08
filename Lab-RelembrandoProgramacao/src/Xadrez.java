/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axlre
 */
import java.util.Scanner;

public class Xadrez {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int size = scan.nextInt();
        
        for (int j=0; j < size; j++) {
            for (int i=0; i < size; i++) {
                if(j % 2 == 0) System.out.print("* ");
                else System.out.print(" *");
            }
            System.out.println();
        }
        
        scan.close();
    }
}
