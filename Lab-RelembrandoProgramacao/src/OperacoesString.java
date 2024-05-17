/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luan-dev
 */
import java.util.Scanner;

public class OperacoesString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String phrase = scan.nextLine();
        
        int size = phrase.length();
        char[] phraseVec = phrase.toCharArray();
        char first = phraseVec[0];
        char last = phraseVec[size-1];
        String upperCase = phrase.toUpperCase();
        String lowerCase = phrase.toLowerCase();
        String replaceAByE = phrase.replaceAll("a", "e");
        int countVogals = 0;
        
        System.out.println(size);
        System.out.println(first);
        System.out.println(last);
        System.out.println(upperCase);
        System.out.println(lowerCase);
        System.out.println(replaceAByE);
        
        for (int i=0; i<size; i++) {
            if(i % 2 == 0) {
                System.out.print(phraseVec[i]);
            }
            
            switch (phraseVec[i]) {
                case 'a': countVogals++; break;
                case 'e': countVogals++; break;
                case 'i': countVogals++; break;
                case 'o': countVogals++; break;
                case 'u': countVogals++; break;
                case 'A': countVogals++; break;
                case 'E': countVogals++; break;
                case 'I': countVogals++; break;
                case 'O': countVogals++; break;
                case 'U': countVogals++; break;
            }
            
            if(i == size - 1) System.out.println();
        }
        
        System.out.println(countVogals);
        
        scan.close();
    }
}
