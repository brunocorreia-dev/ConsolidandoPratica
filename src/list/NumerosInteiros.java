package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumerosInteiros {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(1);
        numeros.add(9);

        Collections.sort(numeros);

        System.out.println("Números em ordem crescente: " + numeros);
    }
}

