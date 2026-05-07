package aula07_04;

public class Servicos {
	private String tipoServico;
	private double precoFixo;
	private double desconto;
	
	public Servicos (String tipoServico, double precoFixo) {
		this.tipoServico = tipoServico;
		this.precoFixo = precoFixo;
		this.desconto = 0;
	}
	
	public void aplicarDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public double calcularPrecoFinal() {
		return precoFixo - desconto;
	}

	public String getTipoServico() {
		return tipoServico;
	}
}