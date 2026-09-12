/*
Maiúsculas e minúsculas.
Percorra uma String com for e, utilizando if/else, conte quantos
caracteres são letras maiúsculas e quantos são minúsculas.
*/
package exercicios;
import java.util.Scanner;

public class MaiusculasEMinusculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite uma frase ou palavra:");
        String texto = scanner.nextLine();

        int maiusculas = 0;
        int minusculas = 0;

        for (int i = 0; i < texto.length(); i++){
            char caractere = texto.charAt(i);

            if (Character.isUpperCase(caractere)){
                maiusculas++;
            }
            else if (Character.isLowerCase(caractere)){
                minusculas++;
            }
        }

        System.out.println("\nQuantidade de caracteres maiúsculos: " + maiusculas);
        System.out.println("Quantidade de caracteres minúsculos: " + minusculas);
    }
}
