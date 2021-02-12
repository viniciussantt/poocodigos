package atividadecris;

//código by Vinícius Santana de Oliveira
public class Vacina {
	private String nome;
	private int lote;
	private String dataVencimento;
	private String dataAplicacao;
	
	public Vacina(String nome, int lote, String dataVencimento) {
		this.nome = nome;
		this.lote = lote;
		this.dataVencimento = dataVencimento;
	}
	
	public int getLote() {
		return lote;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDataAplicacao() {
		return dataAplicacao;
	}
	
	public String getDataVencimento() {
		return dataVencimento;
	}
	
	public void aplicar(String dataAplicacao) {
		
		this.dataAplicacao = dataAplicacao;
		
	}
	
	public void imprimir() {
		if (this.dataAplicacao == null) {
			System.out.println("VACINAS DISPONÍVEIS EXISTENTES: ");
			System.out.println("Nome: " + getNome());
			System.out.println("Data de vencimento: " + getDataVencimento());
			System.out.println();
		}
	}
}
