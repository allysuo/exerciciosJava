/*
Sistema de login.
Utilizando do-while, permita até 3 tentativas de digitação de senha. A cada
tentativa incorreta, utilize if para informar quantas tentativas ainda restam; após a 3a tentativa
incorreta, bloqueie o acesso.
*/
package exercicios;
import java.util.Scanner;

public class SistemaDeLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String SENHA_CORRETA = "aluno123";

        int tentativas = 0;
        final int MAX_TENTATIVAS = 3;
        boolean acessoConcedido = false;

        do {
            System.out.print("Digite a senha de acesso: ");
            String senhaDigitada = scanner.nextLine();
            tentativas++;

            if (senhaDigitada.equals(SENHA_CORRETA)) {
                acessoConcedido = true;
                break;
            } else {
                int restantes = MAX_TENTATIVAS - tentativas;

                if (restantes > 0) {
                    System.out.println("Senha incorreta! Você ainda tem " + restantes + " tentativa(s) restante(s).\n");
                }
            }

        } while (tentativas < MAX_TENTATIVAS);

        if (acessoConcedido) {
            System.out.println("\nAcesso concedido! Bem-vindo ao sistema.");
        } else {
            System.out.println("\nAcesso bloqueado! Número máximo de tentativas excedido.");
        }
    }
}
