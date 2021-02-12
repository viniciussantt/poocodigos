package atividadecris;

public class Obra {
	protected String codigo;
	protected String dataAquisicao;
	protected String titulo;
	protected String dimensoes;
	protected String tecnica;
	protected Artista autor;
	
	public Obra(String codigo, String dataAquisicao, String titulo) {
		this.codigo = codigo;
		this.dataAquisicao = dataAquisicao;
		this.titulo = titulo;
		
	}
	
	public Obra(String codigo, String dataAquisicao, String titulo, String dimensoes, String tecnica) {
		this(codigo, dataAquisicao, titulo);
		this.dimensoes = dimensoes;
		this.tecnica = tecnica;
	}
	
	public Obra() { }
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDataAquisicao() {
		return dataAquisicao;
	}

	public void setDataAquisicao(String dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDimensoes() {
		return dimensoes;
	}

	public void setDimensoes(String dimensoes) {
		this.dimensoes = dimensoes;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public Artista getAutor() {
		return autor;
	}

	public void setAutor(Artista autor) {
		this.autor = autor;
	}

	public void imprimir() {
		System.out.println("-------------------");
		System.out.println("DADOS DA OBRA:");
		System.out.println("Código: " + getCodigo());
		System.out.println("Data de Aquisição: " + getDataAquisicao());
		System.out.println("Título: " + getTitulo());
		System.out.println("Dimensões: " + getDimensoes());
		System.out.println("Técnica: " + getTecnica());
		
	}
	
	public void imprimir(Artista autor) {
		System.out.println("--------------------");
		if (getAutor() != null && autor.getNome() != null) {
			System.out.println("DADOS DA OBRA DE " + getAutor().getNome());
		}
		if (getAutor() != null && autor.getObras() != null) {
			for (Obra obras : autor.getObras()) {
				System.out.println("Código: " + obras.getCodigo());
				System.out.println("Data de Aquisição: " + obras.getDataAquisicao());
				System.out.println("Título: " + obras.getTitulo());
				System.out.println();
			}
			System.out.println("--------------------");
			System.out.println();
		}
	}
}
