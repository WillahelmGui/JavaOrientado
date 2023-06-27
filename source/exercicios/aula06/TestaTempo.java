package exercicios.aula06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;


public class TestaTempo {
	public static void main(String[] args) {
		
		Collection<Long> lista = new HashSet<Long>();//Trocado por ArrayList ->linkedList
		
		long inicio = System.currentTimeMillis();
		
		for (long i = 0; i < 100000; i++) {
			lista.add(i);
		}
		
		long fim = System.currentTimeMillis();
		long tempoGasto = fim - inicio;
		System.out.println(tempoGasto);
//		7. Troque o ArrayList por HashSet e verifique o tempo
//		8. Troque o ArrayList por LinkedList e verifique o tempo 
	}
}
