package exercicios;

import javax.swing.JOptionPane;

import ferramentas.LeitorDeDados;

public class Aula01 {
// O ESTATUO DE UMA ONG DETERMINA QUE TODAS AS DOAÇÕES RECEBIDAS DEVEM GERAR UM VALOR PARA INVESTIMENTO
//	PARA COBRIR MOMENTOS DE NECESSIDADE. O VALOR DO INVESTIMENTO DEVE SER DE 5% DA DOAÇÃO. Porém, em cassos em que as doações ultrapassem 1000 reais
// o investimento deve ser de 15% da doação, sua missão é criar um programa capaz de fazer os cálculos necessários e indicar o quanto deve ser investido

	public static void main(String[] args) {
		LeitorDeDados l1 = new LeitorDeDados();
		
		// Exercício 01.
//		double doacao = 0, investimento = 0;
//		
//		//doacao = Double.parseDouble(l1.lerLinha());
//		doacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da doação."));
//		
//		if(doacao > 1000) {
//			investimento = (doacao/100 * 15);
//			JOptionPane.showMessageDialog(null, "O investimento deverá ser de : " + investimento + ".");
//			
//		} else {
//			investimento = (doacao/100) * 5;
//			JOptionPane.showMessageDialog(null, "O investimento deverá ser de : " + investimento + ".");
//			
//		}
		
		//Exercício 02.
		
		/*Uma ong resolveu prestar um servico vem diferente ela oferece vans para buscar pessoas com qualquer tipo de dificuldade de locomoção
		 * para votar. Se for menor, é proibido de votar. Se entre 16 e 18 é opicional. Se maior de 18 permitido. 
		 */
		
		
//		int idade = 0;
//		
//		//l1.lerInteiro(idade);
//		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade. "));
//		if(idade <= 16) {
//			System.out.println("O indivíduo é proibido de votar.");
//			JOptionPane.showMessageDialog(null, "O indivíduo é proibido de votar." );
//		} else if (idade > 16 && idade < 18) {
//			JOptionPane.showMessageDialog(null, "O indivíduo pode escolher se deseja votar." );
//		} else {
//			JOptionPane.showMessageDialog(null, "O indivíduo é obrigado a votar." );
//		}
//		
		
		//Exercicio 03
		/* Some todos os números de 0 a 100.
		 * 
		 */
		int i = 0;
		int soma = 0;
		while (i <= 100) {
		soma = soma + i;
		System.out.println(soma);
			i++;
		}
		
	}
}
//TODO Homework, algoritimo sequencia de fibonacci e fatorial.