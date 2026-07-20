package exercicios.conversorTemperatura;

import java.util.Scanner;

public class TesteConversorTemperatura {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        ConversorTemperatura conversor = new ConversorTemperaturaPadrao();

        int opcao;

        do {
            System.out.println("\n=== Conversor de Temperatura ===");
            System.out.println("1 - Celsius para Fahrenheit");
            System.out.println("2 - Fahrenheit para Celsius");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = leitura.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite a temperatura em Celsius: ");
                    double celsius = leitura.nextDouble();

                    double fahrenheit =
                            conversor.celsiusParaFahrenheit(celsius);

                    System.out.printf(
                            "%.2f °C equivalem a %.2f °F%n",
                            celsius,
                            fahrenheit
                    );
                    break;

                case 2:
                    System.out.print("Digite a temperatura em Fahrenheit: ");
                    fahrenheit = leitura.nextDouble();

                    celsius =
                            conversor.fahrenheitParaCelsius(fahrenheit);

                    System.out.printf(
                            "%.2f °F equivalem a %.2f °C%n",
                            fahrenheit,
                            celsius
                    );
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        leitura.close();
    }
}