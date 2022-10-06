
import javax.swing.JOptionPane;


public class Teste {

    public static void main(String[] args) {
        //Declaração de variáveis
        String nome, cargo;
        int idade;
        double salario;
        
        //Entrada de dados (cadastro na memória RAM)
        nome = JOptionPane.showInputDialog("Qual seu nome?");
        cargo = JOptionPane.showInputDialog("Qual seu cargo?");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
        salario = Double.parseDouble(JOptionPane.showInputDialog("Qual seu salário?"));
        
        //Saída de dados (exibição dos dados na tela)
        JOptionPane.showMessageDialog(null, "Seu nome é " + nome);
        JOptionPane.showMessageDialog(null, "Seu cargo é " + cargo);
        JOptionPane.showMessageDialog(null, "Você tem " + idade + " anos"); 
        JOptionPane.showMessageDialog(null, "Você ganha " + salario + " reais");         
        
        salario = salario * 1.30;
        //salario = salario + salario * 30 / 100;
        
        JOptionPane.showMessageDialog(null, "Seu salário reajustado em 30% é " + salario);         
 
    }
    
}