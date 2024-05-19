/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axlre
 */
import java.util.Scanner;

public class PorcentagemAcerto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] studentAnswers = new int[50];
        int[] trueAnswers = new int[50];
        int answer;
        int countFlag = 0; //conta a quantidade de -1 digitados
        int indexStudent = 0;
        int indexTrue = 0;
        double hits = 0;
        
        while (countFlag < 2) {
            answer = scan.nextInt();
            if(countFlag == 0) {
                studentAnswers[indexStudent] = answer;
                indexStudent++;
            }
            if(countFlag == 1) {
                trueAnswers[indexTrue] = answer;
                indexTrue++;
            }
            if (answer == -1) countFlag++;
        }        
                
        for (int i=0; i<indexStudent-1; i++) {
            if(studentAnswers[i] == trueAnswers[i]) {
                hits++;
            }
        }
                
        System.out.printf("%.2f\n", (hits/(indexStudent-1))*100);
        
        scan.close();
    }
}
