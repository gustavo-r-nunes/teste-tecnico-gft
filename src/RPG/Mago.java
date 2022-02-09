package RPG;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem {

	private List<String> magias = new ArrayList<>();
	
	public Mago(String nome) {
		super(nome);
		setVida(700);
		setInteligencia(30);
		setForca(10);
	}
	
	public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
	}

	public List<String> getMagias() {
		System.out.printf("Magias aprendidas: %s\n", magias);
		return magias;
	}
	
	
	@Override
	public void lvlUp() {
		setMana(getMana() + 20);
		setInteligencia(getInteligencia() + 20);
		super.lvlUp();
	}
	
	public int attack() {
		int numeroAleatorio = new Random().nextInt(180);
		return (getInteligencia() / 2 * (getLevel() * getLevel())) + numeroAleatorio;
	}
	
	public void aprenderMagia(String magia) {
		this.magias.add(magia);
	}
}
