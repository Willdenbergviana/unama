package br.unama.sistemarepresentacao;

public class Produto {
    private String nome;
    private Double preco;
    private int quantidade;
    private int icms;

    public Produto(String nome, Double preco, int quantidade, int icms) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.icms = icms;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getIcms() {
        return icms;
    }

    public void setIcms(int icms) {
        this.icms = icms;
    }






}
