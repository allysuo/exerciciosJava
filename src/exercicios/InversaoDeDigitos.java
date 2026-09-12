/*
Inversão de dígitos.
Utilizando while, inverta a ordem dos dígitos de um número inteiro (ex.:
1234 → 4321) e exiba o resultado.
*/
package exercicios;
import java.util.Scanner;

public class InversaoDeDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite um número para ter sua ordem invertida:");
        int numero = scanner.nextInt();

        int numAux = numero;
        int numeroInvertido = 0;

        while (numAux > 0){
            int ultimoDigito = numAux % 10;
            numeroInvertido = (numeroInvertido * 10) + ultimoDigito;
            numAux = numAux / 10;
        }

        System.out.println("\nNúmero original: " + numero);
        System.out.println("Número invertido: " + numeroInvertido);
    }
}
