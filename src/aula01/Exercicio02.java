package aula01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira sua idade: ");
		int idade = entrada.nextInt();
		
		if (idade <= 16) {
			System.out.println("Nao pode votar!");
		} else if ( idade >= 17 && idade < 18 ) {
			System.out.println("voce pode votar! ");
		} if (idade >= 18) {
			System.out.println("voce e obrigado a votar!");
		} 
		
		
		entrada.close();
	}

}
