package matrizes;

import java.util.Scanner;

public class JogoDaVelhaTeste {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		JogoDaVelha jogoDaVelha = new JogoDaVelha();

		System.out.println("Jogador 1 joga com = 'X'");
		System.out.println("Jogador 2 joga com = 'O'");
		
		boolean fecharWhile = false;
		char sinalJogador;
		int linha = 0, coluna = 0;
		
		while(!fecharWhile) {
			if (jogoDaVelha.vezJogador()) {
				System.out.println();
				System.out.println("Vez do jogador 1 - digite a linha entre 1 e 3");
				sinalJogador = 'X';
			} else {
				System.out.println();
				System.out.println("Vez do jogador 2 - digite a linha entre 1 e 3");
				sinalJogador = 'O';
			}
			linha = escolherJogada("linha", ler);
			coluna = escolherJogada("coluna", ler);
			
			if(!jogoDaVelha.validarJogada(linha, coluna, sinalJogador)) {
				System.out.println("Jogada invalida...");	
			}else {
				System.out.println("Jogada Realiza com sucesso.");
			}
			
			jogoDaVelha.imprimirTabuleiro();
			
			if(jogoDaVelha.verificarGanhador(sinalJogador)) {
				System.out.println("Parabens, jogador 1 ganhou.");
				fecharWhile = true;
			}else if(jogoDaVelha.verificarGanhador(sinalJogador)){
				System.out.println("Parabens, jogador 2 ganhou.");
				fecharWhile = true;
			}
			if (jogoDaVelha.jogadaDaVez > 9) {
				System.out.println("Limite de jogadas atingido. jogo fechado com sucesso");
				fecharWhile = false;
			}
		}
	}
	static int escolherJogada(String linhaOuColuna, Scanner ler) {
///		verificar linha
		boolean fecharWhile = false;
		int valorColetado = 0;

		while (!fecharWhile) {
			System.out.println("Entre com a " + linhaOuColuna + " (1,2 ou 3");
			valorColetado = ler.nextInt();

			if (valorColetado >= 1 && valorColetado <= 3) {
				fecharWhile = true;
			} else {
				System.out.println("Linha invalida, tente novamente.");
			}
		}
		valorColetado--;//deduzindo -1 no valor do index escolhido pelo o usuario
		return valorColetado;
	}
}
