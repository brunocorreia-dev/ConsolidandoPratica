package lacosForAndWhile;

public class PulandoNumeros5 {
    public static void main(String[] args) {
        System.out.println("Números de 1 a 100, pulando os múltiplos de 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
