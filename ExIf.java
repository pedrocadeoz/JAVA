package Familia44;

import java.util.Scanner;

public class ExIf {

	public static void main(String[] args) {
		
		
		//Faça um programa que receba três inteiros e diga qual deles é o maior.

		int num1, num2, num3, maior = 0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEscreva o primeiro número: ");
		num1 = leia.nextInt();
		System.out.println("\nEscreva o segundo número: ");
		num2 = leia.nextInt();
		System.out.println("\nEscreva o terceiro número: ");
		num3 = leia.nextInt();
		
		if(num1>maior) { 
			maior = num1;
		}
		if(num2>maior) { 
			maior = num2;
		}
		if(num3>maior) { 
			maior = num3;
		}
		System.out.println("\nO maior número digitado foi "+maior);
		
		

	}

}
