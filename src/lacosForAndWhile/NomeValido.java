package lacosForAndWhile;

import java.io.FileWriter;
import java.util.Scanner;

public class NomeValido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        for (int tentativas = 3; tentativas > 0; tentativas--) {
            if (nome.length() > 2) {
                System.out.println("Nome válido: " + nome);
                System.out.println("Nome salvo com sucesso!");

                // Salva arquivo .txt
                try (FileWriter writer = new FileWriter("nomes.txt", true)) {
                    writer.write(nome + System.lineSeparator());
                } catch (Exception e) {
                    System.out.println("Erro ao salvar o nome no arquivo: " + e.getMessage());
                }
                break;

            } else {
                System.out.println("Nome inválido. O nome deve ter mais de 2 caracteres.");
                if (tentativas - 1 > 0) {
                    System.out.println("Digite seu nome novamente:");
                    nome = scanner.nextLine();
                }
            }
        }

    }
}
