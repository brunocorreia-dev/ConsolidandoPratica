package exercicios.primos;

public class TesteNumerosPrimos {
    public static void main(String[] args) {
        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSePrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);

    }

    public static interface ConversaoFinanceira {
        void converterDolarParaReal (double valorDolar);
    }

    public static class ConversorMoeda implements ConversaoFinanceira {

        @Override
        public void converterDolarParaReal(double valorDolar) {
            double cotacaoDolar = 4.80;
            double valorReal = valorDolar * cotacaoDolar;
            System.out.println("O valor em real é: " + valorReal);
        }
    }
}
