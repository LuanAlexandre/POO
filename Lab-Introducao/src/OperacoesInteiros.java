import java.util.Scanner;

public class OperacoesInteiros {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int values[] = new int[100];
		int valuesSize = values.length;
		
		//Caso Base - O primeiro vetor e vazio
		int first = scan.nextInt();
		
		if (first == -1) {
			System.out.println(0); //Quantidade de elementos
			System.out.println(0); //Pares
			System.out.println(0); //Impares
			System.out.println(0); //Soma total
			System.out.println("Can't divide by zero"); //Media
			System.out.println(0); //Maior
			System.out.println(0); //Menor
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
			
			int countValues = 0, countPairs = 0, countOdds = 0, sum = 0;
			int biggest = Integer.MIN_VALUE, less = Integer.MAX_VALUE;
			float average;
			
			//
			for (int i=0; i < valuesSize; i++) {
				
				if (values[i] != -1) {
					countValues++; //conta quantos numeros o vetor possui
					sum += values[i]; //realiza a soma dos valores do vetor
					if (values[i] % 2 == 0) countPairs++; //conta quantos numeros sao pares
					else countOdds++; // conta quantos numeros sao impares
					
					if (values[i] <= less) less = values[i];
					if (values[i] >= biggest) biggest = values[i];
					
				}
				else {
					if (countValues != 0) {
						average = sum / countValues; //calcula a media dos valores
	
						System.out.printf("%d\n", countValues);
						System.out.printf("%d\n", countPairs);
						System.out.printf("%d\n", countOdds);
						System.out.printf("%d\n", sum);
						System.out.printf("%.2f\n", average);
						System.out.printf("%d\n", biggest);
						System.out.printf("%d\n", less);
						
						countValues = 0;
						countPairs = 0;
						countOdds = 0;
						sum = 0;
						biggest = Integer.MIN_VALUE;
						less = Integer.MAX_VALUE;
					}
				}
			}
		}
	
		scan.close();
	}
}
