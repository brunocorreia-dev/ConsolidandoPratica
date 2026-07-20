package condicionais;

import java.util.Random;

public class PositivoNegativo {
    public static void main(String[] args) {
        int numero = new Random().nextInt(700) - 8000;

        System.out.println("Numero sorteado: " + numero);

        if (numero >= 0) {
            System.out.println("Esse numero é positivo");
        } else {
            System.out.println("Esse numero é negativo");
        }
    }
}
