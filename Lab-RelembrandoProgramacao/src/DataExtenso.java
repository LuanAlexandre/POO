/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luan-dev
 */
import java.util.Scanner;

public class DataExtenso {
       public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
           
           int date = scan.nextInt();
           String dateStr = Integer.toString(date);
           String dayStr = dateStr.substring(0, 2);
           String monthStr = dateStr.substring(2, 4);
           String yearStr = dateStr.substring(4, 8);
           int day = Integer.parseInt(dayStr);
           int year = Integer.parseInt(yearStr);
           
           switch (monthStr) {
               case "01": monthStr = "janeiro"; break;
               case "02": monthStr = "fevereiro"; break;
               case "03": monthStr = "março"; break;
               case "04": monthStr = "abril"; break;
               case "05": monthStr = "maio"; break;
               case "06": monthStr = "junho"; break;
               case "07": monthStr = "julho"; break;
               case "08": monthStr = "agosto"; break;
               case "09": monthStr = "setembro"; break;
               case "10": monthStr = "outubro"; break;
               case "11": monthStr = "novembro"; break;
               case "12": monthStr = "dezembro"; break;
           }
           
           System.out.printf("%d de %s de %d\n", day, monthStr, year);           
           
           scan.close();
       }
}
