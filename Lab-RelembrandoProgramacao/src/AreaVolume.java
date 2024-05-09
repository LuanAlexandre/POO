/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author master
 */
import java.util.Scanner;

public class AreaVolume {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double ray = scan.nextDouble();
        
        double area = Math.PI * Math.pow(ray, 2.0);
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(ray, 3.0);
        
        System.out.printf("Um circulo com raio de %.2f centimetros tem uma area de %.2f centimetros quadrados.\n", ray, area);
        System.out.printf("Uma esfera com raio de %.2f centimetros tem um volume de %.2f centimetros cubicos.\n", ray, volume);
        
        scan.close();
    }
}
