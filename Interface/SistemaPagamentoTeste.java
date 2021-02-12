package interfacecris;

public class SistemaPagamentoTeste{
	 public static void main(String []args) {

	        Assalariado empregadoAssalariado = new Assalariado("Go","Filho", 1200);
	        
	        empregadoAssalariado.setHorasSemanais(40);
	        empregadoAssalariado.setHorasSemanais(42);
	        empregadoAssalariado.setHorasSemanais(43);
	        empregadoAssalariado.setHorasSemanais(40);
	        System.out.println(empregadoAssalariado);

	        Terceirizado empregadoTerceirizado = new Terceirizado("Pedro","Paulo", 112, 180);
	        System.out.println(empregadoTerceirizado);
	        
	        Comissionado empregadoComissionado = new Comissionado("Thomas","Ericssem", 14, 21793);
	        System.out.println(empregadoComissionado);

	        AssalariadoComissionado empregadoAssComission = new AssalariadoComissionado("Licnol", "Wwil", 49, 899);
	        System.out.println(empregadoAssComission);

	        Titulo contaTitulo = new Titulo(5,5,512); 
	        contaTitulo.setDiaPag(6); 
	        contaTitulo.setMesPag(5); 

	        System.out.println(contaTitulo);

	        Concessionaria contaConcess = new Concessionaria(3,5,612); 
	        System.out.println(contaConcess);

	        ControlePagamento controlePagamento = new ControlePagamento();

	        controlePagamento.setEmpregadosPagaveis(empregadoAssalariado,empregadoAssComission,empregadoTerceirizado,empregadoComissionado);
	        controlePagamento.setContasPagaveis(contaTitulo,contaConcess);

	        controlePagamento.exibirRelatorio(); 
		
	}

}
