package RPG;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {

	private List<String> habilidades = new ArrayList<>();
	
	public Guerreiro(String nome) {
		super(nome);
		setVida(1000);
		setInteligencia(10);
		setForca(30);
	}
	
	public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
	}

	public List<String> getHabilidades() {
		System.out.printf("Habilidades aprendidas: %s\n", habilidades);
		return habilidades;
	}
	
	@Override
	public void lvlUp() {
		setVida(getVida() + 20);
		setForca(getForca() + 20);
		super.lvlUp();	
	}
	
	public int attack() {
		int numeroAleatorio = new Random().nextInt(180);
		return (getForca() / 2 * (getLevel() * getLevel())) + numeroAleatorio;
	}
	
	public void aprenderHabilidade(String habilidade) {
		this.habilidades.add(habilidade);
	}
}
