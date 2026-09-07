/*
Soma dos pares.
Utilizando for e if, some todos os números pares entre 1 e 100 e exiba o resultado.
*/
package exercicios;

public class SomaDosPares {
    public static void main(String[] args) {
        int soma = 0;

        /* Primeiro bloco */
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                soma += i;
            }
        }

        /* Segundo código:
        for (int i = 2; i <= 100; i += 2){
            soma += i;
        }
        */

        System.out.println("A soma dos números pares é: " + soma);
    }
}
