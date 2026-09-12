/*
Palavra palíndroma.
Utilizando for, compare os caracteres de uma palavra do início para o fim
e do fim para o início, verificando com if se ela é palíndroma (ex.: "arara").
*/
package exercicios;
import java.util.Scanner;

public class PalavraPalindroma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite uma palavra para saber se ela é palíndroma:");
        String palavra = scanner.nextLine();

        String palavraMinuscula = palavra.toLowerCase();

        boolean ehPalindromo = true;
        int tam = palavraMinuscula.length();

        for (int i = 0; i < tam/2; i++){
            if (palavraMinuscula.charAt(i) != palavraMinuscula.charAt(tam - 1 - i)){
                ehPalindromo = false;
                break;
            }
        }

        if (ehPalindromo){
            System.out.println("\nA palavra " + palavraMinuscula + " é palíndroma.");
        } else {
            System.out.println("\nNão é palíndroma.");
        }

    }
}
