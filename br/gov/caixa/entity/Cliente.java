package br.gov.caixa.entity;

import br.gov.caixa.enums.EnumClassificacao;
import br.gov.caixa.enums.EnumStatus;

public class Cliente {

    public Cliente(String nome, EnumClassificacao classificacao) {
        this.nome = nome;
        this.classificacao = classificacao;
    }

    public Cliente(int idCliente, EnumClassificacao classificacao, String nome, String dataDeCadastro, EnumStatus status) {
        this.idCliente = idCliente;
        this.classificacao = classificacao;
        this.nome = nome;
        this.dataDeCadastro = dataDeCadastro;
        this.status = status;
    }

    protected int idCliente; // (CPF / CNPJ);
    protected EnumClassificacao classificacao;
    protected String nome;
    protected String dataDeCadastro;
    protected EnumStatus status;
    protected Conta conta; // Atributo para representar a conta-corrente

    public Cliente() {

    }

    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public EnumClassificacao getClassificacao() {
        return classificacao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataDeCadastro() {
        return dataDeCadastro;
    }
    public void setDataDeCadastro(String dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }
    public EnumStatus getStatus() {
        return status;
    }
    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }
    // Método para associar uma conta a um cliente
    public void associarConta(Conta conta) {
        this.conta = conta;
    }
}





