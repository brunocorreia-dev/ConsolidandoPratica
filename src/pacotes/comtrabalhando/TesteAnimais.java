package pacotes.comtrabalhando;

public class TesteAnimais {
    public static void main(String[] args) {
        Cachorro caramelo = new Cachorro("Rex", 4, "Vira-Lata");
        System.out.println("--- Dados do cachorro ---");
        caramelo.emitirSom();
        caramelo.abanarRabo();
        System.out.println("Idade: " + caramelo.getIdade() + " anos");

        System.out.println("\n-----------------------------------\n");

        Gato persa = new Gato("Bafo", 2, "Branco");
        System.out.println("--- Dados do gato ---");
        persa.emitirSom();
        persa.arranharMoveis();
        System.out.println("idade: " + persa.getIdade() + " anos");
    }
}
