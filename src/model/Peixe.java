/**
 * 
 */
package model;

/**
 * @author Lucas Batista 31 de mar. de 2024
 */
public class Peixe extends Animal {
	private String caracteristica;

	public Peixe() {
		super();
		setPatas(0);
		setAmbiente("Mar");
		setCor("Cinzento");
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public void alteraCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public void dados() {
		super.dados();
		System.out.println("Característica: " + caracteristica);
	}
}
