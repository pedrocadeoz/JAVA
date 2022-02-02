package Herança;

import java.util.Scanner;

public class Cachorro extends Animal{
	private int patas;
	private boolean dono = true;
	private boolean bebeuAgua;
	
	public Cachorro(String nome, int idade, int patas) {
		super(nome, idade);
		this.patas = patas;
	}
	
	Scanner leia = new Scanner(System.in);
	
	
	public void cava() {
		System.out.print("Quantas patas o seu cachorro tem? ");
		patas = leia.nextInt();
		
		if(patas==4) {
			System.out.println("Late");
		}else {
			System.out.println("Dorme");
		}
	}
	
	public void pegarBola() {
		
		while(dono == true) {
			System.out.println("pegar a bola");
			System.out.print("O dono continua no parque? ");
			dono = leia.nextBoolean();			
		}
		
		System.out.print("O dono foi embora\n\n");
		
	}
	
	public void correr() {
		System.out.println("Quantas patas seu cachorro tem? ");
		patas = leia.nextInt();
		if(patas==4 && bebeuAgua==true) {
			System.out.println("cachorro correndo");
		}
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public boolean isDono() {
		return dono;
	}

	public void setDono(boolean dono) {
		this.dono = dono;
	}

	public boolean isBebeuAgua() {
		return bebeuAgua;
	}

	public void setBebeuAgua(boolean bebeuAgua) {
		this.bebeuAgua = bebeuAgua;
	}

	public Scanner getLeia() {
		return leia;
	}

	public void setLeia(Scanner leia) {
		this.leia = leia;
	}
	
	
}
