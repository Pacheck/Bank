
public class Cliente {
	
	String nome;
	String cpf;
	String profissao;

	Cliente(String nome, String cpf, String profissao){
		
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
	} //Instancia com parametro

	public String getNome(){
		return this.nome;
	}
	
		
	public String getCpf() {
		return this.cpf;
	}
	
	
	public String getProfissao() {
		return this.profissao;
	}
	
	// Setters
	
	public boolean setNome(String nome) {
		this.nome = nome;
		return true;
	}	

	public boolean setCpf(String cpf) {
		this.cpf = cpf;
		return true;
	}
	
}
