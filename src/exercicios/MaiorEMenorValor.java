/*
Maior e menor valor.
Leia (ou simule a leitura de) N números em um laço e, comparando com
if a cada novo valor, determine e exiba o maior e o menor número informado.
*/
package exercicios;
import java.util.Scanner;

public class MaiorEMenorValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos números você quer digitar?");
        int n = scanner.nextInt();

        int maior = 0;
        int menor = 0;

        for (int i = 1; i <= n; i++){
            System.out.println("Número " + i + ":");
            int numeroAtual = scanner.nextInt();;

            if (i == 1){
                maior = numeroAtual;
                menor = numeroAtual;
            } else {
                if (numeroAtual > maior){
                    maior = numeroAtual;
                }
                if (numeroAtual < menor){
                    menor = numeroAtual;
                }
            }
        }
        System.out.println("O maior númeor é: " + maior);
        System.out.println("O menor númeor é: " + menor);
    }
}
