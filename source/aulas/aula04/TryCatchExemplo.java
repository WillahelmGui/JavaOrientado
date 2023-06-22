package aulas.aula04;

import java.sql.SQLException;

public class TryCatchExemplo {
	public static void main(String[] args) {
		
		int v1 = 1, v2 = 0, res = 0;

		char lista[] = { 1, 2, 3 };

		for (int i = 0; i < lista.length; i++) {
			try {																// TUDO DENTRO DO TRY SERÁ EXECUTADO,
				if (i == 0)														//OU PELO MENOS É O ESPERADO, ATÉ QUE
					res = v1 / v2;												// "ESTOURE" UM ERRO.
				else
					lista[3] = 4;												// A partir da versão 1.7 é possível usar apenas o pipe "|" para utilizar o operador "OU"		
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // O BLOCO CATCH É UTILIZADO PARA TRATAR
																				// O ERRO, NO ESPAÇO () SE COLOCA O TIPO
																				// DE EXEÇÕES QUE ESSE CÓDIGO PODERÁ
																				// GERAR.
				System.out.println("Execao: " + e);
			}
			System.out.println("i = " + i);
			System.out.println("res = " + res);
		}
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println(2);
		} finally { // O finally é sempre executado independente se estourar erro ou não.
			System.out.println(3);
		}
	}
}
