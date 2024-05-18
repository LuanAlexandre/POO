/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axlre
 */
import java.util.Scanner;

public class TimeFutebol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int values[] = new int[100];
        int value;
        int countFlags = 0;
        int index = -1;
        int wins = 0;
        int loses = 0;
        int draws = 0;
        int mid;
        
        while (countFlags < 2) {
            index++;
            value = scan.nextInt();
            values[index] = value;
            if (value == -1) countFlags++;
        }
        
        mid = index / 2;
        
        for (int i=0; i < mid; i++) {
            if (values[i] < values[mid+i+1]) loses++;
            else if (values[i] > values[mid+i+1]) wins++;
            else draws++;
        }
        
        System.out.printf("%d %d %d\n", wins, draws, loses);
        
        scan.close();
    }
}
