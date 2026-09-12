/*
Positivos, negativos e zeros.
Leia N valores em um laço e, com if/else if/else, conte quantos
números são positivos, quantos são negativos e quantos são iguais a zero.
*/
package exercicios;
import java.util.Scanner;

public class PositivosNegativosZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos valores você deseja digitar?");
        int n = scanner.nextInt();

        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        for (int i = 1; i <= n; i++){
            System.out.println("Digite o " + i + "º número:");
            int valor = scanner.nextInt();

            if (valor > 0){
                positivos++;
            }
            else if (valor < 0) {
                negativos++;
            } else {
                zeros++;
            }
        }

        System.out.println("===== Resultado Final ======");
        System.out.printf("Positivos: %d%n", positivos);
        System.out.printf("Negativos: %d%n", negativos);
        System.out.printf("Zeros: %d", zeros);
    }
}
