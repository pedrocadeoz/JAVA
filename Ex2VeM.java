package Familia44;

import java.util.Scanner;

public class Ex2VeM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*2- Faça um programa que receba 6 números inteiros e mostre: 
			• Os números pares digitados;  
			• A soma dos números pares digitados; 
			• Os números ímpares digitados; 
			• A quantidade de números ímpares digitados.*/
		
		
		int [] numeros = new int [6];
		int soma = 0, contImpar = 0;
		
		Scanner leia = new Scanner (System.in);
		
		for(int x=0; x<=5; x++) {
			System.out.print("Digite os valores: ");
		numeros[x] = leia.nextInt();
		
		}
		
		for(int y=0; y<=5; y++) { 
			
			if(numeros[y]%2==0) {
				soma = soma + numeros[y];
				
				System.out.println("Os números pares são: "+ numeros[y]);
				
			}else if(numeros[y]%2 !=0) {
				contImpar++;
				System.out.println("Os números impares são: "+ numeros[y]);
			}
		}
		
		System.out.println("A soma dos números pares é: "+soma);
		System.out.println("Os Números ímpares são: "+contImpar);
		
		
		
		


	}

}
