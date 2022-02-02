package POO;

public class Cliente {
	
	private static int geraId=0;
	private int id;
	private String nome;
	private int idade;
	private String email;
	private String cpf;
	
	{
		geraId++;
		id = geraId;
	}
	public void compraChocolate() {
		if(idade>=18) {
			System.out.println(nome + " tem " + idade +" anos e comprou uma barra de chocolate");
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String toString() {
		return ("id: " + id);
	}

}
