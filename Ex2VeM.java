package Familia44;

import java.util.Scanner;

public class Ex2VeM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
			� Os n�meros pares digitados;  
			� A soma dos n�meros pares digitados; 
			� Os n�meros �mpares digitados; 
			� A quantidade de n�meros �mpares digitados.*/
		
		
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
				
				System.out.println("Os n�meros pares s�o: "+ numeros[y]);
				
			}else if(numeros[y]%2 !=0) {
				contImpar++;
				System.out.println("Os n�meros impares s�o: "+ numeros[y]);
			}
		}
		
		System.out.println("A soma dos n�meros pares �: "+soma);
		System.out.println("Os N�meros �mpares s�o: "+contImpar);
		
		
		
		


	}

}
