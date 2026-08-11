package exercicios.arrayList;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        Produto1 arCondicionado = new Produto1("ArCondicionado", 2500.0);
        Produto1 aquecedor = new Produto1("aquecedor", 800.0);
        Produto1 ventilador = new Produto1("ventilador", 560.0);

        ArrayList<Produto1> listaProduto = new ArrayList<Produto1>();
        listaProduto.add(arCondicionado);
        listaProduto.add(aquecedor);
        listaProduto.add(ventilador);

        double somaPrecos = 0;
        for (Produto1 produto : listaProduto) {
            somaPrecos += produto.getPrecoUnitario();
        }

        double precoMedio = somaPrecos / listaProduto.size();
        System.out.println("Preço medio: "  + precoMedio);
    }
}
