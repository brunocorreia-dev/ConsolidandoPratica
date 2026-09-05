package API;

public class Veiculos {
    private String nome;
    private String categoria;
    private String fabricante;
    private String modelo;
    private int AnoFabricacao;
    private double preco;

    public Veiculos(String nome, String categoria, String fabricante, String modelo,  int AnoFabricacao, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.AnoFabricacao = AnoFabricacao;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return AnoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        AnoFabricacao = anoFabricacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
