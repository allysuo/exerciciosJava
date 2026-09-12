/*
Soma dos dígitos.
Utilizando while, calcule e exiba a soma dos dígitos de um número inteiro
(ex.: 1234 → 1+2+3+4 = 10).
*/
package exercicios;
import java.util.Scanner;

public class SomaDosDigitos {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número desejado:");
        int numero = scanner.nextInt();

        int aux = numero;
        int soma = 0;

        while (aux > 0){
            int numeroAtual = aux % 10;
            soma += numeroAtual;
            aux = aux/10;
        }
        System.out.println("A soma dos dígitos é: " + soma);
    }
}