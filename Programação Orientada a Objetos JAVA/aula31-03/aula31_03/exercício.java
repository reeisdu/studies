package aula31_03;
import java.util.Scanner;
public class exercício {

	public static void main (String[] args) {
		Scanner x = new Scanner(System.in);
		String f = "Arroz é bom!";
		
		System.out.println("Digite o o número de vezes a frase: " + f + " Será repetida?");
		int v = x.nextInt();
		
		for (int i = 1; i <= v; i++) {
			System.out.println(f);
		}
		x.close();
	}	
}