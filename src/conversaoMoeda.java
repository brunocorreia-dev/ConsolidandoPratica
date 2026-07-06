public class conversaoMoeda {
    public static void main(String[] args) {
        double valorEmDolar = 800.50;
        double taxaDeConversao = 4.94;
        double  valorEmReais = valorEmDolar * taxaDeConversao;

        String mensagem = "O valor em reais é R$" + valorEmReais;

        System.out.println(mensagem);




    }
}
