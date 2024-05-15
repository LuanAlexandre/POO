/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luan-dev
 */
import java.util.Scanner;

public class AproximacaoPi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double PI = 3;
        double first = 2;
        double valuePlusOne = first + 1;
        double valuePlusTwo = first + 2;
        double value = scan.nextDouble();
        
        if (value == 1) System.out.printf("%.6f\n", PI);
        else {
            for (int i=1; i <= value; i++) {
                if (i == 1) System.out.printf("%.6f\n", PI);
                else {
                    if (i % 2 == 0) PI = PI + (4/(first*valuePlusOne*valuePlusTwo));
                    else PI = PI - (4/(first*valuePlusOne*valuePlusTwo));
                    first = valuePlusTwo;
                    valuePlusOne = first+1;
                    valuePlusTwo = first+2;
                    System.out.printf("%.6f\n", PI);
                }
                
            }
        }
        
        
        
        scan.close();
    }
}
