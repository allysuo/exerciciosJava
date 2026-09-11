/*
Contagem de dígitos.
Utilizando while e divisão inteira, conte e exiba quantos dígitos possui
um número inteiro informado.
*/
package exercicios;
import java.util.Scanner;

public class ContagemDeDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para saber quantos dígitos há:");
        int numero = scanner.nextInt();

        int aux = numero;
        int contador = 0;

        while (aux > 0){
            aux = aux / 10;
            contador ++;
        }
        System.out.println("O número " + numero + " possui " + contador + " dígitos.");
    }
}
