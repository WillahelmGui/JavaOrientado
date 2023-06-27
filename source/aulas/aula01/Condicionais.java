package aulas.aula01;

public class Condicionais {
	public static void main(String[] args) {
//Considere tres metais disntigos ouro, prata e bronze. Escreva um algoritimio para exibir o mais pesado entre eles.
//Fazer com if-else encadeados.	

		float ouro = 10, prata = 20, bronze = 30;

		// Fieto pelo professor
//		if(ouro > prata) {
//			if(ouro > bronze) {
//				System.out.println("Ouro mais pesado.");
//			} else {
//				System.out.println("Bronze mais pesado.");
//			}
//		} else if(prata > bronze) {
//			System.out.println("Prata mais pesado");
//		} else {
//			System.out.println("Bronze mais pesado");
//		}
//		
//		
//		
//		if (ouro > prata) {
//			if (ouro > bronze) {
//				System.out.println("Ouro mais pesado.");
//			}
//		} else if (prata > ouro) {
//			if (prata > bronze) {
//				System.out.println("Prata mais pesado.");
//			} else if (bronze > ouro) {
//				if (bronze > prata) {
//					System.out.println("Bronze mais pesado.");
//				}
//			}
//		}

		if (ouro > prata && ouro > bronze) { // Lógica sem operadores lógicos.
			System.out.println("ouro mais pesado");
		} else if (prata > ouro && prata > bronze) {
			System.out.println("Prata mais pesado");
		} else if (bronze > prata && bronze > ouro) {
			System.out.println("Bronze mais pesado");
		}

		if (ouro > prata && ouro > bronze) {// Lógica sem operadores lógicos feito pelo professor.
			System.out.println("Ouro mais pesado.");
		} else if (prata > bronze) {
			System.out.println("Prata mais pesado.");
		} else {
			System.out.println("Bronze mais pesado.");
		}
	}
}