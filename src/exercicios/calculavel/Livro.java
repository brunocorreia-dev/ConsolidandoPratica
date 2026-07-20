package exercicios.calculavel;

public class Livro extends Produto implements Calculavel {

    private String autor;

    public Livro(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 0.90;
    }
}