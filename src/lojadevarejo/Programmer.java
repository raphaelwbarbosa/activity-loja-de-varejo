package lojadevarejo;

public class Programmer {

	public static void main(String[] args) {
		System.out.println("Informações do Cliente");
		Cliente client1 = new Cliente("123-123", "23/02/2004", "João");
		client1.setNomeCliente  ("João");
		client1.setDataNascimento  ("23/02/2004");
		client1.setCidade  ("Porto Alegre");
		client1.setBairro  ("Assis Brasil");
		client1.setRua  ("Av Coronel Dico");
		client1.setCep  ("000");
		client1.setCpf  ("123-123");
		
		
		System.out.println("Nome do Cliente:" +client1.getNomeCliente());
		
		System.out.println("Data de nascimento:" +client1.getDataNascimento());
	
		System.out.println("O Cliente Mora na Rua:" +client1.getRua());
		
		System.out.println("No bairro:" +client1.getBairro());
		
		System.out.println("Na cidade:" +client1.getCidade1());
		
		System.out.println("CEP:" +client1.getCEP());
		
		System.out.println("CPF: "+client1.getCPF());
		
		
		Vendedor vend1 = new Vendedor("654-432", "22/05/1998", "Raphael");
		
		vend1.setNomeVendedor ("Raphael");
		vend1.setDataNascimentoVendedor ("22/05/1998");
		vend1.setRuaVendedor ("Av.Bento Gonçalves");
		vend1.setBairroVendedor  ("Partenon");
		vend1.setCidadeVendedor  ("Porto Alegre");
		vend1.setCepVendedor  ("120");
		vend1.setCpfVendedor ("654-432");
		
		System.out.println("Informações do Vendedor");
		
		System.out.println("Nome do Vendedor:" +vend1.getNomeVendedor());
		System.out.println("Data de Nascimento:" +vend1.getDataNascimentoVendedor());
		System.out.println("Rua do Vendedor:" +vend1.getRuaVendedor());
		System.out.println("Bairro do Vendedor:" +vend1.getBairroVendedor());
		System.out.println("Cidade do Vendedor:" +vend1.getCidadeVendedor());
		System.out.println("CEP:" +vend1.getCepVendedor());
		System.out.println("CPF:" +vend1.getCpfVendedor());
		
		System.out.println("Informações do Estoque:");
		
		
		Estoque est1 = new Estoque("Processador AMD Ryzen", "1");
		est1.setNome  ("Processador AMD Ryzen");
		est1.setPeso  ("1,2g");
		est1.setPresente  ("Presente no Estoque");
		est1.setQuantidade  ("174 undidades");
		System.out.println(est1.getNome());
		System.out.println("Peso do Produto: "+est1.getPeso());
		System.out.println(est1.getPresente());
		System.out.println("Produtos Disponíveis no Estoque: "+est1.getQuantidade());
		
		
		System.out.println("Informações da compra:");
		Produtos pro1 = new Produtos("Processador AMD Ryzen", "R$ 1729,90");
		
		pro1.setProduto  ("Processador AMD Ryzen");
		pro1.setValor  ("R$ 1729,90");
		pro1.setInformacoesProduto  (" Cache 35MB, 3.7GHz (4.6GHz Max Turbo), AM4 - 100-100000065BOX");
		pro1.setDataEntrega  ("Aproximadamente 28/09/2021");
		
		System.out.println("Produto Encomendado: "+pro1.getProduto());
		System.out.println("Valor do Produto: "+pro1.getValor());
		System.out.println("Informações do Produto: "+pro1.getInformacoesProduto());
		System.out.println("Data de Entrega: "+pro1.getDataEntrega());
		
		
				
		
		
		
		
		
		
		
				
	
		
		
		
		
		
		
		
		
	}

}
