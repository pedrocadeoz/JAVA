package Familia44;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		
		//Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
		
		Scanner leia = new Scanner (System.in);
		
		for(int num = 1000; num < 2000; num++) { 
			if(num%11 == 5) { 
				System.out.println(num+"\n");
			}
		}

	}

}
