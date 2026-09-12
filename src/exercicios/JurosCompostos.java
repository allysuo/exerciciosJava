/*
Juros compostos.
Utilizando for, calcule mês a mês o rendimento de um valor investido a uma
taxa fixa, utilizando if para indicar em qual mês o valor ultrapassa um limite definido.

Fórmula: M = C*((1+i)^t)
        M: montantes | C: capital | i: taxa de juros | t: tempo
*/
package exercicios;
import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite o valor que deseja investir:");
        double capital = scanner.nextDouble();

        System.out.println("\nPor quantos meses quer deixar investindo?");
        int meses = scanner.nextInt();

        double taxaFixa = 0.0122;

        System.out.println("\nQual sua meta/limite?");
        int limite = scanner.nextInt();

        boolean limiteUltrapassado = false;

        for (int i = 1; i <= meses; i++){
            double montante = capital * Math.pow((1 + taxaFixa), i);
            System.out.printf("Mês %d: R$ %.2f%n", i, montante); // %d = número inteiro | %.2f = número com duas casas | %n = quebra de linha

            if (montante > limite && !limiteUltrapassado){
                System.out.printf(">> [ALERTA] Meta atingida no Mês %d! Valor: R$ %.2f <<%n", i, montante);
                limiteUltrapassado = true;
            }

        }
    }
}
