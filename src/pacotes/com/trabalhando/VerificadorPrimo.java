package pacotes.com.trabalhando;

 class VerificadorPrimo extends NumerosPrimos {
    public void verificarSePrimo (int numero) {
        if (verificarPrimalidade(numero)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + "não é primo.");
        }
    }
}
