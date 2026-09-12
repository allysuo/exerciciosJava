/*
Números triangulares.
Utilizando for e if, encontre e exiba os números triangulares (1, 3, 6,
10, 15, ...) até um limite N informado.
*/
package exercicios;
import java.util.Scanner;

public class NumerosTriangulares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor limite máximo (N): ");
        int limite = scanner.nextInt();

        System.out.println("\nNúmeros triangulares encontrados até " + limite + ":");

        int soma = 0;

        for (int i = 1; i <= limite; i++) {
            soma = soma + i;

            if (soma <= limite) {
                System.out.print(soma + " ");
            } else {
                break;
            }
        }
    }
}
