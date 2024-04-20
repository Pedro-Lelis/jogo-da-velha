package game;


public class Tabuleiro {
	private String[][] posicao;

	public Tabuleiro() {
		posicao = new String[3][3];
		for (Integer i = 0; i < 3 ; i++) {
			for (Integer j = 0; j < 3; j++) {
				posicao[i][j] = "-";
			}
		}
	}

	public String getPosicao(Integer linha, Integer coluna) {
		return posicao[linha][coluna];
	}

	public void setPosicao(Integer linha, Integer coluna) {
		this.posicao[linha][coluna] = "x";

	}

}
