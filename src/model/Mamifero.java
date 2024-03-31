/**
 * 
 */
package model;

/**
 * @author Lucas Batista 31 de mar. de 2024
 */
public class Mamifero extends Animal {
	private String alimento;

	public Mamifero() {
		super();
		setAmbiente("Terra");
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public void alteraAlimento(String alimento) {
		this.alimento = alimento;
	}

	public void dados() {
		super.dados();
		System.out.println("Alimento: " + alimento);
	}
}