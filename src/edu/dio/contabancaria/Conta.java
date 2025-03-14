package edu.dio.contabancaria;

import java.text.MessageFormat;
import java.util.Scanner;

public class Conta {
    String agencia = "";
    int numero = 0;
    String nomeCliente = "";
    double saldo = 0.00;

    public void imprimeMensagem() {
        String mensagem = MessageFormat.format(
                "\n Olá {0}, obrigado por criar uma conta em nosso banco, sua agência é {1}, conta {2} e seu saldo {3} já está disponível para saque\".",
                nomeCliente, agencia, numero, saldo);
        System.out.println(mensagem);
    }

    // Inicia scanner
    Scanner scanner = new Scanner(System.in);

    public void inicializarAgencia() {
        System.out.println("\nPor favor, digite o número da Agência!");
        agencia = scanner.nextLine();
    }

    public void inicializarConta() {
        System.out.println("Por favor, digite o número da Conta!");
        numero = scanner.nextInt();
    }
}
