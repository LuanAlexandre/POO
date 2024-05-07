import java.util.Scanner;

public class AreaPoligono {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int countFlags = 0;
		int index = 0;
		float vertices[] = new float[100];
		float vertice;
		float area;
		float sum = 0f;
		
		while (countFlags < 2) {
			vertice = scan.nextFloat();
			
			if (vertice == -1) countFlags++;
			if (countFlags < 2 ) {
				vertices[index] = vertice;
				index++;				
			}
			
		}
		
		
		int half = index / 2;
		int lastVertice = half - 2;
		
		for (int i=0; i <= lastVertice; i++) {
			sum += ((vertices[i+1] + vertices[i]) * (vertices[half+i+2] - vertices[half+i+1]));
		}
		
		area = Math.abs(sum) / 2;
		
		System.out.printf("%.4f", area);
		
		scan.close();
	}
}
