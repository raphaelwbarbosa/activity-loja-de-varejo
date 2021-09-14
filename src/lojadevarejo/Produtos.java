package lojadevarejo;

public class Produtos {
private String produto;
private String informacoesProduto;
private String dataEntrega;
private String valor;

//Getters
public Produtos(String produto, String valor) {
	this.produto = produto;
	this.valor = valor;
}





public String getProduto() {
	return this.produto;
}
public String getInformacoesProduto() {
	return this.informacoesProduto;
}
public void setProduto(String produto) {
	this.produto = produto;
}
public void setInformacoesProduto(String informacoesProduto) {
	this.informacoesProduto = informacoesProduto;
}
public String getDataEntrega() {
	return this.dataEntrega;
}
public String getValor() {
	return this.valor;
}
//Setters
public void setDataEntrega(String dataEntrega) {
	this.dataEntrega = dataEntrega;
}
public void setValor(String valor) {
	this.valor = valor;
}

}
