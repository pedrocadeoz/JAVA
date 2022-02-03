package Heran�a;

public abstract class ClasseAbs {
	
	/*Implemente um programa que crie os 3 tipos de animais definidos no exerc�cio anterior
	 *e invoque o m�todo que emite o som de cada um de forma
	 * polim�rfica, isto �, independente do tipo de animal.
	 */
	private String especie;
	
	public ClasseAbs(String especie) { 
		this.especie = especie;
	}
	
	abstract public void som(double quantidade);

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
}
