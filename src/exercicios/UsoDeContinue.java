/*
Uso de continue.
Utilizando for, exiba os números de 1 a 30, mas utilize if e continue para pular
a exibição dos múltiplos de 4.
*/
package exercicios;

public class UsoDeContinue {
    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++){
            if (i % 4 == 0){
                continue;
            }
            System.out.println("Número: " + i);
        }
    }
}
