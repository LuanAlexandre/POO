/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axlre
 */
import java.util.Scanner;

public class DistanciaAviao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[][] distance = {
            {0,2,11,6,15,11,1},
            {2,0,7,12,4,2,15},
            {11,7,0,11,8,3,13},
            {6,12,11,0,10,2,1},
            {15,4,8,10,0,5,13},
            {11,2,3,2,5,0,14},
            {1,15,13,1,13,14,0},
        };
        int[] cities = new int[100];
        int city;
        int flag = 0;
        int index = -1;
        int totalDistance = 0;
        
        while (flag == 0) {
            index++;
            city = scan.nextInt();
            
            if (city == -1) {
                flag = 1;
            }
            else cities[index] = (city / 111) - 1;
        }
        
        for (int i=0; i < index-1; i++) {
            totalDistance += distance[cities[i]][cities[i+1]];
        }
        
        System.out.printf("%d\n", totalDistance);
        
        scan.close();
    }
}
