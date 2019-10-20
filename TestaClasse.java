
public class TestaClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente Pedro = new Cliente("Pedro Pacheco", "666.666.666-66", "Programador");
			
			
		Conta contaDoPedro = new Conta(Pedro);
		
			contaDoPedro.deposita(100);
			
			System.out.println(contaDoPedro.titular.nome);
			System.out.println(contaDoPedro.titular.profissao);
	}

}
