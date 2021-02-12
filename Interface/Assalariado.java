package interfacecris;

import java.util.ArrayList;

public class Assalariado extends Empregado{
	private ArrayList<Integer> horasTrabSemana = new ArrayList<Integer>();

	public Assalariado(String nome, String sobrenome, int numident) {
		super(nome, sobrenome, numident);
		
	}
	
	public ArrayList<Integer> getHorasSemanais() {
        return horasTrabSemana;
    }

    public void setHorasSemanais(Integer horasSemana) {
        this.horasTrabSemana.add(horasSemana);
    }


	public double getValorAPagar() {
		
		int hExtra = 0;
		for (int i = 0; i < horasTrabSemana.size(); i++) {
			if (horasTrabSemana.get(i) > 40) {
				hExtra += horasTrabSemana.get(i) - 40;
			}
		}
		
		return ControlePagamento.SALARIO + (hExtra * ControlePagamento.HORA);

	}
	
	public String toString() {
		return "Nome: " + this.nome + "\n"
				+ "Sobrenome: " + this.sobrenome + "\n"
				+ "Numéro de Identificação: " + this.numident 
				+ "Salário a ser pago: " + getValorAPagar() + "\n";
	}
}
