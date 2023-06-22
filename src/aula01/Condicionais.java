package aula01;

import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
		
		//balança dos metais - considere 3 metais distintos ouro, prata e bronze. escreva um algoritmo para exibir o mais pesado
		// fazer com if else encadeado
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o peso do ouro: ");
		float ouro = entrada.nextFloat();
		System.out.println("Insira o peso da prata: ");
		float prata = entrada.nextFloat();
		System.out.println("Insira o peso do bronze");
		float bronze = entrada.nextFloat();
		
		

		
		
		
		if(ouro>prata && ouro > bronze) {
			System.out.println("Ouro é o mais pesado");
		} else if (prata > bronze) {
			System.out.println("prata e o mais pesado");
		} else {
			System.out.println("bronze e o mais pesado");
		}
			 
				
		
		
		
		
		
		
		
			
		
	

	}

}
