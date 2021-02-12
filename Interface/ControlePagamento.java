package interfacecris;

import java.util.ArrayList;
import java.util.Calendar;

public class ControlePagamento {
	public static final double SALARIO = 954.00;
	public static final double HORA = 8.00;
	
	public ArrayList<Pagavel> pagavelContas = new ArrayList<Pagavel>();
	public ArrayList<Pagavel> pagavelEmpregados = new ArrayList<Pagavel>();

	public void setContasPagaveis(Titulo titulo, Concessionaria concessionaria) {
		this.pagavelContas.add(titulo);
		this.pagavelContas.add(concessionaria);
	}

	public void setEmpregadosPagaveis(Assalariado assalariado, AssalariadoComissionado assalariadoComissionado,
			Terceirizado terceirizado, Comissionado comissionado) {
		this.pagavelEmpregados.add(assalariado);
		this.pagavelEmpregados.add(assalariadoComissionado);
		this.pagavelEmpregados.add(terceirizado);
		this.pagavelEmpregados.add(comissionado);
	}

	Calendar c = Calendar.getInstance();

	public void exibirRelatorio() {
		double somaContas = 0;
		double somaEmpregados = 0;

		for (Pagavel p : pagavelContas) {
			if (p != null) {
				somaContas += p.getValorAPagar();
			}
		}

		for (Pagavel ep : pagavelEmpregados) {
			if (ep != null) {
				somaEmpregados += ep.getValorAPagar();
			}
		}
		c.add(Calendar.MONTH, 1);
		System.out.println("Relatorio Mensal");
		System.out.println("Dia: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("Mês: " + c.get(Calendar.MONTH));
		System.out.println("Ano: " + c.get(Calendar.YEAR));
		System.out.println("Resultado contas: " + somaContas);
		System.out.printf("Resultado empregados: %.2f\n", somaEmpregados);
		System.out.printf("Resultado final: %.2f", somaContas + somaEmpregados);
	}
	
}
