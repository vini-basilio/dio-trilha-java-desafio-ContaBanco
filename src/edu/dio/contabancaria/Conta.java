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

    public void inicializarAgencia() {
        // Inicia scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPor favor, digite o número da Agência!");
        agencia = scanner.nextLine();
        // Encerra scanner
        scanner.close();
    }

    public void inicializarConta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Conta!");
        numero = scanner.nextInt();
        // Encerra scanner
        scanner.close();
    }

    public void inicializarCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o nome do Cliente!");
        nomeCliente = scanner.nextLine();
        // Encerra scanner
        scanner.close();
    }

    public void inicializarSaldo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o Saldo da Conta!");
        saldo = scanner.nextDouble();
        // Encerra scanner
        scanner.close();
    }

}
