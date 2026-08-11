package exercicios.arrayList;

import java.util.ArrayList;

public class mainCalculo {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.raio = 5;

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 4;
        //Lista de formas
        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(circulo);
        listaFormas.add(quadrado);

        for (Forma forma : listaFormas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}
