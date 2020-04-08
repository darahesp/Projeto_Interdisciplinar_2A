package models;

public class Empresa {
	
//	Declaração das variáveis
	
	private String nome;
	private String email;
	private String telefone;
	private String cnpj;
	private String endereco;
	private String cep;
	
	
//	Construtor cheio
	public Empresa(String nome, String email, String telefone, String cnpj, String endereco, String cep) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.cep = cep;
	}

//  Construtor vazio
	
    public Empresa() {
	super();
}

    
//  Métodos Get e Set
    
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
    
	

}
