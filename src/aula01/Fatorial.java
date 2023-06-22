package aula01;

public class Fatorial {

	public static void main(String[] args) {
		
		int fatorial = 1, valor =6;
		//long a=0;
		
		for(int i =1; i <= valor; i++) {
			fatorial *= i;
			//ou fatorial = fatorial * i;
		}
		System.out.println(valor + "! = "+fatorial);

	}

}
