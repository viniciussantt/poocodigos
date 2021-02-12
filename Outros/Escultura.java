package atividadecris;

public class Escultura extends Obra {
	private String material;
	
	public Escultura(String codigo, String dataAquisicao, String titulo, String dimensoes, String tecnica, String material) {
		super(codigo, dataAquisicao, titulo, dimensoes, tecnica);
		this.material = material;
	}
	
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void imprimir() {
		super.imprimir();
		System.out.println("Material: " + getMaterial());
		System.out.println();
	}
}
