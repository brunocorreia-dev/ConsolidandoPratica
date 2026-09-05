package API;

import java.io.FileWriter;
import java.io.IOException;

public class EscritaArquivo {
    static void main(String[] args) {
        try (FileWriter escritor = new FileWriter("arquivo.txt")) {
            escritor.write("Conteúdo a ser gravado no arquivo.");
        } catch (IOException e) {
            System.out.println("Erro ao gravar arquivo: " + e.getMessage());
        }
    }
}
