package Herança;

public class TesteHeranca {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Apolo", 1, 4);
		Cavalo cavalo = new Cavalo("Spirit", 75);
		Preguica preguica = new Preguica("Flecha", 4);
		
		cachorro.setBebeuAgua(true);
		cachorro.correr();
		cachorro.emitirSom();
		cavalo.trotar();
		cavalo.emitirSom();
		preguica.subirArvore();
		preguica.emitirSom();

	}

	}
