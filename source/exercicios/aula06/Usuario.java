package exercicios.aula06;

public class Usuario implements Comparable<Usuario> {
	long id;
	String nome, senha;

	public Usuario(long id, String nome, String senha) {
		this.id = id;
		this.nome = nome;
		this.senha = senha;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int compareTo(Usuario user) {
		if (this.getId() < user.getId()) {
			return -1;
		}
		if (this.getId() > user.getId()) {
			return 1;
		}
		return 0;
	}
	public void recuperaUsuario(){
		Object objeto = Teste.mapa.get(this.getId());
		Usuario usuario = (Usuario) objeto;
		System.out.println("O usuario selecionado foi: " + usuario.getNome());
	}

}
