package lacosForAndWhile;

import java.util.Scanner;

public class PositivosNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;

        System.out.println("Digite vários numeros (um por vez).");
        System.out.println("Digite 'fim' para encerrar a entrada de números.");

        while (true) {

            System.out.println("Digite um número: ");
            String entrada = scanner.nextLine();
            if (entrada.equals("fim")) {
                break;

            }

            try {

                int numero = Integer.parseInt(entrada);
                if (numero > 0) {
                    positivos++;
                } else if (numero < 0) {
                    negativos++;
                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número válido ou 'fim' para encerrar.");
            }
        }

        System.out.println("\nResultado: ");
        System.out.println("Quantidade de números positivos: " + positivos);
        System.out.println("Quantidade de números negativos: " + negativos);
        System.out.println("Quantidade total de números: " + (positivos + negativos));

        scanner.close();
    }
}
