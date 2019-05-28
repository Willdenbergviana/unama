package br.unama.sistemarepresentacao;

public class Vendedor {
    private int cpf;
    private String nome;
    private String funcao;
    private int contato;
    private int matricula;

    public Vendedor(int cpf, String nome, String funcao, int contato, int matricula) {
        this.cpf = cpf;
        this.nome = nome;
        this.funcao = funcao;
        this.contato = contato;
        this.matricula = matricula;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getContato() {
        return contato;
    }

    public void setContato(int contato) {
        this.contato = contato;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void cadastraCliente(){
    }

    public void cadastraProduto(){
    }

    public void emitePedido (){

    }

}
