package fabricaVeiculo;

import java.util.Date;

public class Veiculo {
//Testado pelo Matheus
	protected String numeroSerie, cor, placa, porte, modelo;
	protected Date dataFabricacao;
	protected int statusVeiculo;
	protected Motor motor;
	protected Pneu pneu;
	protected Transmissao transmissao;
	protected double limiteVeiculo, valorVeiculo, velocidadeVeiculo,tanque, capacidadeRodagem, capacidadeTanque;
	private static long contador;

	public Veiculo(String cor,Motor motor, Pneu pneu, Transmissao transmissao, String numeroSerie, String placa, String porte,
			String modelo, double limiteVeiculo, double valorVeiculo, double tanque, double capacidadeRodagem, double capacidadeTanque) {
		// apagar o SUPER
		this.motor = motor;
		this.pneu = pneu;
		this.transmissao = transmissao;
		this.numeroSerie = numeroSerie;
		this.modelo = modelo;
		this.placa = placa;
		this.porte = porte;
		this.dataFabricacao = new Date(System.currentTimeMillis());
		this.limiteVeiculo = limiteVeiculo;
		this.cor = cor;
		this.valorVeiculo = valorVeiculo;
		this.tanque = tanque;
		this.capacidadeRodagem = capacidadeRodagem;
		this.capacidadeTanque = capacidadeTanque;
		contador++;
	}

	public double getTanque() {
		return tanque;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public String getPorte() {
		return porte;
	}

	public Motor getMotor() {
		return motor;
	}

	public Pneu getPneu() {
		return pneu;
	}

	public double getValorVeiculo() {
		return valorVeiculo;
	}

	public double getCapacidadeRodagem() {
		return capacidadeRodagem;
	}

	public double getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public static long getContador() {
		return contador;
	}

	public boolean statusVeiculo(int valor) {
		statusVeiculo = valor;
//1 = ligado, 0 = desligado
		if (valor == 1) {
			return true;

		}
		return false;

	}

	public double acelerar(double valorAceleracao) {

		if (this.statusVeiculo == 1) {
			if (valorAceleracao > 0) {
				if (valorAceleracao > this.limiteVeiculo) {
					valorAceleracao = this.limiteVeiculo;
					this.velocidadeVeiculo = valorAceleracao;
					this.velocidadeVeiculo = valorAceleracao;
					System.out.println(velocidadeVeiculo + " KM/H");
					return velocidadeVeiculo;

				}
			} else {
				System.out.println("Você não pode acelerar valores menores que zero.");
				return this.velocidadeVeiculo;
			}
		} else {
			System.out.println("O veículo não pode acelerar pois está desligado");
			this.velocidadeVeiculo = 0.0;
		}
		this.velocidadeVeiculo = valorAceleracao;
		System.out.println(velocidadeVeiculo + " KM/H");
		return this.velocidadeVeiculo;
	}

	public double freiar(double freiar) {

		if (velocidadeVeiculo > 0) {
			velocidadeVeiculo -= freiar;
		}
		System.out.println(velocidadeVeiculo + " KM/H");
		return freiar;

	}

//	public double limiteVeiculo(double veloMax) {
//		return limiteVeiculo = veloMax;
//		
//	}

	public void exibirDadosVeiculo() {
		System.out.println("A data de fabricacao do veiculo e: " + dataFabricacao );
		System.out.println("O porte do veiculo e: "+ porte );
		System.out.println("A placa do veiculo e: " + placa);
		System.out.println("O numero de serie do veiculo e: "+ numeroSerie);
		System.out.println("A Cor do veiculo e: "+ cor);
		System.out.println("Limite do veiculo: "+ limiteVeiculo);
		System.out.println("O modelo do veiculo e: "+modelo);
		System.out.println("O veiculo custa: " +valorVeiculo);
	}

	public static void exibirContador() {
		if (contador == 1) {
			System.out.printf("Existe %s veículo criado no momento \n", contador);
		} else {
			System.out.printf("Existem %S veículos criados no momento. \n", contador);
		}
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public double getLimiteVeiculo() {
		return limiteVeiculo;
	}

	public void setLimiteVeiculo(double limiteVeiculo) {
		this.limiteVeiculo = limiteVeiculo;
	}

	public int getStatusVeiculo() {
		return statusVeiculo;
	}

	public void ligarVeiculo() {
		this.statusVeiculo = 1;
	}
	
	public int desligarVeiculo() {
		return this.statusVeiculo = 0;
	}

	public Transmissao getTransmissao() {
		return transmissao;
	}

	public void setTransmissao(Transmissao transmissao) {
		this.transmissao = transmissao;
	}

	public double getVelocidadeVeiculo() {
		return velocidadeVeiculo;
	}

	public void setVelocidadeVeiculo(double velocidadeVeiculo) {
		this.velocidadeVeiculo = velocidadeVeiculo;
	}

}
	