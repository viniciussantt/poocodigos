package interfacecris;

public final class Terceirizado extends Empregado{
	private int horaTrab;
	
	public Terceirizado(String nome, String sobrenome, int numident, int horaTrab) {
		super(nome, sobrenome, numident);
		this.horaTrab = horaTrab;
		
	}
	
	public int getHoraTrab() {
		return horaTrab;
	}

	public void setHoraTrab(int horaTrab) {
		this.horaTrab = horaTrab;
	}

	public double getValorAPagar() {
        return this.horaTrab * (ControlePagamento.SALARIO / 160);
    }

	public String toString() {
		return "Nome: " + this.nome + "\n"
				+ "Sobrenome: " + this.sobrenome + "\n"
				+ "Numéro de Identificação: " + this.numident 
				+ "Salário a ser pago: " + getValorAPagar() + "\n";
	}
	
	
}
