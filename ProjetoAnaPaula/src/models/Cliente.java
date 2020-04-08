package models;

public class Cliente {
	
	//Declaração de variáveis
		private String nome_cliente;
		private String data_nsc_cliente;
		private String cpf_cliente;
		private String rg_cliente;
		private String telefone_cliente;
		private String cep_cliente;
		private String endereco_cliente;
		private String complemento_cliente;
		private String cidade_cliente;
		private String estado_cliente;
		private String email_cliente;
		private String senha_cliente;
		
		//Construtor Cheio
		public Cliente(String nome_cliente, String data_nsc_cliente, String cpf_cliente, String rg_cliente,
				String telefone_cliente, String cep_cliente, String endereco_cliente, String complemento_cliente,
				String cidade_cliente, String estado_cliente, String email_cliente, String senha_cliente) {
			super();
			this.nome_cliente = nome_cliente;
			this.data_nsc_cliente = data_nsc_cliente;
			this.cpf_cliente = cpf_cliente;
			this.rg_cliente = rg_cliente;
			this.telefone_cliente = telefone_cliente;
			this.cep_cliente = cep_cliente;
			this.endereco_cliente = endereco_cliente;
			this.complemento_cliente = complemento_cliente;
			this.cidade_cliente = cidade_cliente;
			this.estado_cliente = estado_cliente;
			this.email_cliente = email_cliente;
			this.senha_cliente = senha_cliente;
		}

		//Construtor vazio
		public Cliente() {
			super();
		}

		
		//Métodos get e set
		public String getNome_cliente() {
			return nome_cliente;
		}

		public void setNome_cliente(String nome_cliente) {
			this.nome_cliente = nome_cliente;
		}

		public String getData_nsc_cliente() {
			return data_nsc_cliente;
		}

		public void setData_nsc_cliente(String data_nsc_cliente) {
			this.data_nsc_cliente = data_nsc_cliente;
		}

		public String getCpf_cliente() {
			return cpf_cliente;
		}

		public void setCpf_cliente(String cpf_cliente) {
			this.cpf_cliente = cpf_cliente;
		}

		public String getRg_cliente() {
			return rg_cliente;
		}

		public void setRg_cliente(String rg_cliente) {
			this.rg_cliente = rg_cliente;
		}

		public String getTelefone_cliente() {
			return telefone_cliente;
		}

		public void setTelefone_cliente(String telefone_cliente) {
			this.telefone_cliente = telefone_cliente;
		}

		public String getCep_cliente() {
			return cep_cliente;
		}

		public void setCep_cliente(String cep_cliente) {
			this.cep_cliente = cep_cliente;
		}

		public String getEndereco_cliente() {
			return endereco_cliente;
		}

		public void setEndereco_cliente(String endereco_cliente) {
			this.endereco_cliente = endereco_cliente;
		}

		public String getComplemento_cliente() {
			return complemento_cliente;
		}

		public void setComplemento_cliente(String complemento_cliente) {
			this.complemento_cliente = complemento_cliente;
		}

		public String getCidade_cliente() {
			return cidade_cliente;
		}

		public void setCidade_cliente(String cidade_cliente) {
			this.cidade_cliente = cidade_cliente;
		}

		public String getEstado_cliente() {
			return estado_cliente;
		}

		public void setEstado_cliente(String estado_cliente) {
			this.estado_cliente = estado_cliente;
		}

		public String getEmail_cliente() {
			return email_cliente;
		}

		public void setEmail_cliente(String email_cliente) {
			this.email_cliente = email_cliente;
		}

		public String getSenha_cliente() {
			return senha_cliente;
		}

		public void setSenha_cliente(String senha_cliente) {
			this.senha_cliente = senha_cliente;
		}
		
		
		
		
	
		
		
		
		

}
