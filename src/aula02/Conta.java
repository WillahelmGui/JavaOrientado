package aula02;

import java.util.Date;

public class Conta {

	// atributos
	private int numeroConta, agencia;
	private String senha;
	private Date dataAbertura;
	private double saldo;
	private Cliente cliente; //composicao //private encapsulamento 

	public Conta(Cliente cliente, int numeroConta, int agencia, String senha) {
		//atributos
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.dataAbertura = new Date(System.currentTimeMillis());
		this.senha = senha;
		System.out.println("Conta criada");
		System.out.println("Data abertura: " + this.dataAbertura);
	}
	//METODOS
	// Sacar
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	// Depositar
	public void depositar (double valor) {
		this.saldo += valor;
	}


	// ConsultarSaldo
	public void exibirSaldo() {
		System.out.println(this.cliente.getNomeTitular() + " Saldo: " + this.saldo);
	}
	//this é o objeto que esta chamando o metodo
	//Tranferencia
	public void transferir(Conta conta,double valor) {
		boolean teste =this.sacar(valor);
		if(teste == true) {
			conta.depositar(valor);
		}
		
	}

}
