/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axlre
 */
import java.util.Scanner;

public class RaizDois {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int nTerm = scan.nextInt();
        double twoRoot = 0;
        double cycle = 1.0 / (2.0 + 1.0);
        
        for (int i=0; i < nTerm; i++) {
            if (i == 0) twoRoot = cycle;
            else {
                twoRoot =  1.0 / (2.0 + twoRoot);
            }
            System.out.printf("%.14f\n", 1.0 + twoRoot);
        }
        
        scan.close();
    }
}
