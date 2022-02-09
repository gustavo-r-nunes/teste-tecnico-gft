package acertar.numero;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num;
		int tentativa;
		boolean condicao = false;
		
		Random random = new Random();
		num = random.nextInt(10);
		
		do {
			System.out.println("Adivinhe o numero de 0 a 10: ");
			tentativa = entrada.nextInt();
		
			if (tentativa == num) {
					System.out.println("Parabéns!!! Você acertou");
					condicao = true;
			}	 else {
			    	System.out.println("Você errou... tente novamente!");
		    }
			
		} while (condicao == false);
		
		entrada.close();
	}

}
