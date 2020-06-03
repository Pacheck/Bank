
public class TestaClasse {

	public static void main(String[] args) {
		
		Cliente Pedro = new Cliente("Pedro Pacheco", "222.222.222-22", "Dev");
			
			
		Conta contaDoPedro = new Conta(Pedro);
		
			contaDoPedro.deposita(100);
			
			System.out.println(contaDoPedro.titular.nome);
			System.out.println(contaDoPedro.titular.profissao);
	}

}
