package pacotes.comtrabalhando;

public class ConversorDeMoeda implements ConversaoFinanceira {

    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 4.80;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("Seu valor em real é: R$ " + valorReal);
    }
}
