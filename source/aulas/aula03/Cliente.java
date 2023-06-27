package aulas.aula03;



//javabens
public class Cliente {
	//atributos
	private String nomeTitular, cpfTitular, rgTitular, enderecoTitular;
	private final String dataNasc;
	
	//constructor vazio
	// this se refere ao atributo
	
	
	
	//constructor --> metodo para instanciar um objeto
	public Cliente(String nomeTitular, String cpfTitular, String dataNasc, String rgTitular, String enderecoTitular) {
		
		
		
		this.nomeTitular = nomeTitular;
		this.cpfTitular = cpfTitular;
		this.dataNasc = dataNasc;
		this.rgTitular = rgTitular;
		this.enderecoTitular = enderecoTitular;
	}

	// getters / setters
	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public String getRgTitular() {
		return rgTitular;
	}

	public void setRgTitular(String rgTitular) {
		this.rgTitular = rgTitular;
	}

	public String getEnderecoTitular() {
		return enderecoTitular;
	}

	public void setEnderecoTitular(String enderecoTitular) {
		this.enderecoTitular = enderecoTitular;
	}

}

