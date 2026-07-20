package fundamentos;

public class PrecoProduto {
    public static void main(String[] args) {
        double precoProduto = 29.99;
        int quantidade = 3;

        double total = precoProduto * quantidade;

        String mensagem = "O preço total da compra é R$" +total;

        System.out.println(mensagem);



    }
}
