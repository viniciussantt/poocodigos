package atividadecris;

import java.util.ArrayList;

public class Artista {
	private String registro;
	private String nome;
	private String nacionalidade;
	private ArrayList<Obra> obras = new ArrayList<>();
	
	public Artista() { }
	
	public Artista(String registro, String nome, String nacionalidade) {
		this.registro = registro;
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}
	
	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public ArrayList<Obra> getObras() {
		return obras;
	}

	public void setObras(Obra obras) {
		this.obras.add(obras);
	}

	public void imprimir() {
		System.out.println("-------------------");
		System.out.println("DADOS DO AUTOR: ");
		System.out.println("Registro: " + getRegistro());
		System.out.println("Nome: " + getNome());
		System.out.println("Nacionalidade: " + getNacionalidade());
		System.out.println();
	}
}
