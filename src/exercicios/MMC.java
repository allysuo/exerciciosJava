/*
MMC.
Utilizando while e if, calcule o Mínimo Múltiplo Comum (MMC) entre dois números
inteiros.
*/
package exercicios;
import java.util.Scanner;

public class MMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        int mmc;
        if (n1 > n2) {
            mmc = n1;
        } else {
            mmc = n2;
        }

        while (true) {
            if (mmc % n1 == 0 && mmc % n2 == 0) {
                break;
            }
            mmc++;
        }

        System.out.println("\nO MMC entre " + n1 + " e " + n2 + " é: " + mmc);
    }
}
