package Familia44;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a,b,c,R,S,D;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o valor de A: ");
		a= leia.nextDouble();
		System.out.println("Entre com o valor de B: ");
		b= leia.nextDouble();
		System.out.println("Entre com o valor de C: ");
		c= leia.nextDouble();
		
		R = Math.pow((a + b), 2);
		S = Math.pow((b + c), 2);
		D = (R + S) / 2;
		
		System.out.println("O valor de D é: " +D);

	}

}
