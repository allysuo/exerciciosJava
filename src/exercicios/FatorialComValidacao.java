/*
Fatorial com validação.
Peça um número N e, com if, verifique se ele é negativo (exiba uma
mensagem de erro nesse caso); caso contrário, calcule o fatorial de N utilizando for.
*/
package exercicios;
import java.util.Scanner;

public class FatorialComValidacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para saber seu fatorial:");
        int n = scanner.nextInt();

        if (n < 0){
            System.out.println("Números negativos não são aceitos.");
            System.out.println("Programa encerrado.");
        } else {
            long fatorial = 1;

            for (int i = 1; i <= n; i++){
                fatorial *= i;
            }
            System.out.println("O fatorial de " + n + " é: " + fatorial);
        }

        /*
        while (n < 0){
            System.out.println("O número não pode ser negativo! Por favor, digite outro número:");
            n = scanner.nextInt();
        }
        Esse seria para poder digitar o número novamente.
        */

    }
}
