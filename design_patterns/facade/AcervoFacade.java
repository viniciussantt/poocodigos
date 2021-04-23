package oFacade;

import oAcervo.Itens;
import oAcervo.Livros;
import oAcervo.Pedido;

public class AcervoFacade {
    private Livros livro;
    private Itens item;
    private Pedido pedido;

    public AcervoFacade(){
        this.livro = new Livros();
        this.item = new Itens();
        this.pedido = new Pedido();

    }

    public Livros getLivro() {
        return livro;
    }

    public void setLivro(Livros livro) {
        this.livro = livro;
    }

    public Itens getItem() {
        return item;
    }

    public void setItem(Itens item) {
        this.item = item;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void incluirPedido(Livros livro, Itens item, Pedido pedido) throws Exception {
        System.out.println("Incluindo o Pedido...\n");

        livro.cadastrarProduto();
        item.cadastrarItem();
        pedido.cadastrarPedido();

        System.out.println("\nPedido foi incluído!");
    }
}
