package Familia44;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x1,x2,y1,y2,dist;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o valorde Px1: ");
		x1 = leia.nextDouble();
		System.out.println("Entre com o valorde Px2: ");
		x2 = leia.nextDouble();
		System.out.println("Entre com o valorde y1: ");
		y1 = leia.nextDouble();
		System.out.println("Entre com o valorde Py2: ");
		y2 = leia.nextDouble();
		
		dist = Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
		
		System.out.println("A distância entre os dois pontos é de: "+ dist);

	}

}
