package pacotes.comtrabalhando;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private double largura;
    private double comprimento;

    public CalculadoraSalaRetangular(double largura, double comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public double calcularArea() {
        return largura * comprimento;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (largura + comprimento);
    }
}
