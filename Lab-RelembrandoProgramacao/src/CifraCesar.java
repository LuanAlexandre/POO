/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luan-dev
 */
import java.util.Scanner;

public class CifraCesar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int displacement = scan.nextInt();
        String phrase = scan.nextLine();
        int size = phrase.length();
        char currentChar, encryptedChar;
        String encryptedPhrase = "";
        
        for (int i=1; i < size; i++) {
            currentChar = phrase.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') {
                encryptedChar = (char) (currentChar - 'a');
                encryptedChar = (char) ((encryptedChar + displacement) % 26);
                encryptedChar += 'A';
                encryptedPhrase = encryptedPhrase.concat(Character.toString(encryptedChar));
            }
            else {
                encryptedPhrase = encryptedPhrase.concat(Character.toString(currentChar));
            }
        }
        
        System.out.println(encryptedPhrase);
        
        scan.close();
    }
}
