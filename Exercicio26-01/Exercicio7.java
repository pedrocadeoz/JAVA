package Familia44;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a,b,c,d,e,f,x,y;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o valor de A: ");
		a = leia.nextDouble();
		System.out.println("Entre com o valor de B: ");
		b = leia.nextDouble();
		System.out.println("Entre com o valor de C: ");
		c = leia.nextDouble();
		System.out.println("Entre com o valor de D: ");
		d = leia.nextDouble();
		System.out.println("Entre com o valor de E: ");
		e = leia.nextDouble();
		System.out.println("Entre com o valor de F: ");
		f = leia.nextDouble();
		
		x = (c*e-b*f)/(a*e-b*d);
		y = (a*f-c*d)/(a*e-b*d);
		
		System.out.println("O valor de x é: "+x+"\nO valor de y é: "+y);
	}

}
