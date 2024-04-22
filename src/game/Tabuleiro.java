package game;

import player.Jogador;

public class Tabuleiro {
	private String[][] posicao;
	private Jogador jogadorAtual;
	private boolean vencedor;

	public Tabuleiro() {
		posicao = new String[3][3];
		for (Integer i = 0; i < 3 ; i++) {
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
		this.posicao[linha][coluna] = jogadorAtual.toString();
		if(this.jogadorAtual==Jogador.x) {
			this.jogadorAtual=Jogador.o;
		} else {
			this.jogadorAtual=Jogador.x;
		}		
	}
	
	public Jogador getJogadorAtual() {
		return this.jogadorAtual;
	}
	
	public Jogador oponente(Jogador jogador) {
		if(jogador==Jogador.x) {
			return Jogador.o;
		}
		return Jogador.x;
	}
	
	public boolean velha() {
		for (Integer i = 0; i < 3; i++) {
			for (Integer j = 0; j < 3; j++) {
				if(posicao[i][j] == "-") {
					return false;
				}
			}
		}
		return true;
	}
	
}
