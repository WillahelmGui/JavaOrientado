package aulas.aula05;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Usuario {

	// Atributos
	private int id;
	private String nome, email, telefone, senha;
	private String dataCadastro;
	private static List <Usuario> users = new ArrayList<Usuario>();

	public static void main(String[] args) {
		Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        String strDate = dateFormat.format(date);  
        
        Usuario Guilherme = new Usuario(1, "Guilherme", "Teste@teste.com", "(11)xxxx-xxxx", "senha", strDate);
        Usuario Robertinho = new Usuario(1, "Robertinho", "Teste@fiap.com", "(23)xxxx-xxxx", "coxinha123", strDate);
        List <Usuario> users = new ArrayList<Usuario>();
        users.add(Robertinho);
        users.add(Guilherme);
        
      
        
        remover("Guilherme");
        
        for (Usuario usuario : users) {
     			System.out.println(users);
     		}
        
        
	}

	public static List<Usuario> remover(String nome) {
		Iterator<Usuario> iterator = users.iterator();
		while (iterator.hasNext()) {
			Usuario usuario = iterator.next();
			if(usuario.getNome() == nome) {
				iterator.remove();
			}
		}
		return users;
	}
	
	
	
	public Usuario(int id, String nome, String email, String telefone, String senha, String dataCadastro) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
		this.dataCadastro = dataCadastro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(long dataCadastro) {
		this.dataCadastro = Long.toString(dataCadastro);

	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + " \t nome=" + nome + " \t email=" + email + " \t telefone=" + telefone
				+ " \t senha=" + senha + "\t dataCadastro=" + dataCadastro + " ]";
	}

}
