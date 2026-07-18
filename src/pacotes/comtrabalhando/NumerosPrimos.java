package pacotes.comtrabalhando;

 class NumerosPrimos {
    public boolean verificarPrimalidade(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void listarPrimos (int limiteSuperior) {
        System.out.println("Números primos até " + limiteSuperior + ": ");
        for (int i = 2; i <= limiteSuperior; i++) {
            if (verificarPrimalidade(i)) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }

     public static class ModeloCarro extends Carro{
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
 }
