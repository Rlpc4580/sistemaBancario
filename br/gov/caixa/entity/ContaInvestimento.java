package br.gov.caixa.entity;

import br.gov.caixa.enums.EnumStatus;
import br.gov.caixa.enums.EnumTipoDeAcao;

import java.util.Date;
import java.util.List;

public class ContaInvestimento extends Conta {

    public ContaInvestimento(int idConta, double saldoConta, List<String> historicoDeAcoes, Date dataDeAtualizacao,
                             EnumStatus status, int idCliente, EnumTipoDeAcao tipoDeAcao, Cliente titular) {
        super(idConta, saldoConta, historicoDeAcoes, dataDeAtualizacao, status, idCliente, tipoDeAcao, titular);
    }


    @Override
    public boolean sacar() {
        return true;
    }

    @Override
    public boolean sacar(double valor) {
        return false;
    }

    @Override
    public double depositar() {
        return 100;
    }

    @Override
    public double transferir() {
        return 100;
    }

    @Override
    public double consultarSaldo() {
        return 100;
    }

    @Override
    public void associarTitular() {

    }

    @Override
    public int setIdConta() {
        return 0;
    }

    @Override
    public void associarTitular(Cliente cliente3, Conta contaCorrente) {

    }

    @Override
    public void exibirHistorico() {

    }

    @Override
    public void depositar(double v) {

    }
}



