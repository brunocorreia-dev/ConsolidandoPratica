package pacotes.comtrabalhando;

public class TesteCalculadoraSalaRetangular {
    public static void main(String[] args) {
        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular(5.0, 8.0);

        System.out.println("Área da sala: " + sala.calcularArea() + " m²");
        System.out.println("Perímetro da sala: " + sala.calcularPerimetro() + " m²");


    }
}
