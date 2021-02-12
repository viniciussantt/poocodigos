package interfacecris;

public final class Concessionaria extends Conta{
	private int diaPag;
	private int mesPag;

	public Concessionaria(int dia, int mes, double valor) {
		super(dia, mes, valor);
	}
	
	public int getDiaPag() {
		return diaPag;
	}

	public void setDiaPag(int diaPag) {
		this.diaPag = diaPag;
	}

	public int getMesPag() {
		return mesPag;
	}

	public void setMesPag(int mesPag) {
		this.mesPag = mesPag;
	}

	public double getValorAPagar() {
		double pagVencimento = 0;

		if (getDiaPag() > this.dia || getMesPag() > this.mes) {

			pagVencimento = this.valor;

		} 
		
		return pagVencimento;
	}
	
	public String toString() {
		return "Dia: " + this.dia + "\n"
				+ "Mês: " + this.mes + "\n"
				+ "Valor: " + this.valor
				+ "Total a ser pago: " + getValorAPagar() + "\n";
	}
	
}
