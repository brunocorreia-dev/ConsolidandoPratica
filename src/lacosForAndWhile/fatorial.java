package lacosForAndWhile;

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        int fatorial = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número para descobrir seu fatorial: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero ; i++) {
            fatorial *= i;
        }

        System.out.printf("O Fatorial do número %d é: %d", numero, fatorial);
        scanner.close();
    }
}
