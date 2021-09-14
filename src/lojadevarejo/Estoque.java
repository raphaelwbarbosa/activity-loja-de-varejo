package lojadevarejo;

public class Estoque {
private String nome;	
private String peso;
private String quantidade;
private String presente;

public Estoque(String nome, String quantidade) {
	this.nome = nome;
	this.quantidade = quantidade;
}
//Getters
public String getNome() {
	return this.nome;
}
public String getPeso() {
	return this.peso;
}
public String getQuantidade() {
	return this.quantidade;
}
public String getPresente() {
	return this.presente;
}
//Setters
public void setPresente(String presente) {
	this.presente = presente;
}
public void setQuantidade(String quantidade) {
	this.quantidade = quantidade;
}
public void setNome(String nome) {
	this.nome = nome;
}
public void setPeso(String peso) {
	this.peso = peso;
}


}
