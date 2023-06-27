package ferramentas;

import java.util.Scanner;

public class LeitorDeDados {
	Scanner sc = new Scanner(System.in);
	public String lerLinha() {
		return sc.nextLine();
	}
	public int lerInteiro(int numero) {
		numero = Integer.parseInt(sc.nextLine());
		return numero;
	}
}