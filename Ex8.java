package Familia44;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
		
		int idade = 0, total50 = 0, total21 = 0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Informe uma idade: ");
		idade = leia.nextInt();
		
		while(idade !=-99) { 
			
			if(idade > 50) {
				total50++;
				
			}else if(idade<21){ 
				total21++;
			}
			
			System.out.println("Informe uma idade: ");
			idade = leia.nextInt();
			
		}
		
		System.out.println("o número de pessoas acima dos 50 anos foi de: "+total50+ "\nE o número de pessoas abaixo de 21 anos foi de: "+total21);

	}

}
