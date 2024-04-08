package br.gov.caixa.enums;

public enum EnumTipoDeAcao {
    SACAR(1),
    DEPOSITAR(2),
    TRANSFERIR(3),
    INVESTIR(4),
    CONSULTARSALDO(5);

    private int valor;

    EnumTipoDeAcao(int valor) {
        this.valor = valor;
    }

    public int getAcao() {
        return valor;
    }
}
