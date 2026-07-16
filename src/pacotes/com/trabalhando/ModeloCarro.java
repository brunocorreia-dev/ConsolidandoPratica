package pacotes.com.trabalhando;

public class ModeloCarro extends Carro{
    private String marca;
    private int anoLancamento;
    private String tipoCombustivel;

    public void definirDetalhes(String marca, int anoLancamento, String tipoCombustivel) {
        this.marca = marca;
        this.anoLancamento = anoLancamento;
        this.tipoCombustivel = tipoCombustivel;
    }
    @Override
    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        super.exibirInfo();
        System.out.println("Ano de LAnçamento: " + anoLancamento);
        System.out.println("Combustível: " + tipoCombustivel);
    }
}
