/*
Uso de break.
Percorra a tabuada de um número com while e, utilizando if e break, interrompa
o laço assim que encontrar o primeiro resultado múltiplo de 7.
*/
package exercicios;
import java.util.Scanner;

public class UsoDeBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        System.out.println("\nTabuada do " + numero + ":");

        int i = 1;

        while (i <= 10){
            int resultado = numero * i;
            if (resultado % 7 == 0){
                System.out.println("\nMúltiplo de 7 encontrado.\nProgrma Encerrado.");
                break;
            } else {
                System.out.println(numero + " x " + i + " = " + resultado);
            }
            i++;
        }
    }
}
