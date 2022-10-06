
package Aula;

import javax.swing.JOptionPane;

public class Aula {
    public static void main (String[] args) {
   //Declaração as variáveis
        String nomeProduto;
        double precoProduto, percentualReajuste;
        
        //Pedindo (cadastrando na memória) os dados
        nomeProduto = JOptionPane.showInputDialog("Qual o nome do produto?");
        precoProduto = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço do produto?"));
        percentualReajuste = Double.parseDouble(JOptionPane.showInputDialog("Qual o percentual de reajuste?"));
        //Exibição dos dados cadastrados na memória
        JOptionPane.showMessageDialog(null, "Nome do produto: " + nomeProduto + "\n" + "Preço do produto: " + precoProduto + "\n" + "Percentual d reajuste: " + percentualReajuste);
}
}