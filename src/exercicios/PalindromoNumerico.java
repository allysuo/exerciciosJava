/*
Palíndromo numérico.
Utilizando while, inverta os dígitos de um número inteiro e, com if,
verifique se o número original é igual ao invertido (palíndromo).
*/
package exercicios;
import java.util.Scanner;

public class PalindromoNumerico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite um número para saber se é palíndromo:");
        int numeroOrigional = scanner.nextInt();

        int numeroAux = numeroOrigional;
        int numeroInvertido = 0;

        /*Looping para remover o último dígito e trocar sua ordem*/
        while (numeroAux > 0){
            int ultimoDigito = numeroAux % 10;
            numeroInvertido = (numeroInvertido * 10) + ultimoDigito;
            numeroAux = numeroAux/10;
        }

        System.out.println("\nNúmero original: " + numeroOrigional);
        System.out.println("Número invertido: " + numeroInvertido);

        /*Verificação de palíndromo ou não*/
        if (numeroInvertido == numeroOrigional){
            System.out.println("\nO número " + numeroOrigional + " é palíndromo");
        } else {
            System.out.println("O número " + numeroOrigional + " não é palíndromo");
        }
    }
}