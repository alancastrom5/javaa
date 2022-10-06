import java.util.Scanner;
package Atividade2;
/**
 *
 * @author Alan
 */
public class Atividade {
    
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double VelocidadeMedia, TempoPercurso, Autonomia = 12; //Velocidade média em Km/h, Tempo gasto em horas e autonomia em Km/L
		double Distancia, LitrosUsados,ValorCombustivelKm,ValorPedagios,PrecoCombustivel;		

		System.out.print("Programa de cálculo da quantidade de litros de combustível gasta em uma viagem\n\n"); //Por que títulos tão grandes?!
		
		
		System.out.print("Digite o tempo que você gastou em sua viagem (horas): ");
		TempoPercurso = entrada.nextDouble();
		
		System.out.print("Por favor, agora digite o Velocidade Média em que você fez o percurso (Km/h): ");
		VelocidadeMedia = entrada.nextDouble();
                
                System.out.print("Por favor, digite o valor gasto em pedagio: ");
		ValorPedagios = entrada.nextDouble();
                
                System.out.print("Por favor, digite o valor do combustivel: ");
		PrecoCombustivel = entrada.nextDouble();

		
		Distancia = VelocidadeMedia * TempoPercurso;
		LitrosUsados = Distancia / Autonomia;
                ValorCombustivelKm= PrecoCombustivel / Distancia;


		System.out.print("\n\n\nResultados:\n\n");
		System.out.print("Velocidade média = " + VelocidadeMedia + " Km/h\n");
		System.out.print("Tempo gasto = " + TempoPercurso + " horas\n");
		System.out.print("Distancia Percorrida = " + Distancia + " Km\n");
		System.out.print("Quantidade de Combustível utilizado: " + LitrosUsados + " litros\n");
                System.out.print("Valor gasto com combustivel = " + PrecoCombustivel + " Km\n");
		System.out.print("Quantidade de Pedagio Gasto: " + ValorPedagios + " reais\n");
                System.out.print("Quantidade Gasta na viagem: " + ValorCombustivelKm +" reais\n");

	}

}