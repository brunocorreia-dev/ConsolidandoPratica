package lacosForAndWhile;

// for (inicializacao; condicao; atualizacao)

// while (enquanto)

//do while = do {
//    * bloco de codigo
//    } while (condicao)

import java.util.Arrays;
import java.util.Scanner;

public class sintaxeForWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a quantidade de degraus :");
        int degraus = leitura.nextInt();

        for (int i = 1; i <= degraus; i++) {
            System.out.println("Subindo o degrau " + i);
        }

        System.out.println("Você chegou ao topo!!");
        leitura.close();
    }
}


class Soma {
    public static void main(String[] args) {
        int [] valores = {10, 20, 30, 40, 50};
        int soma = 0;

        for (int valor : valores) {
            soma += valor;
        }
        System.out.println("A soma total das receitas é: "+ soma);
    }
}


class SomaPares {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
    }
}

class Fatorial {
    public static void main(String[] args) {
        int fatorial = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor para ver seu fatorial: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= scanner.nextInt(); i++) {
            fatorial *= i;
        }

        System.out.printf("O fatorial do número %d é: %d", numero, fatorial);
        scanner.close();

    }
}