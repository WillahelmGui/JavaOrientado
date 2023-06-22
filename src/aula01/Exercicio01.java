package aula01;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o valor da doacao: ");
		float doacao =entrada.nextFloat();
		
		if (doacao < 1000) {
			System.out.println("O valor do investimento e: " + (doacao * 0.05));
		} else {
			System.out.println("O valor do invesimento e: " + (doacao * 0.15));
		}
		
		//double a = double.parseDouble(JOptionPane.showinputdialog("Digite o valor da doacao"));
          
		entrada.close();

	}

}
