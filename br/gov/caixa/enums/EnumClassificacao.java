package br.gov.caixa.enums;

public enum EnumClassificacao {
    PF(1),
    PJ(2);

    //Atributo do enum
    private int valor1;

    //Construtor privado do enum, não pode ser public, por padrão assume private
    EnumClassificacao(int valor1) {
        this.valor1 = valor1;
    }

    //Método que retorna o valor para quem o chamou - GET do atributo valor
    public int getValor() {
        return valor1;
    }
}
