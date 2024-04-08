package br.gov.caixa.entity;

import java.util.Date;
import java.util.List;

public class AcoesRealizadas {
    private Date data;
    private String tipo;
    private double valorPretendido;
    private double valorReal;
    private String clienteOrigem;
    private String clienteDestino;
    private String observacao;

    public AcoesRealizadas(Date data, String tipo, double valorPretendido, double valorReal, String clienteOrigem, String clienteDestino, String observacao) {
        this.data = data;
        this.tipo = tipo;
        this.valorPretendido = valorPretendido;
        this.valorReal = valorReal;
        this.clienteOrigem = clienteOrigem;
        this.clienteDestino = clienteDestino;
        this.observacao = observacao;
    }
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValorPretendido() {
        return valorPretendido;
    }

    public void setValorPretendido(double valorPretendido) {
        this.valorPretendido = valorPretendido;
    }

    public double getValorReal() {
        return valorReal;
    }

    public void setValorReal(double valorReal) {
        this.valorReal = valorReal;
    }

    public String getClienteOrigem() {
        return clienteOrigem;
    }

    public void setClienteOrigem(String clienteOrigem) {
        this.clienteOrigem = clienteOrigem;
    }

    public String getClienteDestino() {
        return clienteDestino;
    }

    public void setClienteDestino(String clienteDestino) {
        this.clienteDestino = clienteDestino;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
