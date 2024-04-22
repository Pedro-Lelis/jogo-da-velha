package game;

import player.Jogador;

public class Tabuleiro {
	private String[][] posicao;
	private Jogador jogadorAtual;

	public Tabuleiro() {
		posicao = new String[3][3];
		for (Integer i = 0; i < 3; i++) {
			for (Integer j = 0; j < 3; j++) {
				posicao[i][j] = "-";
			}
		}
		jogadorAtual = Jogador.x;
	}

	public String getPosicao(Integer linha, Integer coluna) {
		return posicao[linha][coluna];
	}

	public void setPosicao(Integer linha, Integer coluna) {

		if (this.posicao[linha][coluna] == "-") {
			this.posicao[linha][coluna] = jogadorAtual.toString();
			if (this.jogadorAtual == Jogador.x) {
				this.jogadorAtual = Jogador.o;
			} else {
				this.jogadorAtual = Jogador.x;
			}
		} else {
			System.out.println("Posição ja ocupada, escolha outra.");
		}

	}

	public Jogador getJogadorAtual() {
		return this.jogadorAtual;
	}

	public Jogador vencedor() {
		if (jogadorAtual == Jogador.x) {
			return Jogador.o;
		}
		return Jogador.x;
	}

	public boolean velha() {
		for (Integer i = 0; i < 3; i++) {
			for (Integer j = 0; j < 3; j++) {
				if (posicao[i][j] == "-") {
					return false;
				}
			}
		}
		return true;
	}

	public boolean marcouLinha(Jogador jogador, Integer i) {

		return posicao[i][0] == jogador.toString() && posicao[i][1] == jogador.toString()
				&& posicao[i][2] == jogador.toString();
	}

	public boolean marcouColuna(Jogador jogador, Integer i) {
		return posicao[0][i] == jogador.toString() && posicao[1][i] == jogador.toString()
				&& posicao[2][i] == jogador.toString();
	}

	public boolean marcouDiagonal(Jogador jogador) {

		return (posicao[0][0] == jogador.toString() && posicao[1][1] == jogador.toString()
				&& posicao[2][2] == jogador.toString())
				|| (posicao[0][2] == jogador.toString() && posicao[1][1] == jogador.toString()
						&& posicao[2][0] == jogador.toString());
	}

	public boolean venceu() {
		for (Integer i = 0; i < 3; i++) {

			boolean marcou = marcouLinha(Jogador.x, i) || marcouLinha(Jogador.o, i) || marcouColuna(Jogador.x, i)
					|| marcouColuna(Jogador.o, i);
			if (marcou)
				return true;
		}

		return marcouDiagonal(Jogador.x) || marcouDiagonal(Jogador.o);
	}

}
