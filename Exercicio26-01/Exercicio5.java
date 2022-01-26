package Familia44;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nota1, nota2, nota3, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota: ");
		nota1 = leia.nextDouble();
		System.out.println("Entre com a segunda nota: ");
		nota2 = leia.nextDouble();
		System.out.println("Entre com a terceira nota: ");
		nota3 = leia.nextDouble();
		
		media = ((nota1*2)+(nota2*3)+(nota3*5)) / 10;
		
		System.out.println("A média ponderada das suas notas é de: " +media);



	}

}
