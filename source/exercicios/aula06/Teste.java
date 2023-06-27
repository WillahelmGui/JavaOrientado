package exercicios.aula06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//Exercicio 01, 02, 03.
public class Teste {

	static Map<Object, Object> mapa = new HashMap<Object, Object>();//Não é declarado nenhum tipo pois o map pode guardar diversos tipos.
	public static void main(String[] args) {
		Usuario guilherme = new Usuario(3, "Guilherme R", "123321");
		Usuario emerson = new Usuario(2, "Emerson", "abc");
		Usuario miguel = new Usuario(1, "Miguel", "123456");
		List<Usuario> users = new ArrayList<Usuario>();
		users.add(guilherme);
		users.add(emerson);
		users.add(miguel);
		
		
		//Iterando a lista.
		for (Usuario user : users) {
			System.out.println(user.getNome());
		}
		
		
		
		//Reordena a lista conforme a regra definida no CompareTo.
		Collections.sort(users);
		
		//Iterando a lista ordenada.
		for (Usuario user : users) {
			System.out.println(user.getNome());
		}

		
		mapa.put(guilherme.getId(), guilherme);
		mapa.put(miguel.getId(),miguel);
		mapa.put(emerson.getId(),emerson);
		
		//Recuperando o objeto por meio da chave:
		guilherme.recuperaUsuario();
		
	}
}
