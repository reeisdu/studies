package aula2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		pessoa.nome = "Manu";
		pessoa.idade = 20;
		
		pessoa2.nome = "Reis";
		pessoa2.idade = 20;
		
		System.out.println("===PESSOAS===");
		pessoa.exibirMensagem();
		pessoa2.exibirMensagem();
		
		
	
		cao cao = new cao();
		cao cao2 = new cao();
		
		cao.nome = "Morgan";
		cao.raça = "Rottweiler";
		
		cao2.nome = "Cj";
		cao2.raça = "Dogue Alemão";
		
		System.out.println("===CÃES===");
		cao.exibirDados();
		cao2.exibirDados();
		
		
		
		
		
		
		
		
		
		
		
	}
}
