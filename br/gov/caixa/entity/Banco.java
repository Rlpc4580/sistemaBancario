package br.gov.caixa.entity;

public class Banco {

    private int idAgencia;
    private String nomeAgencia;

    public Banco(int idAgencia, String nomeAgencia) {
        this.idAgencia = idAgencia;
        this.nomeAgencia = nomeAgencia;
    }

    public int getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(int idAgencia) {
        this.idAgencia = idAgencia;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }
}
