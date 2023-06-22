package fabricaVeiculo;

public class Moto extends Veiculo {
	private int temBau;
	private int bauStatus = 1; // começa com 1 pois o baú estará fechado, por padrão.

	public Moto(String cor, Motor motor, Pneu pneu, Transmissao transmissao, String numeroSerie, String placa,
			String porte, String modelo, double limiteVeiculo, int temBau, int bauStatus, double valorVeiculo,
			double tanque, double capacidadeRodagem, double capacidadeTanque) {
		super(cor, motor, pneu, transmissao, numeroSerie, placa, porte, modelo, limiteVeiculo, valorVeiculo, tanque,
				capacidadeRodagem, capacidadeTanque);

		this.temBau = temBau;
	}

	public void adicionarBau() {
		if (this.temBau == 0) {
			System.out.println("Adicionando baú a moto");
			this.temBau = 1;
		} else {
			System.out.println("A moto já tem um baú, nada acontece.");
		}

	}

	public void retirarBau() {
		if (this.temBau == 1) {
			System.out.println("Retirando o baú");
			this.temBau = 0;
		} else {
			System.out.println("Não há baú na moto.");
		}
	}

	public void abrirBau() {
		if (this.temBau == 1) {
			if (bauStatus == 0) {
				System.out.println("O baú já está aberto, nada acontece.");
			} else {
				System.out.println("abrindo baú.");
				bauStatus = 0;
			}
		} else {
			System.out.println("Não existem baús para serem alterados");
		}
	}

	public void fecharBau() {
		if (this.temBau == 1) {
			if (this.bauStatus == 1) {
				System.out.println("O baú já está fechado, nada acontece.");
			} else {
				System.out.println("fechando baú.");
				bauStatus = 1;
			}
		} else {
			System.out.println("Não existem baús para serem alterados");
		}
	}
}