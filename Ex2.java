package Familia44;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		
		int num1,num2,num3,p1 = 0,p2 = 0,p3 = 0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com o primeiro n�mero: ");
		num1 = leia.nextInt();
		System.out.println("Entre com o segundo n�mero: ");
		num2 = leia.nextInt();
		System.out.println("Entre com o terceiro n�mero: ");
		num3 = leia.nextInt();
		
		if(num1 < num2 && num1 < num3) { 
			p1 = num1;
		if(num2 < num3) { 
			p2 = num2;
			p3 = num3;
		} else {
			p2 = num3;
			p3 = num2;
			
		}
	}
		
		if(num2 < num1 && num2 < num3) { 
			p1 = num2;
		if(num2 < num3) { 
			p2 = num1;
			p3 = num3;
		} else {
			p2 = num3;
			p3 = num1;
			
			
		}
	}
		
		if(num3 < num2 && num3 < num1) { 
			p1 = num3;
		if(num2 < num1) { 
			p2 = num2;
			p3 = num1;
		} else {
			p2 = num1;
			p1 = num2;
			
		}
	}
			
			System.out.println("A ordem crescente dos n�meros � " +p1+" " +p2+" " +p3);


	}

}
