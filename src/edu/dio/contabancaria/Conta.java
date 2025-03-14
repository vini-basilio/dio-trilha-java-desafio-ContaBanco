package edu.dio.contabancaria;

import java.text.MessageFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Conta {
    String agencia = "";
    int numero = 0;
    String nomeCliente = "";
    double saldo = 0.00;
    Scanner scanner;

    public void iniciarScanner() {
        scanner = new Scanner(System.in);
    }

    public void imprimeMensagem() {
        String mensagem = MessageFormat.format(
                "\nOlá {0}, obrigado por criar uma conta em nosso banco, sua agência é {1}, conta {2} e seu saldo {3,number,#.00} já está disponível para saque.",
                nomeCliente, agencia, numero, saldo);
        System.out.println(mensagem);
    }

    public void inicializarAgencia() {

        System.out.println("\nPor favor, digite o número da Agência!");
        agencia = scanner.nextLine();

    }

    public void inicializarConta() {

        System.out.println("Por favor, digite o número da Conta!");

        while (true) {
            try {
                numero = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Digite um número inteiro.");
                scanner.nextLine();
            }

        }

    }

    public void inicializarCliente() {

        System.out.println("Por favor, digite o nome do Cliente!");
        nomeCliente = scanner.nextLine();
        nomeCliente = nomeCliente.toUpperCase();

    }

    public void inicializarSaldo() {

        System.out.println("Por favor, digite o Saldo da Conta!");
        while (true) {
            try {
                saldo = scanner.nextDouble();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Digite um número com vírgula.");
                scanner.nextLine();
            }

        }

    }

    public void fecharScanner() {
        scanner.close();
    }

}
