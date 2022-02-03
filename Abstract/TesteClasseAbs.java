package Herança;

import java.util.Scanner;

public class TesteClasseAbs {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		CachorroAbs cachorro = new CachorroAbs();
		
		CavaloAbs cavalo = new CavaloAbs();
		
		ClasseAbs animais = null;

		int opc;

		do {
			System.out.println("Escolha um animal: \n1- Cachorro\n2 - Cavalo");
			opc = leia.nextInt();
			switch (opc) {
			case 1:
				animais = cachorro;
				break;
			case 2:
				animais = cavalo;
				break;
			default:
				System.out.println("Opção inválida!");
			}
			if (animais != null) {

				animais.som((Math.random() * 2.0));
				break;

			}
		} while (opc < 3 || opc > 1);

	}

}
