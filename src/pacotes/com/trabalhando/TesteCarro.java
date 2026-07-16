package pacotes.com.trabalhando;

public class TesteCarro {
    static void main(String[] args) {
        ModeloCarro dolphin = new ModeloCarro();

        dolphin.definirModelo("Dolphin");
        dolphin.definirDetalhes("BYD", 2023, "100% Elétrico");
        dolphin.definirPrecos(150000, 145000, 140000);

        dolphin.exibirInfo();
    }
}
