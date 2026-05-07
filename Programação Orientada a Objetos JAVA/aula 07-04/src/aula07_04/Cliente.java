package aula07_04;

public class Cliente {
	private String nome;
	private String cpf;
	private String telefone;
	private String endereco;
	private boolean cadastrado;
	
	public Cliente(String nome, String cpf, String telefone, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.cadastrado = true;
	}
	
	public boolean isCadastrado() {
		return cadastrado;	
	}
	
	public String getNome() {
		return nome;
	}
	
	
	
	
}
