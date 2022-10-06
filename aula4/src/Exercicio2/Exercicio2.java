
package Exercicio2;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float gCelcius, gFahrenheit;
        
        System.out.print("Informe a temperatura em Celcius: ");
        gCelcius = teclado.nextFloat();
        
        gFahrenheit = (9 * gCelcius + 160) / 5;
        
        System.out.println("Temperatura em Fahrenheit: " + gFahrenheit);
        
    }
}
