/*
Número de Armstrong.
Utilizando for e if, verifique se um número é de Armstrong (a soma de
cada dígito elevado à quantidade de dígitos é igual ao próprio número, ex.: 153 = 13+53+33).
*/
package exercicios;
import java.util.Scanner;

public class NumeroDeArmstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para verificar se é um Número de Armstrong:");
        int numeroOriginal = scanner.nextInt();

        // Converte para String apenas para contar os dígitos facilmente
        String numeroStr = Integer.toString(numeroOriginal);
        int quantidadeDigitos = numeroStr.length();

        int soma = 0;
        int numeroAuxiliar = numeroOriginal;

        // Loop 'for' para processar cada dígito do número
        for (int i = 0; i < quantidadeDigitos; i++) {
            int digito = numeroAuxiliar % 10; // Isola o último dígito

            // Eleva o dígito à potência da quantidade de dígitos e soma
            soma += Math.pow(digito, quantidadeDigitos);

            numeroAuxiliar = numeroAuxiliar / 10; // Remove o último dígito
        }

        // Verificação final
        if (soma == numeroOriginal) {
            System.out.println("O número " + numeroOriginal + " É um número de Armstrong.");
        } else {
            System.out.println("O número " + numeroOriginal + " NÃO é um número de Armstrong.");
        }
    }
}
