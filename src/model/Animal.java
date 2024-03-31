/**
 * 
 */
package model;

/**
 * @author Lucas Batista 31 de mar. de 2024
 */
public class Animal {
	private String nome;
	private int comprimento;
	private int patas;
	private String cor;
	private String ambiente;
	private float velocidade;

	public Animal() {
		this.patas = 4;
		this.ambiente = "Terra";
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	// Métodos
	public void alteraNome(String nome) {
		this.nome = nome;
	}

	public void alteraComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	public void alteraCor(String cor) {
		this.cor = cor;
	}

	public void alteraVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	public void dados() {
		System.out.println("Animal: " + nome);
		System.out.println("Comprimento: " + comprimento + " cm");
		System.out.println("Patas: " + patas);
		System.out.println("Cor: " + cor);
		System.out.println("Ambiente: " + ambiente);
		System.out.println("Velocidade: " + velocidade + " m/s");
	}
}
