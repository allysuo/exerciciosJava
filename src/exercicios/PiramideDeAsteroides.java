/*
Pirâmide de asteriscos.
Utilizando for aninhado (laço dentro de laço) e if para controlar
espaços, monte uma pirâmide de asteriscos (*) com N linhas.
*/
package exercicios;
import java.util.Scanner;

public class PiramideDeAsteroides {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas da pirâmide (N): ");
        int n = scanner.nextInt();

        // Laço externo: controla qual linha estamos desenhando (de 1 até N)
        for (int i = 1; i <= n; i++) {

            // Laço interno 1: imprime os espaços em branco antes dos asteriscos
            // A quantidade de espaços é sempre (N - número da linha atual)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Laço interno 2: imprime os asteriscos daquela linha
            // A fórmula (2 * i - 1) garante a quantidade ímpar de asteriscos (1, 3, 5, 7...)
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Pula para a próxima linha após desenhar os espaços e os asteriscos
            System.out.println();
        }
    }
}
