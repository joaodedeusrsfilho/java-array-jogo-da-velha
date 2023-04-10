package matrizes;

import java.util.Scanner;

public class JogoDaVelha {
	
	char[][] jogoDaVelha = new char[3][3];//tabuleiro
	int jogadaDaVez = 1;

	boolean vezJogador() {
		if (jogadaDaVez % 2 == 1) {//vez do jogador numero1
			return true;
		}else {//vez do jogador numero2
			return false;
		}
	}
	boolean validarJogada(int linha, int coluna, char sinalJogador) {
//		verificar se a jogada ja foi realizada anteriormente
		if (jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O') {
			return false;
		} else {
			jogoDaVelha[linha][coluna] = sinalJogador;
			jogadaDaVez++;
			return true;
		}
	}
	void imprimirTabuleiro() {
//		imprimir tabuleiro
		for (int i = 0; i < jogoDaVelha.length; i++) {
			for (int j = 0; j < jogoDaVelha[i].length; j++) {
				System.out.print(jogoDaVelha[i][j] + " |");
			}
			System.out.println();
		}
	}
	boolean verificarGanhador(char sinalJogador) {
		if ((jogoDaVelha[0][0] == sinalJogador && jogoDaVelha[0][1] == sinalJogador && jogoDaVelha[0][2] == sinalJogador)
				|| jogoDaVelha[1][0] == sinalJogador && jogoDaVelha[1][1] == sinalJogador && jogoDaVelha[1][2] == sinalJogador
				|| jogoDaVelha[2][0] == sinalJogador && jogoDaVelha[2][1] == sinalJogador && jogoDaVelha[2][2] == sinalJogador
				|| jogoDaVelha[0][0] == sinalJogador && jogoDaVelha[1][0] == sinalJogador && jogoDaVelha[2][0] == sinalJogador
				|| jogoDaVelha[0][1] == sinalJogador && jogoDaVelha[1][1] == sinalJogador && jogoDaVelha[2][1] == sinalJogador
				|| jogoDaVelha[0][2] == sinalJogador && jogoDaVelha[1][2] == sinalJogador && jogoDaVelha[2][2] == sinalJogador
				|| jogoDaVelha[0][0] == sinalJogador && jogoDaVelha[1][1] == sinalJogador && jogoDaVelha[2][2] == sinalJogador
				|| jogoDaVelha[2][0] == sinalJogador && jogoDaVelha[1][1] == sinalJogador && jogoDaVelha[0][2] == sinalJogador) {
			return true;	
		}
		return false;
	}
}
