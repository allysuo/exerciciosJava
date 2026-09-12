/*
Jogo de adivinhação.
Defina um número secreto fixo e simule tentativas de "chute". Utilizando
do-while, repita até o chute ser igual ao número secreto, informando com if se o chute foi maior ou
menor que o número secreto.
*/
package exercicios;
import java.util.Scanner;

public class JogoDeAdivinha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int segredo = 39;

        System.out.println("Digite um número:");
        do {
            numero = scanner.nextInt();
            if (numero > segredo){
                System.out.println("\nChute muito alto.\nTente outro!");
            }
            else if (numero < segredo){
                System.out.println("\nChute muito baixo.\nTente outro!");
            }
        } while (numero != segredo);

        System.out.println("\nParabéns! Você descobriu o número secreto.");
    }
}
