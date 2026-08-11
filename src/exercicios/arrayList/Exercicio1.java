package exercicios.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Rafael");

        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}

//No Java, o sinal de dois-pontos (:) dentro desse loop é lido como "em" ou "de dentro de".
//
//Ele faz parte da sintaxe do For-Each (ou Enhanced For Loop), que serve para percorrer todos os elementos de uma coleção ou array de forma simples.
//Java
//
//for (String nome : nomes) {
//    System.out.println(nome);
//}
//
//A estrutura funciona assim:
//
//    String nome: Declara a variável temporária que vai guardar um item por vez.
//
//    :: Separa a variável temporária da lista que você está percorrendo.
//
//    nomes: É a lista (ou array) que contém todos os elementos.
//
//Leitura do código:
//
//    "Para cada String nome em (:) nomes, execute o bloco de código."
//
//A cada repetição (iteração) do loop, o Java pega automaticamente o próximo elemento da lista nomes e o atribui à variável nome, dispensando a necessidade de controlar índices manuais como nomes.get(i).