package lojadevarejo;

public class Vendedor {
	private String nomeVendedor;
	private String cpfVendedor;
	private String dataNascimentoVendedor;
	private String ruaVendedor;
	private String bairroVendedor;
	private String cidadeVendedor;
	private String estadoVendedor;
	private String cepVendedor;
//Getters 
	
	public Vendedor(String cpf, String nascimento, String nome) {
		this.cpfVendedor = cpf;
		this.nomeVendedor = nome;
		this.dataNascimentoVendedor = nascimento;
	}
	
	
	
	
	public String getNomeVendedor() {
		return this.nomeVendedor;
	}
	public String getCpfVendedor() {
		return this.cpfVendedor;
	}
	public String getDataNascimentoVendedor() {
		return this.dataNascimentoVendedor;
	}
	public String getRuaVendedor() {
		return this.ruaVendedor;
	}
	public String getBairroVendedor() {
		return this.bairroVendedor;
		}
	public String getCidadeVendedor() {
		return this.cidadeVendedor;
	}
	public String getEstadoVendedor() {
		return this.estadoVendedor;
	}
	public String getCepVendedor() {
		return this.cepVendedor;
	}
//Setters
	public void setRuaVendedor(String ruaVendedor) {
		this.ruaVendedor = ruaVendedor;
	}
	public void setBairroVendedor(String bairroVendedor) {
		this.bairroVendedor = bairroVendedor;
	}
	public void setCidadeVendedor(String cidadeVendedor) {
		this.cidadeVendedor = cidadeVendedor;
	}
	public void setEstadoVendedor(String estadoVendedor) {
		this.estadoVendedor = estadoVendedor;
	}
	public void setCepVendedor(String cepVendedor) {
		this.cepVendedor = cepVendedor;
	}
	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}
	public void setCpfVendedor(String cpfVendedor) {
		this.cpfVendedor = cpfVendedor;
	}
	public void setDataNascimentoVendedor(String dataNascimentoVendedor) {
		this.dataNascimentoVendedor = dataNascimentoVendedor;
	}
	

		
	}












