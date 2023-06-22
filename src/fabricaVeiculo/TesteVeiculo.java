package fabricaVeiculo;

public class TesteVeiculo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Criação do combustível
		Gasolina gasosa = new Gasolina();
		Alcool alcool = new Alcool();
		//Criação de novas partes do veículo.
		Motor tm  = new Motor("chevrolet", "gasolina");
		Pneu chev = new Pneu (12,"pirelli");
		Transmissao auto = new Transmissao ("5","automatico");
		//Criando novos veículos.	
//		Caminhao caminhaoJessica = new Caminhao ("Preto",tm,chev,auto,"1234","AFG1234","pequeno","hatch", 300.00, 5000);
//		Moto motoGui = new Moto ("Preto",tm,chev,auto,"1234","AFG1234","pequeno","hatch", 300.00, 0, 1, 10000);
		Carro matheusVeiculo = new Carro ("Vermelho",tm,chev,auto,"1234","AFG1234","pequeno","hatch", 250, 1, 1, 1, 5000, 0, 0, 49);
		//teste de funcionalidade dos veículos.
		
		
		
		matheusVeiculo.abastecer(20, gasosa);
		matheusVeiculo.abastecer(20, alcool);
		System.out.println(matheusVeiculo.getTanque());
	}

}
