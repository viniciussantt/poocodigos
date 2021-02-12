package atividadecris;

public class Pintura extends Obra {
	private String tipoTinta;
	
	public Pintura(String codigo, String dataAquisicao, String titulo, String dimensoes, String tecnica, String tipoTinta) {
		super(codigo, dataAquisicao, titulo, dimensoes, tecnica);
		this.tipoTinta = tipoTinta;
	}

	public String getTipoTinta() {
		return tipoTinta;
	}

	public void setTipoTinta(String tipoTinta) {
		this.tipoTinta = tipoTinta;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Tipo da Tinta: " + getTipoTinta());
		System.out.println();
	}
	
}
