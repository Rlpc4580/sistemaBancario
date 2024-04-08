package br.gov.caixa.entity;

import br.gov.caixa.enums.EnumStatus;
import br.gov.caixa.enums.EnumTipoDeAcao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContaCorrente extends Conta implements Depositar, Transferir, ConsultarSaldo, AssociarTitular, ExibirHistorico, Sacar, SetIdConta, Investir {
    public ContaCorrente(int idConta, double saldoConta, List<String> historicoDeAcoes, LocalDate dataDeAtualizacao,
                         EnumStatus status, int idCliente, EnumTipoDeAcao tipoDeAcao, Cliente titular) {
        super(idConta, saldoConta, historicoDeAcoes, dataDeAtualizacao, status, idCliente, tipoDeAcao, titular);
        idConta = gerarNumeroConta(); // Gere um número de conta, usando Random
        saldoConta = 0; // Saldo inicial
        historicoDeAcoes = new ArrayList<>(); // Inicializa o histórico vazio
        dataDeAtualizacao = LocalDate.now();
        status = EnumStatus.ATIVO;
        idCliente = 981060;
        tipoDeAcao = EnumTipoDeAcao.DEPOSITAR;
        titular = new Cliente(idCliente, classificacao, nome, dataDeCadastro, status);
    }

    public ContaCorrente(Cliente cliente3) {
        super(cliente3);
    }

    public ContaCorrente(int idConta, double saldoConta) {
        super();
    }

    private int gerarNumeroConta() {
        return  742569;
    }

//    public ContaCorrente(int idCliente, double saldoConta) {
//
//        super(idConta, saldoConta, historicoDeAcoes, dataDeAtualizacao, status, idCliente, tipoDeAcao, titular);
//    }

    @Override
    public boolean sacar() {
        return true;
    }


    // Método para sacar dinheiro
    @Override
    public boolean sacar(double valor) {
        historicoDeAcoes = new ArrayList<>(); // Inicializa o histórico vazio
        if (saldoConta >= valor) {
            saldoConta -= valor;
            historicoDeAcoes.add("Saque de R$" + valor);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double depositar() {
        return 0;
    }

    // Método para depositar dinheiro
    @Override
    public void depositar(double valor) {
        saldoConta += valor;
        historicoDeAcoes.add("Depósito de R$" + valor);
    }

//    public ContaCorrente(Cliente cliente3) {
//        super(idConta, saldoConta, historicoDeAcoes, dataDeAtualizacao, status, idCliente, tipoDeAcao, titular);
//    }

    @Override
    public int setIdConta() {
        return 458;
    }

    @Override
    public void associarTitular(Cliente cliente3, Conta contaCorrente) {
    }

    // Método para exibir o histórico de ações
    @Override
    public void exibirHistorico() {
        System.out.println("Histórico de ações:");
        for (String acao : historicoDeAcoes) {
            System.out.println(acao);
        }
    }


    private void setHistoricoDeAcoes(String s) {
    }

    // Método para exibir o histórico de ações
//    public void exibirHistorico() {
//        System.out.println("Histórico de ações:");
//
//        for (<String>historico : historico) {
//            System.out.println(h);
//        }
//    }


    // Método para sacar dinheiro
//    public boolean sacar(double valor) {
//        if (saldoConta >= valor) {
//            saldoConta -= valor;
//            getHistoricoDeAcoes().add("Saque de R$" + valor);
//            return true;
//        } else {
//            return false;
//        }
//    }


    @Override
    public double transferir() {
        return 100;
    }

    @Override
    public double investir() {
        return 100;
    }

    @Override
    public double consultarSaldo() {
        return 100;
    }

    @Override
    public void associarTitular() {

    }

    public void associarTitular(Cliente cliente3, ContaCorrente contaCorrente) {
    }
}
