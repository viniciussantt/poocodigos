package interfacecris;

public class Comissionado extends Empregado{
	protected double vendas;
	
	public Comissionado(String nome, String sobrenome, int numident, double vendas) {
		super(nome, sobrenome, numident);
		this.vendas = vendas;
	}
	
	public double getVendas() {
		return vendas;
	}

	public void setVendas(double vendas) {
		this.vendas = vendas;
	}

	public double getValorAPagar() {
		return vendas * 0.06;
	}
	
	public String toString() {
		return "Nome: " + this.nome + "\n"
				+ "Sobrenome: " + this.sobrenome + "\n"
				+ "Numéro de Identificação: " + this.numident 
				+ "Salário a ser pago: " + getValorAPagar() + "\n";
	}
}
