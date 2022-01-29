package Familia44;

import java.util.Scanner;

public class Ex3VeM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		
		int[][] matriz = new int [3][3];
		int cont = 0;
		
		Scanner leia = new Scanner (System.in);
		
		for(int x=0; x<3; x++) { 
			for(int y=0; y<3; y++) {
				System.out.print("Entre com um valor: ");
				matriz[x][y] = leia.nextInt();
				if(matriz[x][y]>10) { 
					cont++;
				}
				
			}
		}
			
		System.out.println("A quantidaade de valores maiores que 10: "+cont);
		leia.close();

	}

}
