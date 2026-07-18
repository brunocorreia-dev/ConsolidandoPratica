package pacotes.comtrabalhando;

public class Conta {
    private double saldo;

    public double consultarSaldo() {
        return saldo;
    }
    public double depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito invalído");
            return saldo;
        }
        saldo = saldo + valor;
        return saldo;
    }

    public double sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido");
            return saldo;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
            return saldo;
        }
        saldo = saldo - valor;
        return saldo;
    }

}
