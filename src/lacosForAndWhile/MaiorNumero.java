package lacosForAndWhile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <String> entrada;
        List <Integer> numeros = new ArrayList<>();
        int maiorNumero = Integer.MIN_VALUE;

        System.out.println("Digite uma sequência de números separados por espaço: ");
        entrada = Arrays.stream(scanner.nextLine().split(" ")).toList();

        for (String s : entrada) {
            numeros.add(Integer.parseInt(s));
        }

        for (int i : numeros) {
            if (i > maiorNumero){
                maiorNumero = i;
            }
        }
        System.out.println("O maior número é: " + maiorNumero);
    }
}
