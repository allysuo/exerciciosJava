/*
Aprovados x reprovados.
Para uma turma de N alunos (lidos em laço), utilize if para contar
quantos foram aprovados (média >= 7) e quantos foram reprovados, exibindo os totais ao final.
*/
package exercicios;
import java.util.Scanner;

public class AprovadosXReprovados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos que há na sala:");
        int alunos = scanner.nextInt();

        int reprovados = 0;
        int aprovados = 0;

        for (int i = 1; i <= alunos; i++){
            System.out.println("Digite a média do aluno " + i + ":");
            float media = scanner.nextFloat();

            if (media >= 7){
                aprovados++;
            } else {
                reprovados++;
            }
        }
        System.out.println("\nResultado:");
        System.out.println("Alunos reprovados: " + reprovados);
        System.out.println("Alunos aprovados: " + aprovados);
    }
}
