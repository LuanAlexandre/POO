import java.util.Scanner;

public class Fahrenheit {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float celsiusTemperature = scan.nextFloat();
		float convertedTemperature = (9 * celsiusTemperature) / 5 + 32;
		
		System.out.printf("%.1f", convertedTemperature);
		
		scan.close();
	}
}
