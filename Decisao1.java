package Familia44;

import java.util.Scanner;

public class Decisao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1, n2, n3, media;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com a primeira nota:");
		n1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota:");
		n2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota:");
		n3 = leia.nextFloat();
		
		media = (n1 + n2 + n3) / 3;
		System.out.printf("\nSua média foi de: %2.2f"+media);
		
		if(media>=7 && media<=10) { 
			System.out.println("\nAlune aprovade!");
		}
		
		else if (media>=5 && media<7) {
			
			System.out.println("Alune de exame!");
		}
		
		else { 
			System.out.println("\nAlune reprovade!");
		}

	}

}
