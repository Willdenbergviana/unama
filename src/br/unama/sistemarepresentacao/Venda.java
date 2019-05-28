package br.unama.sistemarepresentacao;

public class Venda {

    private String descricao;
    private String data;
    private String hora;
    private int quantidade;
    private Vendedor vendedor;
    private Produto produto;
    private Cliente cliente;

    public Venda(String descricao, String data, String hora, int quantidade, Vendedor vendedor, Produto produto, Cliente cliente) {
        this.descricao = descricao;
        this.data = data;
        this.hora = hora;
        this.quantidade = quantidade;
        this.vendedor = vendedor;
        this.produto = produto;
        this.cliente = cliente;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public void cadastraVenda(){

    }

    public void consultaVenda () {

    }


}
