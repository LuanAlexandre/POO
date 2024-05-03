import java.util.Scanner;

public class MediaColecao {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
        float value = scan.nextFloat();
        float sum = 0;
        float media = 0;
        int count = 0;
        
        while (value != -1) {
            sum += value;
            count++;
            value = scan.nextFloat();
        }
        
        media = sum / count;
        
        System.out.printf("%.2f", media);
		
		scan.close();
	}
}
