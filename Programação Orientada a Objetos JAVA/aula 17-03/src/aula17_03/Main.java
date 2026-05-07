package aula17_03;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		System.out.println("======= Player's Register =======");
		System.out.println("Player's Name: ");
		String n = x.nextLine();
		System.out.println("Player's Age: ");
		int a = x.nextInt();
		System.out.println("Number of the Player's Shirt:  ");
		int nShirt = x.nextInt();
		
		//showData
		
		Jogador game = new Jogador(n, a, nShirt);
		game.showInfo();
		System.out.println("New Points");
		
		
	
		
	}
}
