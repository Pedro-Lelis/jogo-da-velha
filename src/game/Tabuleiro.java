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
	
	public boolean venceu() {
		for(Integer i =0; i < 3; i++) {
			// linhas x
			if(posicao[i][0] == "x" && posicao[i][1] == "x" && posicao[i][2] == "x") {
				return true;
			}
			
			// linhas o
			if(posicao[i][0] == "o" && posicao[i][1] == "o" && posicao[i][2] == "o") {
				return true;
			}
			
			// coluna x
			if(posicao[0][i] == "x" && posicao[1][i] == "x" && posicao[2][i] == "x") {
				return true;
			}
			
			// coluna o
			if(posicao[0][i] == "o" && posicao[1][i] == "o" && posicao[2][i] == "o") {
				return true;
			}
		}
		
		
		// diagonais x
		if((posicao[0][0] == "x" && posicao[1][1] == "x" && posicao[2][2] == "x") || (posicao[0][2] == "x" && posicao[1][1] == "x" && posicao[2][0] == "x")) {
			return true;
		}
		
		// diagonais o
		if((posicao[0][0] == "o" && posicao[1][1] == "o" && posicao[2][2] == "o") || (posicao[0][2] == "o" && posicao[1][1] == "o" && posicao[2][0] == "o")) {
			return true;
		}
		
		return false;
	}
	
	
	
}
