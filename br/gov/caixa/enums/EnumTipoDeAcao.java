package br.gov.caixa.enums;

public enum EnumTipoDeAcao {
    SACAR(1),
    DEPOSITAR(2),
    TRANSFERIR(3),
    INVESTIR(4),
    CONSULTARSALDO(5);

    private int opcao;

    EnumTipoDeAcao(int opcao) {
        this.opcao = opcao;
    }

    public int getAcao() {
        return opcao;
    }
}
