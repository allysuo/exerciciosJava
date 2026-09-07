/*
Soma dos ímpares.
Utilizando while e if, some todos os números ímpares entre 1 e 100 e exiba o resultado.
*/
package exercicios;

public class SomaDosImpares {
    public static void main() {
        int soma = 0;
        int contador = 1;

        while (contador <= 100) {
            if (contador % 2 != 0){
                soma += contador;

            }
            contador ++;
        }
        System.out.println("A soma dos números ímpares de 1 a 100 é: " + soma);
    }
}
