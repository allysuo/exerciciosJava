/*
Menu de calculadora.
Crie um menu (soma, subtração, multiplicação, divisão e sair) utilizando
do-while e switch-case, tratando com if a tentativa de divisão por zero.
*/
package exercicios;
import java.util.Scanner;

public class MenuDeCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operacao;

        System.out.println("\nBem-vindo(a) à calculadora de 2 números!");

        do {
            // Menu
            System.out.println("\n--- MENU DA CALCULADORA ---");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            operacao = scanner.nextInt();

            if (operacao == 5) {
                System.out.println("\nSaindo do programa... Até logo!");
                break;
            }

            if (operacao < 1 || operacao > 5) {
                System.out.println("Opção inválida! Tente novamente.");
                continue;
            }

            // Pega os números
            System.out.print("Digite o primeiro número: ");
            float n1 = scanner.nextFloat();
            System.out.print("Digite o segundo número: ");
            float n2 = scanner.nextFloat();

            // Vê a operação e a realiza
            switch (operacao) {
                case 1:
                    System.out.println("Resultado da Adição: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("Resultado da Subtração: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("Resultado da Multiplicação: " + (n1 * n2));
                    break;
                case 4:
                    // Divisão com 0
                    if (n2 == 0) {
                        System.out.println("Erro: Não é possível dividir por zero!");
                    } else {
                        System.out.println("Resultado da Divisão: " + (n1 / n2));
                    }
                    break;
            }

        } while (operacao != 5);
    }
}
