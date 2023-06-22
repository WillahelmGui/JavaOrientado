package aula03;





import aula03.Banco.exceptions.SaldoInsuficiente;



public class TestaConta {

	public static void main(String[] args) throws SaldoInsuficiente {
		
		CDB CDB = new CDB();
		LCA LCA = new LCA();
		LCI LCI = new LCI();
		//CLASSE É A RECEITA DO BOLO / PROJETO
		
		
		
		//objetos
		Cliente guilherme = new Cliente("Guilherme", "111222333", "09/08/2005", "12095123", "Rua dos ipês");
		
		
		
		ContaCorrente contaGuilherme = new ContaCorrente(guilherme, 1, 1, "teste");
	
		contaGuilherme.depositar(1000);
		System.out.println(1);
		try {
			contaGuilherme.sacar(5000);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(2);
		try {
			contaGuilherme.investimento(CDB, 2000);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(3);
	}
	
}