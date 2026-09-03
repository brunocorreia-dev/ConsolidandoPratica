package API;

import java.util.Scanner;

public class DivisorWithArithmeticException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numerador: ");
        int num = sc.nextInt();

        System.out.println("Informe o denominador: ");
        int den = sc.nextInt();

        try {
            int resultado = num/den;
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não permitida.");
        }
    }
}
