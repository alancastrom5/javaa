
import javax.swing.JOptionPane;


public class Aula26 {

    public static void main(String[] args) {
//Declarei as variáveis
        int matricula;
        String nome, cargo;
        double salario;
        //cadastro em variáveis na memória RAM
        matricula = Integer.parseInt(JOptionPane.showInputDialog("Qual é a matrícula do funcionario?"));
        nome = JOptionPane.showInputDialog("Qual o nome do funcionário?");
        cargo = JOptionPane.showInputDialog("Qual o cargo do funcionário?");
salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do salário?"));
        //Exibir na tela os valorse cadastrados
        JOptionPane.showMessageDialog(null,"Matrícula: " + matricula + "\n" + "Nome: " + nome + "\n" + "Cargo: " + cargo + "\n" + "Salário: " + salario);