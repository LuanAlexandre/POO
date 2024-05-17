/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axlre
 */
import java.util.Scanner;

public class OperacoesInteiros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] values = new int[100];
        int first = scan.nextInt();
        int countElements = 0;
        int countPairs = 0;
        int countOdds = 0;
        int sum = 0;
        float media;
        int biggest = Integer.MIN_VALUE;
        int less = Integer.MAX_VALUE;
        
        if (first == -1) {
            System.out.println(0);
        }
        else {
            int index = 0;
            int current, previous;
            boolean empty = false;
			
            //Adiciona o primeiro valor ao vetor
            values[index] = first;
            index++;
			
            //Leitura dos proximos vetores
            while (empty == false) {
                previous = values[index - 1];
                current = scan.nextInt();
				
                empty = (current == -1) && (current == previous);
				
                values[index] = current;
                index++;
            }
            
            for (int i=0; i < index-1; i++) {
                if (values[i] != -1) {
                    countElements++;
                    if(values[i] % 2 == 0) countPairs++;
                    else countOdds++;
                    sum += values[i];
                    if(values[i] > biggest) biggest = values[i];
                    if(values[i] < less) less = values[i];
                }
                else {
                    media = (float) sum / countElements;
                    
                    System.out.printf("%d\n", countElements);
                    System.out.printf("%d\n", countPairs);
                    System.out.printf("%d\n", countOdds);
                    System.out.printf("%d\n", sum);
                    System.out.printf("%.2f\n", media);
                    System.out.printf("%d\n", biggest);
                    System.out.printf("%d\n", less);
                    
                    countElements = 0;
                    countPairs = 0;
                    countOdds = 0;
                    sum = 0;
                    biggest = Integer.MIN_VALUE;
                    less = Integer.MAX_VALUE;
                }
            }
        }
        
        
        scan.close();
    }
}
