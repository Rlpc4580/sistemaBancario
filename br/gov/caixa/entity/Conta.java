package br.gov.caixa.entity;

import br.gov.caixa.enums.EnumClassificacao;
import br.gov.caixa.enums.EnumStatus;
import br.gov.caixa.enums.EnumTipoDeAcao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Conta extends Cliente{

    public Conta(int idConta, double saldoConta, List<String> historicoDeAcoes, LocalDate dataDeAtualizacao, EnumStatus status, int idCliente, EnumTipoDeAcao tipoDeAcao, Cliente titular) {
        super();
    }

    public Conta(String nome, EnumClassificacao classificacao, int idConta, double saldoConta, Cliente titular) {
        super(nome, classificacao);
        this.idConta = idConta;
        this.saldoConta = saldoConta;
        this.titular = titular;
    }

    public Conta(int idConta, double saldoConta, Date dataDeAtualizacao,
                 EnumStatus status, int idCliente, EnumTipoDeAcao tipoDeAcao, Cliente titular) {
        super();
        this.idConta = idConta;
        this.saldoConta = saldoConta;
        this.historicoDeAcoes = new ArrayList<>(); // Inicializa o histórico vazio
        this.dataDeAtualizacao = dataDeAtualizacao;
        this.status = status;
        this.idCliente = idCliente;
        this.tipoDeAcao = tipoDeAcao;
        this.titular = titular;
    }

    protected int idConta;
    protected double saldoConta;
    protected List<String> historicoDeAcoes; // Lista para armazenar o histórico de ações
    protected Date dataDeAtualizacao; // (gerada automaticamente)
    protected EnumStatus status;
    protected int idCliente; // (obrigatório)
    protected EnumTipoDeAcao tipoDeAcao;
    protected Cliente titular; // Atributo para representar o cliente titular

    protected Conta destino;

    public Conta(int idConta, double saldoConta, List<String> historicoDeAcoes, Date dataDeAtualizacao,
                 EnumStatus status, int idCliente, EnumTipoDeAcao tipoDeAcao, Cliente titular, Conta destino) {
    }

    public Conta(String nome, EnumClassificacao classificacao) {
        super(nome, classificacao);
    }

    public Conta(Cliente cliente3) {
    }

    public Conta() {

    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public List<String> getHistoricoDeAcoes() {
        return historicoDeAcoes;
    }

    public void setHistoricoDeAcoes(List<String> historicoDeAcoes) {
        this.historicoDeAcoes = historicoDeAcoes;
    }

    public Date getDataDeAtualizacao() {
        return dataDeAtualizacao;
    }

    public void setDataDeAtualizacao(Date dataDeAtualizacao) {
        this.dataDeAtualizacao = dataDeAtualizacao;
    }

    public EnumStatus getStatus() {
        return status;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public EnumTipoDeAcao getTipoDeAcao() {
        return tipoDeAcao;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public abstract boolean sacar();

    public abstract boolean sacar(double valor);

    public abstract double depositar();

    public abstract double transferir();

    public abstract double consultarSaldo();

    public abstract void associarTitular();

    // Método para associar um cliente a uma conta
    public void associarTitular(Cliente cliente) {
        this.titular = cliente;
    }

//    public double sacar(double valor) {
//        return valor;
//    }

    public abstract int setIdConta();

    public abstract void associarTitular(Cliente cliente3, Conta contaCorrente);

    public abstract void exibirHistorico();

    public abstract void depositar(double v);

    public abstract void transferir(double v);

    public void transferir(Conta conta2, double v) {
    }
}
