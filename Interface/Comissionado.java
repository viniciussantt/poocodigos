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
				+ "Num�ro de Identifica��o: " + this.numident 
				+ "Sal�rio a ser pago: " + getValorAPagar() + "\n";
	}
}
