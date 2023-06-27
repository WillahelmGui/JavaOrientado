package aulas.aula05;

public class ForEach {
	public static void main(String[] args) {
		int[] numeros = new int[10];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = 2 * i;
		}

		for (int numero : numeros) // Se lê para cada número do vetor numeros faça.
			System.out.print(numero + "\t");
	}
}
