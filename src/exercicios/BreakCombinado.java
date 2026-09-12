/*
Break combinado.
Percorra os números de 1 a 100 com for e, utilizando if (com operador
lógico &&) e break, pare assim que encontrar o primeiro número divisível por 13 e por 3 ao mesmo
tempo.
*/
package exercicios;

public class BreakCombinado {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 13 == 0){
                break;
            }
            System.out.println("Número: " + i);
        }
    }
}
