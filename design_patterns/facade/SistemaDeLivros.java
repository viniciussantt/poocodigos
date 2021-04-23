package oMain;

import oAcervo.Itens;
import oAcervo.Livros;
import oAcervo.Pedido;
import oFacade.AcervoFacade;

public class SistemaDeLivros {
    public static void main(String[] args) throws Exception {
        AcervoFacade facade = new AcervoFacade();

        Livros livro = new Livros(1234, "Startreck");
        Itens item = new Itens(livro, 1);
        Pedido pedido = new Pedido("Vinicius", "213.123.409-05", item);

        facade.incluirPedido(livro, item, pedido);

    }

}
