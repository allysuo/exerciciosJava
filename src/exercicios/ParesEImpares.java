/* Usar o for para dizer quais números (de 1 a 50) são par e quais são ímpares */
package exercicios;

public class ParesEImpares {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++){
            if (i % 2 == 0){
                System.out.println(i + " é par.");
            } else {
                System.out.println(i + " é impar.");
            }
        }
    }
}
