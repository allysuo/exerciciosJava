/*
Fila de atendimento.
Simule o atendimento de N clientes utilizando while, exibindo com if
uma mensagem especial a cada 5o cliente atendido.
*/
package exercicios;
import java.util.Scanner;

public class FilaDeAtendimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o total de clientes na fila: ");
        int totalClientes = scanner.nextInt();

        int clienteAtual = 1;

        while (clienteAtual <= totalClientes){
            if (clienteAtual % 5 == 0){
                System.out.println("Uou! Cliente nº " + clienteAtual  + " atendido com extremo sucesso! Você é demais!");
            } else {
                System.out.println("Cliente nº " + clienteAtual + " atendido com sucesso.");
            }

            clienteAtual++;
        }
        System.out.println("Todos os clientes foram atendidos. Fila encerrada.");
    }
}
