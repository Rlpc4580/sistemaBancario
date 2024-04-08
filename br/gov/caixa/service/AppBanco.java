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

        ContaCorrente minhaConta = new ContaCorrente(123, 10000.0);
        minhaConta.setSaldoConta(10000);

//        minhaConta.sacar(30000.0);
//        minhaConta.depositar(2000.0);

//        System.out.println("Saldo atual: R$" + minhaConta.getSaldoConta());
//        minhaConta.exibirHistorico();

        System.out.println("=========================================================================================");
        System.out.println("SISTEMA BANCÁRIO - TIPOS DE AÇÕES PERMITIDAS PARA O CLIENTE !!!\n");
        System.out.println("ESCOLHA UMA DAS OPÇÕES:\n");
        System.out.println("OPÇÃO 1: SACAR\n");
        System.out.println("OPÇÃO 2: DEPOSITAR\n");
        System.out.println("OPÇÃO 3: TRANSFERIR\n");
        System.out.println("OPÇÃO 4: INVESTIR\n");
        System.out.println("OPÇÃO 5: CONSULTARSALDO\n");



//        EnumStatus statusCliente = EnumStatus.ATIVO;

//        EnumStatus statusContaCorrente = EnumStatus.INATIVO;


//        int status1 = EnumStatus.ATIVO.getValor();
//        System.out.println(status1);

//        int status2 = EnumStatus.INATIVO.getValor();
//        System.out.println(status2);

//        String s = "INATIVO";

//       EnumStatus status = EnumStatus.valueOf(s);
//        System.out.println(status.getValor());

 //       double saque = EnumTipoDeAcao.SACAR.getAcao();

        // Ler valores digitados na tela de console (entradas no sistema)
        Scanner entrada = new Scanner(System.in);


        // Controle de fluxo usando SWITCH
        switch () {
            case SACAR:
                System.out.println("Ação de SAQUE");
                System.out.println("Entre com o valor a ser sacado:");
                // Assumir o valor digitado como String
                String num = entrada.next();
                minhaConta.sacar(Double.parseDouble(num));
                System.out.println("Saldo atual: R$" + minhaConta.getSaldoConta());
                minhaConta.exibirHistorico();
                break;
            default:
                System.out.println("Precisa trabalhar bastante ainda");
        }
    }
}
