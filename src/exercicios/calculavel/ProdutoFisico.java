package exercicios.calculavel;

public class ProdutoFisico extends Produto implements Calculavel{
    public ProdutoFisico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.05;
    }
}
