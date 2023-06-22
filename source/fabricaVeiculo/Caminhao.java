package fabricaVeiculo;

public class Caminhao extends Veiculo {

	private int janela;
	private int carga;

	public Caminhao(String cor, Motor motor, Pneu pneu, Transmissao transmissao, String numeroSerie, String placa,
			String porte, String modelo, double limiteVeiculo, double valorVeiculo, double tanque,
			double capacidadeRodagem, double capacidadeTanque) {
		super(cor, motor, pneu, transmissao, numeroSerie, placa, porte, modelo, limiteVeiculo, valorVeiculo, tanque,
				capacidadeRodagem, capacidadeTanque);
	}

	// Métodos

// janela = 0 aberta/ 1 = fechada.
	public void abrirJanela() {
		if (janela == 1) {
			System.out.println("A janela abriu.");
			janela = 0;
		} else {
			System.out.println("A janelá já está aberta, nada aconteceu.");
		}
	}

	public void fecharJanela() {
		if (janela == 0) {
			System.out.println("A janela fechou.");
			janela = 1;
		} else {
			janela = 1;
			System.out.println("A janela já estava fechada, nada aconteceu.");
		}
	}

	public void adicionarCarga() {
		if (carga == 0) {
			System.out.println("Carga adicionada");
			carga = 1;
		} else {
			System.out.println("O caminhão já está carregado.");
		}
	}

	public void retirarCarga() {
		if (carga == 1) {
			System.out.println("Carga retirada");
			carga = 0;
		} else {
			System.out.println("O caminhão já está descarregado.");
		}
	}
}