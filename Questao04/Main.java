package Questao04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Dados iniciais da conta (o saldo começa em 0 dentro da classe)
        System.out.print("Número da conta: ");
        int numero = Integer.parseInt(sc.nextLine());

        System.out.print("Titular: ");
        String titular = sc.nextLine();

        ContaCorrente conta = new ContaCorrente(numero, titular);

        int opcao;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Consultar saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("Valor do saque: ");
                    float saque = Float.parseFloat(sc.nextLine().replace(',', '.'));
                    if (conta.sacar(saque)) {
                        System.out.println("Saque realizado!");
                    }
                    break;
                case 2:
                    System.out.print("Valor do depósito: ");
                    float deposito = Float.parseFloat(sc.nextLine().replace(',', '.'));
                    if (conta.depositar(deposito)) {
                        System.out.println("Depósito realizado!");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: R$ " + conta.consultarSaldo());
                    break;
                case 0:
                    System.out.println("Encerrando. Até logo, " + conta.getTitular() + "!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
}