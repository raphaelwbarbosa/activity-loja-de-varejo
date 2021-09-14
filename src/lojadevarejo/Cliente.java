package lojadevarejo;

public class Cliente {
	private String nomeCliente;
	private String cpf;
	private String dataNascimento;
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	//Getters
	
	public Cliente(String cpf, String nascimento, String nome) {
		this.cpf = cpf;
		this.nomeCliente = nome;
		this.dataNascimento = nascimento;
	}
	
	
	
	public String getNomeCliente() {
		return this.nomeCliente;
	}
	public String getCPF() {
		return this.cpf;
	}
	public String getDataNascimento() {
		return this.dataNascimento;
	}
	public String getRua() {
		return this.rua;
	}
	public String getBairro() {
		return this.bairro;
	}
	public String getCidade1() {
		return this.cidade;
	}
	public String getEstado(String string) {
		return this.estado;
	}
	public String getCEP() {
		return this.cep;
	}
	//Setters
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setCep(String cep) {
		this.cep = cep;
	
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}


