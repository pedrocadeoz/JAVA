package Familia44;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double custof, custoconsu;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual o custo de fábrica?");
		custof = leia.nextDouble();
		
		custoconsu = custof + (custof*0.28) + (custof*0.45);
		
		System.out.println("O custo do consumidor é de R$"+custoconsu);

	}

}
