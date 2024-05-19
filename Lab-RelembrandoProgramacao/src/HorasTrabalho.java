/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axlre
 */
import java.util.Scanner;

public class HorasTrabalho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[][] hours = new int[100][7];
        int readFlag = 0;
        int worker = 0, hoursWorker = 0;
        int dayHours;
        int countDayHours = 0;
        int totalHours = 0;
        
        while (readFlag == 0) {
            dayHours = scan.nextInt();
            if(dayHours == -1) readFlag++;
            hours[worker][hoursWorker] = dayHours;
            hoursWorker++;
            countDayHours++;
            if(countDayHours == 7) {
                countDayHours = 0;
                hoursWorker = 0;
                worker++;
            }
        }
        
        for (int i=0; i < worker; i++) {
            for (int j=0; j < 7; j++) {
                totalHours += hours[i][j];
            }
            System.out.printf("%d\n", totalHours);
            totalHours = 0;
        }
        
        scan.close();
    }
}
