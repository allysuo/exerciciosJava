/*
Potência sem Math.pow.
Utilizando for, calcule o valor de uma base elevada a um expoente
sem usar Math.pow(), tratando com if o caso especial de expoente igual a 0.
*/
package exercicios;
import java.util.Scanner;

public class PotenciaSemMathPow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = scanner.nextInt();

        System.out.print("Digite o expoente (inteiro não-negativo): ");
        int expoente = scanner.nextInt();

        long resultado = 1;

        if (expoente == 0) {
            resultado = 1;
        } else {
            for (int i = 1; i <= expoente; i++) {
                resultado = resultado * base;
            }
        }

        System.out.println("\nO resultado de " + base + " elevado a " + expoente + " é: " + resultado);
    }
}