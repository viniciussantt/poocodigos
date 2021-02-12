package interfacecris;

public abstract class Empregado implements Pagavel{
	protected String nome;
	protected String sobrenome;
	protected int numident;
	
	public Empregado(String nome, String sobrenome, int numident) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.numident = numident;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getNumident() {
		return numident;
	}

	public void setNumident(int numident) {
		this.numident = numident;
	}
	
}
