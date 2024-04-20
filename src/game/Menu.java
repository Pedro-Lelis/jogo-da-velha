package game;

import java.util.Scanner;

public class Menu {

	Scanner scan = new Scanner(System.in);

	public Menu() {
	}

	public Integer lerLinha() {
		Integer linha = 0;
		while (linha <= 0 || linha >3) {
			try {
				System.out.print("Linha(1 a 3): ");
				linha = scan.nextInt();
				if(linha <= 0 || linha >3) {
					System.out.println("Valor invalido, tente novamente.");
				}
			} catch (RuntimeException e) {
				System.out.println("Valor invalido, preencha novamente.");
				scan.next();
			}
		}
		return (3 - linha);
	}

	public Integer lerColuna() {
		Integer coluna = 0;
		while (coluna <= 0 || coluna >3) {
			try {
				System.out.print("Coluna(1 a 3): ");
				coluna = scan.nextInt();
				if(coluna <= 0 || coluna >3) {
					System.out.println("Valor invalido, tente novamente.");
				}
			} catch (RuntimeException e) {
				System.out.println("Valor invalido, preencha novamente.");
				scan.next();
			}
		}
		return (coluna - 1);
	}

	public static void imprimeTabuleiro() {
		for (Integer i = 0; i < 3; i++) {
			System.out.print((3 - i) + " ");
			for (Integer j = 0; j < 3; j++) {
				System.out.print("- ");
			}
			System.out.println();
		}
		System.out.println("  1 2 3");
	}

	public static void imprimeTabuleiro(Tabuleiro tab) {
		for (Integer i = 0; i < 3; i++) {
			System.out.print((3 - i) + " ");
			for (Integer j = 0; j < 3; j++) {
				if (tab.getPosicao(i, j) == null) {
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
