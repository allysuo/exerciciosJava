/*
Saque bancário.
Simule um caixa eletrônico: utilizando do-while, permita realizar saques até o
usuário optar por sair, verificando com if se há saldo suficiente antes de autorizar o saque.
*/
package exercicios;
import java.util.Scanner;

public class SaqueBancario {
    public static void main(String[] args) {
        float disponivel = 10000;
        Scanner scanner = new Scanner(System.in);
        float sacar;

        do {
            System.out.println("\nSaldo atual disponível: R$ " + disponivel);
            System.out.print("Digite o valor do saque (ou 0 para sair): R$ ");
            sacar = scanner.nextFloat();

            if (sacar == 0){
                System.out.println("Sistema encerrado.");
                break;
            }

            if (sacar < 0){
                System.out.println("Valor inválido! Por favor, digite um número positivo");
            }

            else if (sacar <= disponivel){
                disponivel -= sacar;
                System.out.println("Saque realizado com sucesso! Valor disponível: R$ " + disponivel);
            } else {
                System.out.println("Erro: Saldo insuficiente!");
            }
        } while (sacar != 0 && disponivel > 0);
    }
}
