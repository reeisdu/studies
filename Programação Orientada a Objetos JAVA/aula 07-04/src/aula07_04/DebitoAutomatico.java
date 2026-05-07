package aula07_04;

public class DebitoAutomatico {
	private Cliente cliente;
	private DadosBancarios dados;
	
	public DebitoAutomatico (Cliente cliente, DadosBancarios dados) {
		this.cliente = cliente;
		this.dados = dados;
	}
	
	public void realizarDebito(double valor) {
		if (cliente.isCadastrado()) {
			dados.validarDadosBancario();
			System.out.println("Debito Automatico Realizado no valor R$" + valor);
		} else {
			System.out.println("Cliente não Cadastrado");
		}
	}
}
