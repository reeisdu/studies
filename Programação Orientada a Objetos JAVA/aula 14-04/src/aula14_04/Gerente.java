package aula14_04;

public class Gerente extends Funcionario{
	
	double bonus;
	String nome;
	
	void exibirDados() {
		System.out.println("Nome" + nome);
		System.out.println("Salário" + salario);
		System.out.println("Bônus" + bonus);
	}
}
