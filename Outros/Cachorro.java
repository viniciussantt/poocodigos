package atividadecris;

import java.util.Scanner;

//código by Vinícius Santana de Oliveira
public class Cachorro {
	private String nome;
	private String raca;
	private char sexo;
	private String cor;
	private int idade;
	private double tamanho;
	private double peso;
	private int filhotes = 0;
	private Vacina[] vacinas = new Vacina[6];	
	Scanner scn = new Scanner(System.in);
	
	public Cachorro(String nome, String raca, char sexo, String cor) { 
		this.nome = nome;
		if ((sexo == 'F' || sexo == 'M') || (sexo == 'f' || sexo == 'm')) {
			this.sexo = sexo;
		}else {
			System.out.println("Digite em sexo do cachorro, somente 'F' ou 'M', ou 'f' ou 'm'!");
			System.out.println();
		}
		this.raca = raca;
		this.cor = cor;
	}
	
	public Cachorro (String nome, String raca, char sexo, String cor, double tamanho) {
		this(nome, raca, sexo, cor);
		this.tamanho = tamanho;
	}
	
	public void correr() {
		System.out.println(this.nome + " está correndo!");
		System.out.println();
	}
	
	public void latir() {
		System.out.println("Au au au!");
		System.out.println(this.nome + " está latindo!");
		System.out.println();
	}
	
	public void cavar() {
		System.out.println(this.nome + " está cavando!");
		System.out.println();
	}
	
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void comer(double quantidade) {
		this.peso += quantidade * 0.1;
	}
	
	//Achei melhor agrupar todos os getters opicionais:
	public double getTamanho() {
		return tamanho;
	}
	
	public String getNome() {
		return nome;
	}

	public String getRaca() {
		return raca;
	}

	public char getSexo() {
		return sexo;
	}

	public String getCor() {
		return cor;
	}

	public double getPeso() {
		return peso;
	}

	public int getFilhotes() {
		return filhotes;
	}

	public void crescer(int tamanho) {
		if (tamanho > this.tamanho) {
			System.out.println(this.nome + " cresceu. Está com " + tamanho + " !");
			System.out.println();
			this.tamanho = tamanho;
		}else {
			System.out.println(this.nome + " continua com o mesmo tamanho.");
			System.out.println();
		}
	}
	
	public void terFilhotes(int quantFilhotes) {
		//Sexo será M para Macho e F para Fêmea no char
		if (this.sexo == 'F' || this.sexo == 'f') {
			if (this.filhotes != 0) {
				System.out.println(this.nome + " tinha " + this.filhotes + " filhotes antes.");
				this.filhotes += quantFilhotes;
				System.out.println("Agora " + this.nome + " teve mais filhotes, está com " + this.filhotes + " filhotes em sua ninhada!");
				System.out.println();
			}else {
				this.filhotes += quantFilhotes;
				System.out.println("Parabéns! " + this.nome + " teve seus primeiros filhotes!");
				System.out.println("São: " + this.filhotes + " filhotes!");
				System.out.println();
			}
		}else { 
			System.out.println("Seu cachorro é macho, logo, não pode ter filhotes!");
			System.out.println();
		}
	}

	public void vacinar(Vacina vacina) {
		
		for (int i = 0; i < this.vacinas.length;) {
			if (this.vacinas[i] == null) {
				vacina.aplicar("30 Dezembro 2020");
				this.vacinas[i] = vacina;
				break;
			}else {
				System.out.println("A vacina " + vacina.getNome() + " não está mais disponível para "+ this.nome + "! "
						+ "Seu cachorro já é vacinado!");
				break;
			}
			
		}
		System.out.println();
	}
	
	public void imprimir() {
		System.out.println("DADOS DO CACHORRO: ");
		System.out.println("Nome: " + this.nome);
		System.out.println("Raça: " + this.raca);
		if ((sexo == 'F' || sexo == 'M') || (sexo == 'f' || sexo == 'm')) {
			System.out.println("Sexo: " + this.sexo);
		}else {
			System.out.println("Sexo não reconhecido pois digitou errado!");
		}
		System.out.println("Cor: " + this.cor);
		System.out.println("Idade: " + this.idade);
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Peso: " + this.peso);
		if (sexo == 'F' || sexo == 'f') {
			System.out.println("Filhotes: " + this.filhotes);
		}
		for (int i = 0; i < this.vacinas.length; i++) {
			if (this.vacinas[i] != null) {
				System.out.println("Histórico de Vacinas: ");
				System.out.println("Nome: " + this.vacinas[i].getNome());
				System.out.println("Data de Aplicação: " + this.vacinas[i].getDataAplicacao());
				break;
			}else {
				if (i == 5) {
					System.out.println("Sem vacinas!");
				}
			}
		}
		System.out.println();
	}	
}
