/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axlre
 */
import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double valorHora = scan.nextInt();
        int horas = scan.nextInt();
        
        double salarioBruto = valorHora * horas;
        double imposto = 0.11 * salarioBruto;
        double inss = 0.08 * salarioBruto;
        double descontos = imposto + inss;
        double salarioLiquido = salarioBruto - descontos;
        
        System.out.printf("Salario bruto: R$%.2f\n", salarioBruto);
        System.out.printf("IR: R$%.2f\n", imposto);
        System.out.printf("INSS: R$%.2f\n", inss);
        System.out.printf("Total de descontos: R$%.2f\n", descontos);
        System.out.printf("Salario liquido: R$%.2f\n", salarioLiquido);
        
        scan.close();
    }
}
