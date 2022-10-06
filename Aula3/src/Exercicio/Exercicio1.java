
package Exercicio;
import java.util.Scanner;
public class Exercicio1 {
public static void main(String[] args) {
 
        float v1, v2; //onde serão armazenadas as entradas
        float soma, sub, mult, div, mod; //onde serão armazenadas as saídas
 
        Scanner teclado = new Scanner(System.in);
 
        //entrada dos dados:
        System.out.print("Informe o primeiro valor: ");
        v1 = teclado.nextFloat();
 
        System.out.print("Informe o segundo valor: ");
        v2 = teclado.nextFloat();
 
        soma = v1 + v2;
        sub = v1 - v2;
        mult = v1 * v2;
 
        System.out.println("\n--------------");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mult);
 
        if (v2 == 0) {
            System.out.println("Divisão e módulo impossíveis de calcular.");
        } else {
            div = v1 / v2;
            mod = v1 % v2;
            System.out.println("Divisão: " + div);
            System.out.println("Módulo: " + mod);
        }
 
    }
}