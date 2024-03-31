/**
 * 
 */
package view;

import model.Animal;
import model.Mamifero;
import model.Peixe;

/**
 * @author Lucas Batista 31 de mar. de 2024
 */
public class TesteAnimais {
	public static void main(String[] args) {
		// Criando animais
		Peixe tubarao = new Peixe();
		tubarao.setNome("Tubarão");
		tubarao.setComprimento(300);
		tubarao.setVelocidade(1.5f);
		tubarao.setCaracteristica("Barbatanas e cauda");

		Mamifero urso = new Mamifero();
		urso.setNome("Urso-do-canadá");
		urso.setComprimento(180);
		urso.setCor("Vermelho");
		urso.setAlimento("Mel");
		urso.setVelocidade(0.5f);

		Animal camelo = new Animal();
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		camelo.setCor("Amarelo");
		camelo.setVelocidade(2.0f);

		// Mostrando os dados dos animais
		System.out.println("Zoológico:");
		System.out.println("------------------------------");
		tubarao.dados();
		System.out.println("------------------------------");
		urso.dados();
		System.out.println("------------------------------");
		camelo.dados();
		System.out.println("------------------------------");
	}
}
