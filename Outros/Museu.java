package atividadecris;

public class Museu {
	
	//C�digo by Vin�cius Santana de Oliveira
	public static void main(String[] args) {
		Artista a1 = new Artista("112", "Vin�cius Sante Oliveira", "Brasileiro");
		Obra ob1 = new Pintura("0202", "30 Out 2018", "A Igreja de Notredame", "20 x 30", "�leo sobre Tela", "Latex");
		Obra ob2 = new Escultura("003", "27 Jul 2018", "S�o Miguel Arcanjo", "110 x 320", "Barroco", "Madeira");
		Artista a2 = new Artista("100", "Levi Stock Vilievsk", "Russo");
		Obra ob3 = new Escultura("005", "04 Dez 2018", "A Rocha", "200 x 200", "Entalhe", "M�rmore");
		Obra ob4 = new Pintura("0254", "01 Jan 2019", "Memorial de Marte", "50 x 70", "Acr�lico", "Acr�lica");
	
		//Cada obra tem somente um Autor.
		//Autor pode ter v�rias obras.
		//Adcionando as obras ao autor
		a1.setObras(ob1);
		a1.setObras(ob2);
		a1.setObras(ob3);
		a2.setObras(ob4);
		
		a1.imprimir();
		a2.imprimir();
		
		ob1.imprimir(a1); //essa impress�o j� � suficiente para todas as obras do autor
		
		ob4.imprimir(a2);
		
		
		
	}
}
