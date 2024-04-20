package application;

import game.Menu;
import game.Tabuleiro;

public class Program {
	public static void main(String[] args) {
	

		Tabuleiro tab = new Tabuleiro();
		Menu menu = new Menu();
		
		while(true) {
				Menu.imprimeTabuleiro(tab);
			
				tab.setPosicao(menu.lerLinha(), menu.lerColuna());
		
			
		}

	}
}
