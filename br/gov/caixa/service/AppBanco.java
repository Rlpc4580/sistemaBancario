package br.gov.caixa.service;

import br.gov.caixa.entity.*;
import br.gov.caixa.enums.EnumClassificacao;
import br.gov.caixa.enums.EnumStatus;
import br.gov.caixa.enums.EnumTipoDeAcao;

import java.util.Scanner;

public class AppBanco {

    public static void main(String[] args) {

        //============== REGRAS DE NEGÓCIO =============================================================================
        //=== REGRA DE NEGÓCIO 1 - Os clientes podem ser pessoa física (PF) ou jurídica (PJ).===========================
        System.out.println("=== TESTE E IMPRESSÃO NA TELA PARA PESSOA FÍSICA =======================================");
        Cliente cliente1 = new Cliente("Roberto", EnumClassificacao.PF); // Crie um cliente PF com nome "Roberto"
        System.out.println("Tipo do Cliente 1: " + cliente1.getClassificacao());
        System.out.println("Nome do Cliente 1: " + cliente1.getNome());

        //=== TESTE PARA PJ ============================================================================================
        System.out.println("=== TESTE E IMPRESSÃO NA TELA PARA PESSOA JURÍDICA =======================================");
        Cliente cliente2 = new Cliente("BlueNet Informática", EnumClassificacao.PJ); // Crie um cliente PJ com nome "BlueNet Informática"
        System.out.println("Tipo do Cliente 2: " + cliente2.getClassificacao());
        System.out.println("Nome do Cliente 2: " + cliente2.getNome());
        //==============================================================================================================

        //=== REGRA DE NEGÓCIO 2 - Ao criar um cliente, deve ser criada uma conta-corrente vinculada a ele.=============
        System.out.println("=== TESTE E IMPRESSÃO NA TELA PARA CLIENTE E CONTA-CORRENTE VINCULADA ======================");
        Cliente cliente3 = new Cliente("Renan", EnumClassificacao.PF); // Crie um cliente PF com nome "Renan"
        ContaCorrente contaCorrente = new ContaCorrente(cliente3); // Crie uma conta-corrente vinculada ao cliente
        contaCorrente.associarTitular(cliente3, contaCorrente);
        System.out.println("Nome do Cliente 3: " + cliente3.getNome() + " " + " " + contaCorrente.getSaldoConta());

//        ContaCorrente conta1 = new ContaCorrente(123, 10000.0);
//        conta1.setSaldoConta(10000);
//
//        ContaCorrente conta2 = new ContaCorrente(123, 10000.0);
//        conta2.setSaldoConta(10000);

        ContaCorrente conta1 = new ContaCorrente(12345, 10000.0);
        conta1.setSaldoConta(10000);

        ContaCorrente conta2 = new ContaCorrente(67890, 500.0);
        conta2.setSaldoConta(500);

        // Exemplo de uso
//        Conta conta1 = new ContaCorrente(12345, 1000.0);
//        Conta conta2 = new ContaCorrente(67890, 500.0);

        // Realiza uma transferência de R$200 da conta1 para a conta2
//        conta1.transferir(conta2, 200.0);

        // Ler valores digitados na tela de console (entradas no sistema)
        Scanner entrada = new Scanner(System.in);

        System.out.println("=========================================================================================");
        System.out.println("SISTEMA BANCÁRIO - TIPOS DE AÇÕES PERMITIDAS PARA O CLIENTE !!!\n");
        System.out.println("ESCOLHA UMA DAS OPÇÕES:\n");
        System.out.println("OPÇÃO 1: SACAR\n");
        System.out.println("OPÇÃO 2: DEPOSITAR\n");
        System.out.println("OPÇÃO 3: TRANSFERIR\n");
        System.out.println("OPÇÃO 4: INVESTIR\n");
        System.out.println("OPÇÃO 5: CONSULTARSALDO\n");

        System.out.println("Digite a opçao desejada:");
        // Assumir o valor digitado como int
        int opcao = entrada.nextInt();

        // Imprimir o texto, nesse caso com formatação
        // e pulando linhas com \n
        System.out.printf("\n\n\nA opção escolhida foi %s", opcao + "\n");

        // Declaração de variável
        EnumTipoDeAcao enumTipoDeAcao = null;

        // Controle de fluxo usando IF-ELSEIF-ELSE
        if (opcao == 1) {
            enumTipoDeAcao = EnumTipoDeAcao.SACAR;
        } else if (opcao == 2) {
            enumTipoDeAcao = EnumTipoDeAcao.DEPOSITAR;
        } else if (opcao == 3) {
            enumTipoDeAcao = EnumTipoDeAcao.TRANSFERIR;
        } else if (opcao == 4) {
            enumTipoDeAcao = EnumTipoDeAcao.INVESTIR;
        } else if (opcao == 5) {
            enumTipoDeAcao = EnumTipoDeAcao.CONSULTARSALDO;
        }

        // Controle de fluxo usando SWITCH
        switch (enumTipoDeAcao) {
            case SACAR:
                System.out.println("Ação de SAQUE");
                System.out.println("Entre com o valor a ser sacado:");
                // Assumir o valor digitado como String
                String vlrSaque = entrada.next();
                conta1.sacar(Double.parseDouble(vlrSaque));
                System.out.println("Saldo atual: R$" + conta1.getSaldoConta());
                conta1.exibirHistorico();
                break;
            case DEPOSITAR:
                System.out.println("Ação de DEPÓSITO");
                System.out.println("Entre com o valor a ser depositado:");
                // Assumir o valor digitado como String
                String vlrDeposito = entrada.next();
                conta1.depositar(Double.parseDouble(vlrDeposito));
                System.out.println("Saldo atual: R$" + conta1.getSaldoConta());
                conta1.exibirHistorico();
                break;
            case TRANSFERIR:
                System.out.println("Ação de TRANSFERÊNCIA");
                System.out.println("Entre com o valor a ser transferido:");
//                // Assumir o valor digitado como String
                String vlrTransferencia = entrada.next();
                conta1.transferir(conta2, Double.parseDouble(vlrTransferencia));
                System.out.println("Saldo atual: R$" + conta2.getSaldoConta());
                conta2.exibirHistorico();
                break;
            case INVESTIR:
                System.out.println("Ação de INVESTIR");
                System.out.println("Entre com o valor a ser investido:");
                // Assumir o valor digitado como String
                String vlrInvestimento = entrada.next();
                conta1.investir(Double.parseDouble(vlrInvestimento));
                System.out.println("Saldo atual: R$" + conta1.getSaldoConta());
                conta1.exibirHistorico();
                break;
            case CONSULTARSALDO:
                System.out.println("Ação de CONSULTAR SALDO");
                System.out.println("O valor da conta no momento é de R$:");
                conta1.consultarSaldo();
                System.out.println("Saldo atual: R$" + conta1.getSaldoConta());
                conta1.exibirHistorico();
                break;
            default:
                System.out.println("Precisa trabalhar bastante ainda");
        }
    }
}
