/*
Classificação de notas.
Leia N notas em um laço, calcule a média de cada aluno e, com if/else
if/else, classifique-o em "Aprovado", "Recuperação" ou "Reprovado".
*/
package exercicios;
import java.util.Scanner;

public class ClassificacaoDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantoas notas você deseja ler?");
        int n = scanner.nextInt();

        float soma = 0;

        for (int i = 1; i <= n; i++){
            System.out.println("Digite a nota " + i + ":");
            float nota = scanner.nextFloat();
            soma += nota;
        }

        float media = soma/n;
        System.out.println("A média final foi: " + media);

        if (media >= 7.0){
            System.out.println("Aprovado!");
        } else if (media >= 5.0){
            System.out.println("Recuperação.");
        } else {
            System.out.println("Reprovado.");
        }
    }
}
