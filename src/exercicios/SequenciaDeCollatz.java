/*
Sequência de Collatz.
A partir de um número N, aplique repetidamente a regra: se par, divida
por 2; se ímpar, multiplique por 3 e some 1 (if/else). Repita com while até chegar a 1, contando e
exibindo o número de passos.
*/
package exercicios;
import java.util.Scanner;

public class SequenciaDeCollatz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n = scanner.nextInt();

        if (n <= 0){
            System.out.println("Por favor, digite um número inteiro positivo.");
            return;
        }

        System.out.println("\nSequência gerada:");

        int passos = 0;

        while (n != 1){
            if (n % 2 == 0){
                n = n / 2;
            } else {
                n = (n * 3) + 1;
            }
            System.out.println("-> " + n);
            passos++;
            //System.out.println("Número do passo: " + passos);
        }

        System.out.println("\nTotal de passos necessários: " + passos);
    }
}
