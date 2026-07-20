package exercicios.calculavel;

public class TesteProduto {
    public static void main(String[] args) {
        Livro livro = new Livro(
                "Java: Como programar",
                100.00,
                "Paul Deitel"
        );

        ProdutoFisico produtoFisico = new ProdutoFisico(
                "Teclado",
                200.00
        );

        System.out.printf(
                "Preço final do livro: R$ %.2f%n",
                livro.calcularPrecoFinal()
        );

        System.out.printf(
                "Preço final do produto físico: R$ %.2f%n",
                produtoFisico.calcularPrecoFinal()
        );
    }
}
