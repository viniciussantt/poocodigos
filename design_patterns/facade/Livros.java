package oAcervo;

public class Livros {
    private int id;
    private String nome;

    public Livros() {}

    public Livros(int id, String nome){
        this.nome = nome;
        this.id = id;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void cadastrarProduto(){
        this.id = getId();
        this.nome = getNome();

    }
}
