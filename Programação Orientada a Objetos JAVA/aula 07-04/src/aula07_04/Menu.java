package aula07_04;

import java.util.Scanner;

public class Menu {
	
	public void exibirMenu(Scanner sc) {
		
		System.out.println("=== Cadastro do Cliente ===");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("CPF: ");
		String cpf = sc.nextLine();
		System.out.println("Telefone: ");
		String telefone = sc.nextLine();
		System.out.println("Endereco: ");
		String endereco = sc.nextLine();
		Cliente cliente = new Cliente(nome, cpf, telefone, endereco);
		
		System.out.println("\nEscolha o Serviço: ");
		
		System.out.println("1 - Combustível (100");
		System.out.println("2 - Lavagem (90)");
		System.out.println("3 - Estacionamento Rotativo (30)");
		System.out.println("4 - Estacionamento Mensal (300");
		int opcao = sc.nextInt();
		
		Servicos servico = null;
		switch (opcao) {
			case 1:
				servico = new Servicos ( "Combustível", 100);
				break;
			
			case 2:
				servico = new Servicos ("Lavagem", 90);
				break;
			
			case 3:
				servico = new Servicos ("Estacionamento Rotativo", 30);
				break;
			
			case 4:
				servico = new Servicos ("Estacionamento Mensal", 300);
				break;
			}	
		
		
		System.out.println("\nDeseja aplicar Desconto? (S/N)");
		String resp = sc.nextLine();
		if(resp.equalsIgnoreCase("S")){
				System.out.println("Valor do Desconto: ");
				servico.aplicarDesconto(opcao);
		}
		
		
		System.out.println("\nTipo de Cobrança: ");
		System.out.println("1 - Automatica");
		System.out.println("3 - Mensal");
		int tipo = sc.nextInt();
		String tipoCobranca = (tipo == 2) ? "Mensal" : "Automatico";
		Conta conta = new Conta( 1, tipo, tipoCobranca);
		
		
		conta.adicionarServico(servico);
		conta.imprimirConta();
		
		System.out.println("\nForma de pagamento: ");
		System.out.println("1 - á Vista!");
		System.out.println("2 - Pix!");
		System.out.println("3 - Cartão!");
		System.out.println("4 - Debito Automatico");
		int pag = sc.nextInt();
		if(pag == 4) {
			System.out.println("\n=== Dados Bancarios ===");
			System.out.println("Banco: ");
			int banco = sc.nextInt();
			System.out.println("Agencia: ");
			int agencia = sc.nextInt();
			System.out.println("Conta: ");
			int contaCorrente = sc.nextInt();
			DadosBancarios dados = new DadosBancarios(banco, agencia);
			DebitoAutomatico debito = new DebitoAutomatico(cliente, dados);
		}else {
			String tipoPagamento = "";
			switch (pag) {
			case 1: tipoPagamento = "Á vista"; break;
			
			case 2: tipoPagamento = "PIX"; break;
			
			case 3: tipoPagamento = "Cartão"; break;
			
			default:
				System.out.println("Opção Invalida!");
			}
			Pagamento pagamento = new Pagamento(tipoPagamento, conta.getValorTotal());
			pagamento.realizarPagamento();
			
		}	
	}

}