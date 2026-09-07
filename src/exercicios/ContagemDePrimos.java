/*
Contagem de primos.
Utilizando for (com um for interno para testar os divisores) e if, conte
quantos números primos existem entre 1 e 50 e exiba o total.
*/
package exercicios;

public class ContagemDePrimos {
    public static void main(String[] args) {
        int contador = 0;

        for (int num = 1; num <=50; num++){
            if (num <= 1){
                continue;
            }
            boolean ehPrimo = true;
            for (int i = 2; i < num; i++){
                if (num % i == 0){
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo){
                contador++;
            }
        }
        System.out.println("Existem " + contador + " números primos de 1 a 50.");
    }
}
