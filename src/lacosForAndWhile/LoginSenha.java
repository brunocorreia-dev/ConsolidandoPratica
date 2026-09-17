import java.util.Scanner;

public class LoginSenha {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        final String SENHA_CORRETA = "1234";

        System.out.println("Digite sua senha:");
        String senhaDigitada = scanner.nextLine();

        for(int tentativas = 3; tentativas > 0; tentativas--) {
            if (senhaDigitada.equals(SENHA_CORRETA)) {
                System.out.println("Acesso concedido!");
                break;
            } else {
                System.out.println("Senha incorreta. Você tem " + (tentativas - 1) + " tentativas restantes.");
                if (tentativas - 1 > 0) {
                    System.out.println("Digite sua senha novamente:");
                    senhaDigitada = scanner.nextLine();
                }
            }
            System.out.println("Acesso negado!");
        }
    }
}
