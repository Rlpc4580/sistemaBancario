package br.gov.caixa.enums;

public enum EnumStatus {

    //Valores do enum
    ATIVO(1),
    INATIVO(0);

    //Atributo do enum
    private int valor;

    //Construtor privado do enum, não pode ser public, por padrão assume private
    EnumStatus(int valor) {
        this.valor = valor;
    }

    //Método que retorna o valor para quem o chamou - GET do atributo valor
    public int getValor() {
        return valor;
    }
}
