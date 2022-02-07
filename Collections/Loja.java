package Collections;

public class Loja {

		public static void main(String[] args) {
		Estoque itens = new Estoque();
		
		itens.getProdutos().add("moletom");
		itens.getProdutos().add("bermuda");
		itens.getProdutos().add("chinelo");
		itens.getProdutos().add("tênis");
		
		itens.imprime();
		System.out.println("----------------");
		itens.getProdutos().remove(2);
		itens.imprime();
		System.out.println("----------------");
		itens.getProdutos().add(2, "bermuda");
		itens.imprime();
	}

}

