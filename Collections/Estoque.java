package Collections;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

	private List<String> produtos = new ArrayList<>();

	public void imprime() {
		for (String lista : produtos) {
			System.out.println(lista);
		}

	}

	public List<String> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<String> produtos) {
		this.produtos = produtos;
	}

}
