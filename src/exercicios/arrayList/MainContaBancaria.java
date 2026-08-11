package exercicios.arrayList;

import java.util.ArrayList;

public class MainContaBancaria {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria(1009, 1850.0);
        ContaBancaria conta2 = new ContaBancaria(1010, 6750.0);
        ContaBancaria conta3 = new ContaBancaria(1200, 22550.85);

        ArrayList<ContaBancaria> listacontas = new ArrayList<>();
        listacontas.add(conta1);
        listacontas.add(conta2);
        listacontas.add(conta3);

        ContaBancaria contaMaiorSaldo = listacontas.get(0);
        for (ContaBancaria conta : listacontas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }


            System.out.println("Conta com maior saldo: " + contaMaiorSaldo.getNumeroConta());

        }
    }
}