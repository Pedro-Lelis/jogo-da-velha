package application;

import game.Menu;
import game.Tabuleiro;

public class Program {
	public static void main(String[] args) {
	

		Tabuleiro tab = new Tabuleiro();
		Menu.imprimeTabuleiro(tab);
		
		tab.setPosicao(1, 1);
		Menu.imprimeTabuleiro(tab);
	}
}
