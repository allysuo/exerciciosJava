/*
Contagem regressiva.
Utilizando while, exiba a contagem regressiva de um número N até 1 e,
ao final, imprima "Decolagem!".
*/
package exercicios;

public class ContagemRegressiva {
    public static void main(String[] args) {
        int num = 10;
        while (num >= 1){
            System.out.println(num);
            num--;
        }
        System.out.println("Decolagem!");
    }
}
