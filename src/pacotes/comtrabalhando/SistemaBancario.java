package pacotes.comtrabalhando;

import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ContaCorrente conta = new ContaCorrente();

        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n===== SISTEMA BANCÁRIO =====");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Cobrar tarifa mensal");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf(
                            "Saldo atual: R$ %.2f%n",
                            conta.consultarSaldo()
                    );
                    break;

                case 2:
                    System.out.print("Digite o valor do depósito: R$ ");
                    double valorDeposito = leitura.nextDouble();

                    conta.depositar(valorDeposito);

                    System.out.printf(
                            "Saldo atual: R$ %.2f%n",
                            conta.consultarSaldo()
                    );
                    break;

                case 3:
                    System.out.print("Digite o valor do saque: R$ ");
                    double valorSaque = leitura.nextDouble();

                    conta.sacar(valorSaque);

                    System.out.printf(
                            "Saldo atual: R$ %.2f%n",
                            conta.consultarSaldo()
                    );
                    break;

                case 4:
                    conta.cobrarTarifaMensal();

                    System.out.printf(
                            "Tarifa cobrada. Saldo atual: R$ %.2f%n",
                            conta.consultarSaldo()
                    );
                    break;

                case 5:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        leitura.close();
    }
}
