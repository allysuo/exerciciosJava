/*
Fibonacci com destaque.
Gere os 20 primeiros termos da sequência de Fibonacci utilizando for,
indicando com if quais termos são pares.
*/
package exercicios;

public class FibonacciComDestaque {
    public static void main(String[] args) {
        int numAnterior = 0;
        int numAtual = 1;

        for (int i = 1; i <= 20; i++){
            if (numAtual % 2 == 0){
                System.out.println("Termo " + i + ": " + numAtual + " é par");
            } else {
                System.out.println("Termo " + i + ": " + numAtual);
            }
            int proximoNum = numAnterior + numAtual;
            numAnterior = numAtual;
            numAtual = proximoNum;
        }
    }
}
