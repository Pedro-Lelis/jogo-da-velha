package application;

import game.Menu;
import game.Tabuleiro;

public class Program {
	public static void main(String[] args) {
	

		Tabuleiro tab = new Tabuleiro();
		Menu menu = new Menu();
		
		while(!tab.velha()) {
				Menu.imprimeTabuleiro(tab);
			
				tab.setPosicao(menu.lerLinha(), menu.lerColuna());
				System.out.println(tab.velha());
			
		}
		
		Menu.imprimeTabuleiro(tab);

	}
}
