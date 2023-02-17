package teste;

import javax.swing.*;

public class Idade {
    public static void main(String[] args){
        var nomeUm = JOptionPane.showInputDialog("Digite o nome 1: ");
        var idadeUm = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade 1: "));
        var nomeDois = JOptionPane.showInputDialog("Digite o nome 2: ");
        var idadeDois = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade 2: "));

        if (idadeUm > idadeDois)
            System.out.println("Nome: " + nomeUm + ", idade " + idadeUm + " anos");
        else
            System.out.println("Nome: " + nomeDois + ", idade " + idadeDois + " anos");
    }
}
