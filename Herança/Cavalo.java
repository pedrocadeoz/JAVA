package Herança;

public class Cavalo extends Animal{
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	public void trotar() {
		System.out.println("Cavalo trotando");
	}
	

}