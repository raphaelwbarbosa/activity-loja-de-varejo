package lojadevarejo;

public class Programmer {

	public static void main(String[] args) {
		System.out.println("Informações do Cliente");
		Cliente client1 = new Cliente();
		client1.nomeCliente = "João";
		client1.dataNascimento = "23/02/2004";
		client1.cidade = "Porto Alegre";
		client1.bairro = "Assis Brasil";
		client1.rua = "Av Coronel Dico";
		client1.cep = "000";
		client1.cpf = "123-123";
		
		
		System.out.println("Nome do Cliente:" +client1.nomeCliente);
		
		System.out.println("Data de nascimento:" +client1.dataNascimento);
	
		System.out.println("O Cliente Mora na Rua:" +client1.rua);
		
		System.out.println("No bairro:" +client1.bairro);
		
		System.out.println("Na cidade:" +client1.cidade);
		
		System.out.println("CEP:" +client1.cep);
		
		System.out.println("CPF: "+client1.cpf);
		
		
		Vendedor vend1 = new Vendedor();
		
		vend1.nomeVendedor = "Raphael";
		vend1.dataNascimentoVendedor = "22/05/1998";
		vend1.ruaVendedor = "Av.Bento Gonçalves";
		vend1.bairroVendedor = "Partenon";
		vend1.cidadeVendedor = "Porto Alegre";
		vend1.cepVendedor = "120";
		vend1.cpfVendedor = "654-432";
		
		System.out.println("Informações do Vendedor");
		
		System.out.println("Nome do Vendedor:" +vend1.nomeVendedor);
		System.out.println("Data de Nascimento:" +vend1.dataNascimentoVendedor);
		System.out.println("Rua do Vendedor:" +vend1.ruaVendedor);
		System.out.println("Bairro do Vendedor:" +vend1.bairroVendedor);
		System.out.println("Cidade do Vendedor:" +vend1.cidadeVendedor);
		System.out.println("CEP:" +vend1.cepVendedor);
		System.out.println("CPF:" +vend1.cpfVendedor);
		
		System.out.println("Informações do Estoque:");
		
		
		Estoque est1 = new Estoque();
		est1.nome = "Processador AMD Ryzen";
		est1.peso = "1,2g";
		est1.presente = "Presente no Estoque";
		est1.quantidade = "174 undidades";
		System.out.println(est1.nome);
		System.out.println("Peso do Produto: "+est1.peso);
		System.out.println(est1.presente);
		System.out.println("Produtos Disponíveis no Estoque: "+est1.quantidade);
		
		
		System.out.println("Informações da compra:");
		Produtos pro1 = new Produtos();
		
		pro1.produto = "Processador AMD Ryzen";
		pro1.valor = "R$ 1729,90";
		pro1.informacoesProduto =  " Cache 35MB, 3.7GHz (4.6GHz Max Turbo), AM4 - 100-100000065BOX";
		pro1.dataEntrega = "Aproximadamente 28/09/2021";
		
		System.out.println("Produto Encomendado: "+pro1.produto);
		System.out.println("Valor do Produto: "+pro1.valor);
		System.out.println("Informações do Produto: "+pro1.informacoesProduto);
		System.out.println("Data de Entrega: "+pro1.dataEntrega);
		
		
				
		
		
		
		
		
		
		
				
	
		
		
		
		
		
		
		
		
	}

}
