package pacotes.comtrabalhando;

public class TesteCarro {
    static void main(String[] args) {
        NumerosPrimos.ModeloCarro dolphin = new NumerosPrimos.ModeloCarro();

        dolphin.definirModelo("Dolphin");
        dolphin.definirDetalhes("BYD", 2023, "100% Elétrico");
        dolphin.definirPrecos(150000, 145000, 140000);

        dolphin.exibirInfo();
    }
}
