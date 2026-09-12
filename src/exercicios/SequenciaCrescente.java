/*
Sequência crescente.
Leia números inteiros em um laço, um a um, até que o usuário digite -1.
Utilizando if, verifique a cada novo número se ele é maior que o anterior e informe ao final se toda
a sequência informada foi crescente.
*/
package exercicios;
import java.util.Scanner;

public class SequenciaCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma sequência de números inteiros (digite -1 para parar):");

        boolean ehCrescente = true;

        System.out.print("Digite um número: ");
        int numeroAtual = scanner.nextInt();

        if (numeroAtual != -1) {

            while (true) {
                int numeroAnterior = numeroAtual;

                System.out.print("Digite um número: ");
                numeroAtual = scanner.nextInt();

                if (numeroAtual == -1) {
                    break;
                }

                if (numeroAtual <= numeroAnterior) {
                    ehCrescente = false;
                }
            }

            if (ehCrescente) {
                System.out.println("\nParabéns! Toda a sequência informada foi crescente.");
            } else {
                System.out.println("\nA sequência NÃO foi crescente.");
            }

        } else {
            System.out.println("\nNenhum número foi informado para análise.");
        }
    }
}