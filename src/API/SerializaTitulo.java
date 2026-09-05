package API;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SerializaTitulo {
    static void main(String[] args) {
        Titulo meuTitulo = new Titulo(
                "Clean Code",
                "Um guia sobre boas praticas de programação",
                "Tecnologia"
        );

        Gson gsonSimples = new Gson();
        System.out.println(gsonSimples.toJson(meuTitulo));

        Gson gsonBonito = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        System.out.println(gsonBonito.toJson(meuTitulo));
    }
}
