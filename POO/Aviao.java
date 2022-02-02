package POO;

import java.util.Scanner;

public class Aviao {
	
	private String modelo;
	private String cor;
	private boolean combustivel;
	private boolean aeroporto;
	
	
	public Aviao(String modelo, String cor) {
		this.modelo = modelo;
		this.cor = cor;
	}
	
	Scanner leia = new Scanner(System.in);
	
	public void abastecimento() {
		int gas = leia.nextInt();
		if(gas==1) {
			this.combustivel = true;
		}else {
			this.combustivel = false;
		}
	}

	public void voar() {
		if(combustivel == true) {
			System.out.println("Atenção passageiros, preparem-se para a decolagem\n\n");
		}else {
			System.out.println("O avião não possuí combustível suficiente, favor abastecer!");
		}
	}
	
	public void aeroporto() {
		
		int pista = leia.nextInt();
		leia.close();
		if(pista==1) {
			this.aeroporto = true;
		}else {
			this.aeroporto = false;
		}
	}
	
	public void pousar() {
		if(aeroporto==true) {
			System.out.println("Preparem-se para aterrisar");
		}
		
	}

	public String getModelo() {
		return modelo;
	}
 
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isCombustivel() {
		return combustivel;
	}

	public void setCombustivel(boolean combustivel) {
		this.combustivel = combustivel;
	}

	public boolean isAeroporto() {
		return aeroporto;
	}

	public void setAeroporto(boolean aeroporto) {
		this.aeroporto = aeroporto;
	}

}
