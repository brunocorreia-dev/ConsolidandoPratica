import java.util.Random;
import java.util.Scanner;

    public class JogoAdvinhacao {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            int numeroGerado = new Random() .nextInt(101);
            int tentativas = 0;
            int numeroDigitado = 0;

            while (tentativas < 10){
                System.out.println("Digite um número entre 0 e 100: ");
                numeroDigitado = leitor.nextInt();
                tentativas++;

                if (numeroDigitado == numeroGerado) {
                    System.out.println("Parabens, voce acertou o numero em " + tentativas + " tentativas");
                    break;
                } else if (numeroDigitado < numeroGerado) {
                    System.out.println("Tente um número maior ");
                } else {
                    System.out.println("Tente um numero menor");
                }

            }

            if (tentativas == 10 && numeroDigitado != numeroGerado) {
                System.out.println("Você não conseguiu acertar o numero em 10 tentativas. O numero era: " + numeroGerado);
            }
        }
    }

