package oAcervo;

public class Pedido {
    private String nomeCliente;
    private String cpf;
    private Itens item;

    public Pedido() {}

    public Pedido(String nomeCliente, String cpf, Itens item){
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.item = item;

    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void cadastrarPedido() throws Exception {
        if (this.cpf.equals("0") || this.cpf.equals("000.000.000-00")){
            throw new Exception("CPF é inválido!");
        }
        System.out.println("---- Registro de Pedido ----");
        System.out.println("Nome do cliente: " + this.nomeCliente);
        System.out.println("CPF do cliente: " + this.cpf);
        System.out.println("Itens: ");
        System.out.println(item.cadastrarItem());

    }
}
