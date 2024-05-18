/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axlre
 */
import java.util.Scanner;

public class Mediana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] values = new int[100];
        int value = scan.nextInt();
        int index = -1;
        float mediana;
        
        while (value != -1) {
            index++;
            values[index] = value;
            value = scan.nextInt();
        }
        
        if (index % 2 != 0) {
            mediana = (float) (values[index/2] + values[index/2 + 1]) / 2;
        }
        else {
            mediana = values[index/2];
        }
        
        System.out.printf("%.1f\n", mediana);
        
        scan.close();
    }
}
