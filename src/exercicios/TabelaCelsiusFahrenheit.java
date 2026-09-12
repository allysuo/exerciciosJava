/*
Tabela Celsius-Fahrenheit.
Utilizando for, monte uma tabela de conversão de Celsius para
Fahrenheit de 0°C a 100°C, destacando com if as temperaturas de congelamento (0°C) e ebulição
(100°C) da água.
*/
package exercicios;

public class TabelaCelsiusFahrenheit {
    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("    TABELA CELSIUS --> FAHRENHEIT   ");
        System.out.println("=====================================");

        for (int c = 0; c <= 100; c += 10){
            double f = ((c * 9.0 / 5.0) + 32);

            String status = "";

            if (c == 0){
                status = "Ponto de congelamento.";
            }
            else if (c == 100){
                status = "Ponto de ebulição.";
            }

            System.out.printf("%-12d | %-12.1f | %s%n", c, f, status);
        }
    }
}
