/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axlre
 */
import java.util.Scanner;

public class FaltasTrabalho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] faults = new int[100];
        int readFlag = 0;
        int fault;
        int index = -1;
        int countMonday = 0;
        int countTuesday = 0;
        int countWednesday = 0;
        int countThursday = 0;
        int countFriday = 0;
        int countSaturday = 0;
        int current;
        float faultsMonday;
        float faultsTuesday;
        float faultsWednesday;
        float faultsThursday;
        float faultsFriday;
        float faultsSaturday;
        
        while (readFlag == 0) {
            index++;
            fault = scan.nextInt();
            faults[index] = fault;
            if(fault == -1) readFlag++;
        }
        
        for (int i=0; i < index; i++) {
            current = faults[i];
            switch (current) {
                case 2: countMonday++; break;
                case 3: countTuesday++; break;
                case 4: countWednesday++; break;
                case 5: countThursday++; break;
                case 6: countFriday++; break;
                case 7: countSaturday++; break;
            }
        }
        
        faultsMonday =  (float) countMonday / index * 100;
        faultsTuesday =  (float) countTuesday / index * 100;
        faultsWednesday =  (float) countWednesday / index * 100;
        faultsThursday =  (float) countThursday / index * 100;
        faultsFriday =  (float) countFriday / index * 100;
        faultsSaturday =  (float) countSaturday / index * 100;
        
        System.out.printf("%.1f %.1f %.1f %.1f %.1f %.1f\n", 
                faultsMonday,
                faultsTuesday,
                faultsWednesday,
                faultsThursday,
                faultsFriday,
                faultsSaturday);
        
        scan.close();
    }
}
