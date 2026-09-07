/*
Números perfeitos.
Utilizando for (com um for interno para somar os divisores) e if, encontre e
exiba todos os números perfeitos entre 1 e 500 (ex.: 6, pois 1+2+3=6).
*/
package exercicios;

public class NumerosPerfeitos {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 500; numero++){
            int somaDivisores = 0;

            for (int i = 1; i <= numero/2; i++){
                if (numero % i == 0){
                    somaDivisores += i;
                }
            }
            if (somaDivisores == numero){
                System.out.println("Número perfeito encontrado: " + numero);
            }
        }
    }
}
