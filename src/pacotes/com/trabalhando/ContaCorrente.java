package pacotes.com.trabalhando;

public class ContaCorrente extends Conta {
    private double tarifaMensal = 0.15;

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal (double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }
    public void cobrarTarifaMensal() {
        sacar(tarifaMensal);
    }

}

