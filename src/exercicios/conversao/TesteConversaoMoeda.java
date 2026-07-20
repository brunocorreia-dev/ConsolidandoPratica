package exercicios.conversao;

import java.util.Scanner;

public class TesteConversaoMoeda {
    static void main(String[] args) {

        Scanner conversaoAutomatica = new Scanner(System.in);

        ConversaoFinanceira conversor = new ConversorDeMoeda();

        System.out.print("Digite o valor em dólar (US$) que deseja converter: ");
        double valorDolar = conversaoAutomatica.nextDouble();

        conversor.converterDolarParaReal(valorDolar);

        conversaoAutomatica.close();
    }
}
