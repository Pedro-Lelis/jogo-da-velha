package game;

import java.util.Scanner;

public class Menu {
	
	Scanner scan = new Scanner(System.in);

	public Menu() {
	}
	
	public Integer lerLinha() {
		System.out.print("Linha : ");
		return scan.nextInt();
	}
	
	public Integer lerColuna() {
		System.out.print("Coluna: ");
		return scan.nextInt();
	}
	
	public static void imprimeTabuleiro() {
		for (Integer i = 0; i < 3 ; i++) {
			System.out.print((3 - i) + " ");
			for (Integer j = 0; j < 3; j++) {
				System.out.print("- ");
			}
			System.out.println();
		}
		System.out.println("  1 2 3");
	}
	
	public static void imprimeTabuleiro(Tabuleiro tab) {
		for (Integer i = 0; i < 3 ; i++) {
			System.out.print((3 - i) + " ");
			for (Integer j = 0; j < 3; j++) {
				if(tab.getPosicao(i, j) == null) {
					System.out.print("- ");
				} else {
					System.out.print(tab.getPosicao(i, j) + " ");
				}
			}
			System.out.println();
		}
		System.out.println("  1 2 3");
	}
	

	
}
