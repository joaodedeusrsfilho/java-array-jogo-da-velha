package matrizes;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
//		Faça um programa para jogar o jogo da velha. O programa deve
//		permitir que dois jogadores façam uma partida do jogo da velha,
//		usando o computador para ver o tabuleiro. Cada jogador vai
//		alternadamente informando a posição onde deseja colocar a sua peça
//		('O' ou 'X'). o programa deve impedir jogadas inválidas e 
//		determinar automaticamente quando o jogo terminou e quem foi o 
//		vencedor (jogador1 ou jogador2). A cada nova jogada, o programa
//		deve atualizar a situação do tabuleiro na tela.

		Scanner ler = new Scanner(System.in);

		char[][] jogoDaVelha = new char[3][3];

		boolean fecharPrograma = false;
		int jogadaDaVez = 1;
		char letraDaJogada;
		int linha = 0;
		boolean linhaValida = false;
		int coluna = 0;
		boolean colunaValida = false;

		while (!fecharPrograma) {
			System.out.println("Jogador 1 joga com = 'X'");
			System.out.println("Jogador 2 joga com = 'O'");
			if (jogadaDaVez % 2 == 1) {
				System.out.println();
				System.out.println("Vez do jogador 1 - digite a linha entre 1 e 3");
				letraDaJogada = 'X';
			} else {
				System.out.println();
				System.out.println("Vez do jogador 2 - digite a linha entre 1 e 3");
				letraDaJogada = 'O';
			}
			linha = ler.nextInt();
//			verificar linha
			while (!linhaValida) {
				if (linha >= 1 && linha <= 3) {
					linhaValida = true;
				} else {
					System.out.println("Linha invalida, tente novamente.");
				}
			}
			System.out.println("Digite a coluna entre 1 e 3");
			coluna = ler.nextInt();
			while (!colunaValida) {
				if (coluna >= 1 && coluna <= 3) {
					colunaValida = true;
				} else {
					System.out.println("Coluna invalida, tente novamente.");
				}
			}
			linha--;
			coluna--;
//			verificar se a jogada ja foi realizada anteriormente
			if (jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O') {
				System.out.println("Jogada ja realizada por outro jogador, tente novamente.");
			} else {
				jogoDaVelha[linha][coluna] = letraDaJogada;
				jogadaDaVez++;
			}
			System.out.println();
//			imprimir tabuleiro
			for (int i = 0; i < jogoDaVelha.length; i++) {
				for (int j = 0; j < jogoDaVelha[i].length; j++) {
					System.out.print(jogoDaVelha[i][j] + " |");
				}
				System.out.println();
			}

			System.out.println();
			if (jogadaDaVez > 9) {
				System.out.println("Limite de jogadas atingido. jogo fechado com sucesso");
				fecharPrograma = true;
			}
//			verificar quem ganhou
			if ((jogoDaVelha[0][0] == 'X' && jogoDaVelha[0][1] == 'X' && jogoDaVelha[0][2] == 'X')
					|| jogoDaVelha[1][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[1][2] == 'X'
					|| jogoDaVelha[2][0] == 'X' && jogoDaVelha[2][1] == 'X' && jogoDaVelha[2][2] == 'X'
					|| jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][0] == 'X' && jogoDaVelha[2][0] == 'X'
					|| jogoDaVelha[0][1] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][1] == 'X'
					|| jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][2] == 'X' && jogoDaVelha[2][2] == 'X'
					|| jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][2] == 'X'
					|| jogoDaVelha[2][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[0][2] == 'X') {
				System.out.println("Jogador 1, ganhou...PARABENS");
				fecharPrograma = true;
			}
			if ((jogoDaVelha[0][0] == 'O' && jogoDaVelha[0][1] == 'O' && jogoDaVelha[0][2] == 'O')
					|| jogoDaVelha[1][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[1][2] == 'O'
					|| jogoDaVelha[2][0] == 'O' && jogoDaVelha[2][1] == 'O' && jogoDaVelha[2][2] == 'O'
					|| jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][0] == 'O' && jogoDaVelha[2][0] == 'O'
					|| jogoDaVelha[0][1] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][1] == 'O'
					|| jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][2] == 'O' && jogoDaVelha[2][2] == 'O'
					|| jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][2] == 'O'
					|| jogoDaVelha[2][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[0][2] == 'O') {
				System.out.println("Jogador 2, ganhou...PARABENS");
				fecharPrograma = true;
			}
		}
	}
}
