package exercicios.aula20;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        String[][] tabuleiro = new String[3][3];
        String jogada = "";
        String vazio = "   ";
        Scanner input = new Scanner(System.in);
        String jogador01 = "";
        String jogador02 = "";
        String simboloJogador01 = "";
        String simboloJogador02 = "";
        boolean fim = false;
        boolean checa = false;

        System.out.println("!!!JOGO DA VELHA!!!");
        System.out.println("--------------------------");
        System.out.println("REGRAS:" + "\n1 - Escolha o nome para os dois jogadores; \n2 - Escolha qual símbolo vai representar cada jogador: X ou O;" +
                "\n3 - Escolha a linha e a coluna na sua vez para marcar sua jogada (de 0 a 2 cada); \n4 - Vence quem conseguir preencher " +
                "uma linha, coluna ou diagonal.");
        System.out.println("--------------------------");
        System.out.println("Digite o nome dos jogadores:");
        System.out.println("Jogador 01:");
        jogador01 = input.next();
        System.out.println("Jogador 02:");
        jogador02 = input.next();
        System.out.println("Digite o simbolo para representá-lo " + jogador01 + ":");
        simboloJogador01 = input.next().toUpperCase();
        if (simboloJogador01.equals("X")) {
            simboloJogador01 = " X ";
            simboloJogador02 = " O ";
        } else if (simboloJogador01.equals("O")) {
            simboloJogador01 = " O ";
            simboloJogador02 = " X ";
        }
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[0].length; j++)
                tabuleiro[i][j] = "   ";
        }

        System.out.println("!!!O JOGO COMEÇOU!!!");
        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.println("\n-------------");
            System.out.print("|");
            for (int j = 0; j < tabuleiro[0].length; j++) {
                System.out.print(tabuleiro[i][j] + "|");
            }
        }
        System.out.println("\n-------------");

        outerwhile:
        while (!fim) {

            while (!checa) {

                System.out.println(jogador01 + " digite sua jogada:");
                jogada = input.next();
                if (tabuleiro[Integer.parseInt(jogada.substring(0,1))][Integer.parseInt(jogada.substring(1))].equals(vazio)) {
                    tabuleiro[Integer.parseInt(jogada.substring(0,1))][Integer.parseInt(jogada.substring(1))] = simboloJogador01;
                    checa = true;
                } else {
                    System.out.println("A posição já está marcada, digite novamente.");
                }
            }
            checa = false;

            for (int i = 0; i < tabuleiro.length; i++) {
                System.out.println("\n-------------");
                System.out.print("|");
                for (int j = 0; j < tabuleiro[0].length; j++) {
                    System.out.print(tabuleiro[i][j] + "|");
                }
            }
            System.out.println("\n-------------");

            if (simboloJogador01.equals(" X ")) {
                if ((tabuleiro[0][0].equals(" X ") && tabuleiro[0][1].equals(" X ") && tabuleiro[0][2].equals(" X ")) ||
                        (tabuleiro[1][0].equals(" X ") && tabuleiro[1][1].equals(" X ") && tabuleiro[1][2].equals(" X ")) ||
                        (tabuleiro[2][0].equals(" X ") && tabuleiro[2][1].equals(" X ") && tabuleiro[2][2].equals(" X ")) ||
                        (tabuleiro[0][0].equals(" X ") && tabuleiro[1][0].equals(" X ") && tabuleiro[2][0].equals(" X ")) ||
                        (tabuleiro[0][1].equals(" X ") && tabuleiro[1][1].equals(" X ") && tabuleiro[2][1].equals(" X ")) ||
                        (tabuleiro[0][2].equals(" X ") && tabuleiro[1][2].equals(" X ") && tabuleiro[2][2].equals(" X ")) ||
                        (tabuleiro[0][0].equals(" X ") && tabuleiro[1][1].equals(" X ") && tabuleiro[2][2].equals(" X ")) ||
                        (tabuleiro[2][0].equals(" X ") && tabuleiro[1][1].equals(" X ") && tabuleiro[0][2].equals(" X "))) {
                    fim = true;
                    System.out.println("PARABÉNS " + jogador01 + "!!! VOCÊ VENCEU O JOGO!!!");
                    break outerwhile;
                }
            }
            else if (simboloJogador01.equals(" O ")) {
                if ((tabuleiro[0][0].equals(" O ") && tabuleiro[0][1].equals(" O ") && tabuleiro[0][2].equals(" O ")) ||
                        (tabuleiro[1][0].equals(" O ") && tabuleiro[1][1].equals(" O ") && tabuleiro[1][2].equals(" O ")) ||
                        (tabuleiro[2][0].equals(" O ") && tabuleiro[2][1].equals(" O ") && tabuleiro[2][2].equals(" O ")) ||
                        (tabuleiro[0][0].equals(" O ") && tabuleiro[1][0].equals(" O ") && tabuleiro[2][0].equals(" O ")) ||
                        (tabuleiro[0][1].equals(" O ") && tabuleiro[1][1].equals(" O ") && tabuleiro[2][1].equals(" O ")) ||
                        (tabuleiro[0][2].equals(" O ") && tabuleiro[1][2].equals(" O ") && tabuleiro[2][2].equals(" O ")) ||
                        (tabuleiro[0][0].equals(" O ") && tabuleiro[1][1].equals(" O ") && tabuleiro[2][2].equals(" O ")) ||
                        (tabuleiro[2][0].equals(" O ") && tabuleiro[1][1].equals(" O ") && tabuleiro[0][2].equals(" O "))) {
                    fim = true;
                    System.out.println("PARABÉNS " + jogador01 + "!!! VOCÊ VENCEU O JOGO!!!");
                    break outerwhile;
                }
            }

            while (!checa) {

                System.out.println("\n" + jogador02 + " digite sua jogada:");
                jogada = input.next();
                if (tabuleiro[Integer.parseInt(jogada.substring(0,1))][Integer.parseInt(jogada.substring(1))].equals(vazio)) {
                    tabuleiro[Integer.parseInt(jogada.substring(0,1))][Integer.parseInt(jogada.substring(1))] = simboloJogador02;
                    checa = true;
                } else {
                    System.out.println("A posição já está marcada, digite novamente.");
                }
            }
            checa = false;

            for (int i = 0; i < tabuleiro.length; i++) {
                System.out.print("|");
                for (int j = 0; j < tabuleiro[0].length; j++) {
                    System.out.print(tabuleiro[i][j] + "|");
                }
                System.out.println("\n-------------");
            }

            if (simboloJogador02.equals(" X ")) {
                if ((tabuleiro[0][0].equals(" X ") && tabuleiro[0][1].equals(" X ") && tabuleiro[0][2].equals(" X ")) ||
                        (tabuleiro[1][0].equals(" X ") && tabuleiro[1][1].equals(" X ") && tabuleiro[1][2].equals(" X ")) ||
                        (tabuleiro[2][0].equals(" X ") && tabuleiro[2][1].equals(" X ") && tabuleiro[2][2].equals(" X ")) ||
                        (tabuleiro[0][0].equals(" X ") && tabuleiro[1][0].equals(" X ") && tabuleiro[2][0].equals(" X ")) ||
                        (tabuleiro[0][1].equals(" X ") && tabuleiro[1][1].equals(" X ") && tabuleiro[2][1].equals(" X ")) ||
                        (tabuleiro[0][2].equals(" X ") && tabuleiro[1][2].equals(" X ") && tabuleiro[2][2].equals(" X ")) ||
                        (tabuleiro[0][0].equals(" X ") && tabuleiro[1][1].equals(" X ") && tabuleiro[2][2].equals(" X ")) ||
                        (tabuleiro[2][0].equals(" X ") && tabuleiro[1][1].equals(" X ") && tabuleiro[0][2].equals(" X "))) {
                    fim = true;
                    System.out.println("PARABÉNS " + jogador02 + "!!! VOCÊ VENCEU O JOGO!!!");
                    break outerwhile;
                }
            }
            else if (simboloJogador02.equals(" O ")) {
                if ((tabuleiro[0][0].equals(" O ") && tabuleiro[0][1].equals(" O ") && tabuleiro[0][2].equals(" O ")) ||
                        (tabuleiro[1][0].equals(" O ") && tabuleiro[1][1].equals(" O ") && tabuleiro[1][2].equals(" O ")) ||
                        (tabuleiro[2][0].equals(" O ") && tabuleiro[2][1].equals(" O ") && tabuleiro[2][2].equals(" O ")) ||
                        (tabuleiro[0][0].equals(" O ") && tabuleiro[1][0].equals(" O ") && tabuleiro[2][0].equals(" O ")) ||
                        (tabuleiro[0][1].equals(" O ") && tabuleiro[1][1].equals(" O ") && tabuleiro[2][1].equals(" O ")) ||
                        (tabuleiro[0][2].equals(" O ") && tabuleiro[1][2].equals(" O ") && tabuleiro[2][2].equals(" O ")) ||
                        (tabuleiro[0][0].equals(" O ") && tabuleiro[1][1].equals(" O ") && tabuleiro[2][2].equals(" O ")) ||
                        (tabuleiro[2][0].equals(" O ") && tabuleiro[1][1].equals(" O ") && tabuleiro[0][2].equals(" O "))) {
                    fim = true;
                    System.out.println("PARABÉNS " + jogador02 + "!!! VOCÊ VENCEU O JOGO!!!");
                    break outerwhile;
                }
            }
        }
    }
}
