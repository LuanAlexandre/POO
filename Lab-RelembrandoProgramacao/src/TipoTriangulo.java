/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luan-dev
 */
import java.util.Scanner;

public class TipoTriangulo {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float aSide = scan.nextFloat();
        float bSide = scan.nextFloat();
        float cSide = scan.nextFloat();
        float aPlusB = aSide + bSide;
        float aPlusC = aSide + cSide;
        float bPlusC = bSide + cSide;
        boolean aPlusBMoreThanC = aPlusB > cSide;
        boolean aPlusCMoreThanB = aPlusC > bSide;
        boolean bPlusCMoreThanA = bPlusC > aSide;
        
        if (aSide  <= 0 || bSide <= 0 || cSide <= 0 || aPlusBMoreThanC == false || aPlusCMoreThanB == false || bPlusCMoreThanA == false) {
            System.out.println("invalido");
        }
        else {
            if (aSide == bSide && aSide == cSide && bSide == cSide) {
                System.out.println("equilatero");
            }
            else if (aSide == bSide || aSide == cSide || bSide == cSide){
                System.out.println("isosceles");
            }
            else if (aSide != bSide && aSide != cSide && bSide != cSide) {
                System.out.println("escaleno");
            }
        }
        
        
        scan.close();
    }
}
