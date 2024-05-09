/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luan-dev
 */
import java.util.Scanner;

public class SomaColecoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int values[] = new int[100];
        int first = scan.nextInt();	
        int sum = 0;
        
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
                if (values[i] != -1) sum += values[i];
                else {
                    System.out.printf("%d\n", sum);
                    sum = 0;
                }
            }
        }
        scan.close();
    }
}
