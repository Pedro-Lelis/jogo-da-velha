package application;

import game.Menu;
import game.Tabuleiro;

public class Program {
	public static void main(String[] args) {
	

		Tabuleiro tab = new Tabuleiro();
		Menu menu = new Menu();
		
		while(!tab.velha() && !tab.venceu()) {
			
				Menu.imprimeTabuleiro(tab);			
				tab.setPosicao(menu.lerLinha(), menu.lerColuna());
			
		}
		
		Menu.imprimeTabuleiro(tab);
		if (tab.velha()) {
			System.out.println("Deu velha!");
		}
		
		if (tab.venceu()) {
			System.out.println("Jogador '" + tab.vencedor() + "' venceu!");
		}

	}
}
