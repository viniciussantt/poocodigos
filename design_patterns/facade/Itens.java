package oAcervo;

import java.lang.Exception;

public class Itens {
    private Livros livro;
    private int qtd;

    public Itens() { }

    public Itens(Livros livro, int qtd){
        this.livro = livro;
        this.qtd = qtd;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Livros getLivro() {
        return livro;
    }

    public void setLivro(Livros livro) {
        this.livro = livro;
    }

    public String cadastrarItem() throws Exception {
        if (this.qtd == 0){
            throw new Exception("Esse livro está com a quantidade zerada ou negativo!");
        }
        return "ID do Livro: " + this.livro.getId() + "\n" +
                "Nome do Livro: " + this.livro.getNome() + "\n" +
                "Quantidade: " + getQtd();
    }
}
