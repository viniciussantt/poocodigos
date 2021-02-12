package interfacecris;

public final class AssalariadoComissionado extends Comissionado{
	
	public AssalariadoComissionado(String nome, String sobrenome, int numident, double vendas) {
		super(nome, sobrenome, numident, vendas);
		
	}

	public double getValorAPagar() {
		double add = ControlePagamento.SALARIO + (ControlePagamento.SALARIO * 0.1);
		
		return add + (this.vendas * 0.06);
	}
	
	public String toString() {
		return "Nome: " + this.nome + "\n"
				+ "Sobrenome: " + this.sobrenome + "\n"
				+ "Numéro de Identificação: " + this.numident 
				+ "Salário a ser pago: " + getValorAPagar() + "\n";
	}	
}
