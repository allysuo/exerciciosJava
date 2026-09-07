/*
FizzBuzz.
De 1 a 50, exiba "Fizz" se o número for múltiplo de 3, "Buzz" se for múltiplo de 5,
"FizzBuzz" se for múltiplo de ambos, e o próprio número nos demais casos (for + if/else if).
*/
package exercicios;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("FizzBuzz! Número: " + i);
            }
            else if (i % 3 == 0){
                System.out.println("Fizz! Número: " + i);
            }
            else if (i % 5 == 0){
                System.out.println("Buzz! Número: " + i);
            } else {
                System.out.println(i);
            }
        }
    }
}
