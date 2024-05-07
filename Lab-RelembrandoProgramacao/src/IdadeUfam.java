/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luan-dev
 */
import java.util.Scanner;

public class IdadeUfam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int anoAtual = scan.nextInt();
        int idadeUfam = anoAtual - 1909;
        
        System.out.println("A UFAM tem " + idadeUfam + " anos de fundacao");
        
        scan.close();
    }
}
