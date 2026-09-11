/*
Tabuada seletiva.
Exiba a tabuada de um número escolhido (1 a 10), mas utilize if para pular a
exibição dos múltiplos de 3.
*/
package exercicios;
import java.util.Scanner;

public class TabuadaSeletiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para saber sua tabuada de multiplicação:");
        int numero = scanner.nextInt();

        if (numero != 3) {
            System.out.println("A tabuada de " + numero + " é (pulando os números múltiplos de 3):");
        } else {
            System.out.println("Programa encerrado. Todos os números são múltiplos de 3");
        };

        for (int i = 1; i <= 10; i++){
            int resultado = (numero * i);
            if (resultado % 3 == 0){
                continue;
            }
            System.out.print("\n" + numero + " x " + i +" = "  + resultado);
        }
    }
}
