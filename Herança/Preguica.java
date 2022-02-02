package Herança;

public class Preguica extends Animal{
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	public void subirArvore() {
		System.out.println("Preguiça comendo bamboo");
	}
}