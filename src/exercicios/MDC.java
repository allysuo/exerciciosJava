/*
MDC (Euclides).
Utilizando while, implemente o algoritmo de Euclides para calcular o
Máximo Divisor Comum (MDC) entre dois números inteiros.
*/
package exercicios;
import java.util.Scanner;

public class MDC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int b = scanner.nextInt();

        int originalA = a;
        int originalB = b;

        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }

        System.out.println("\nO MDC entre " + originalA + " e " + originalB + " é: " + a);
    }
}
