/*
Contagem de vogais.
Percorra uma frase caractere a caractere com for e charAt(), utilizando if
para contar quantas vogais ela contém.
*/
package exercicios;
import java.text.Normalizer;
import java.util.Scanner;

public class ContagemDeVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite uma frase:");
        String frase = scanner.nextLine();

        //Deixa sem acento, separando-os da letra e removendo.
        String fraseSemAcento = Normalizer.normalize(frase, Normalizer.Form.NFD);
        fraseSemAcento = fraseSemAcento.replaceAll("\\p{M}", "");

        String fraseMinuscula = fraseSemAcento.toLowerCase();

        int contadorVogais = 0;


        for (int i = 0; i < fraseMinuscula.length(); i++){
            char letra = fraseMinuscula.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contadorVogais++;
            }
        }

        System.out.println("\nA frase contém " + contadorVogais + " vogal(is).");
    }
}
