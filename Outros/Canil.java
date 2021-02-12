package atividadecris;

import java.util.Scanner;

public class Canil {
	
	//Código by Vinícius Santana de Oliveira

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		//Vacinas ------------------------
		Vacina v1 = new Vacina("Raiva", 202, "12 Dezembro 2021");
		Vacina v2 = new Vacina("Sarna", 203, "01 Dezembro 2022");
		Vacina v3 = new Vacina("Gripe Animal", 221, "02 Maio 2022");
		
		//Cachorros ----------------------
		Cachorro c1 = new Cachorro("Spike","Dálmata", 'M', "Preto e Branco", 61);
		Cachorro c2 = new Cachorro("Bila", "Dálmata", 'F', "Preto e Branco", 58);
		
		//Chamando métodos ---------------
		c1.setPeso(20);
		c2.setPeso(17.8);
		c1.setIdade(4);
		c2.setIdade(4);
		
		c1.cavar();
		c1.correr();
		
		c2.comer(5);
		
		c2.crescer(59);
		
		c1.latir();
		
		c2.terFilhotes(1);
		
		c1.crescer(61);
		c2.terFilhotes(1);
		
		c1.vacinar(v1);
		c2.vacinar(v3);
		
		c1.imprimir();
		c2.imprimir();
		
		c1.vacinar(v3);
		
		v1.imprimir();
		v2.imprimir();
		v3.imprimir();	
		
		
		scn.close();
	}

}
