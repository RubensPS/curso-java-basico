package exercicios.aula20;

import java.util.Random;

public class Exercicio02 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        Random random = new Random();
        int menorCinco = 10;
        int maiorCinco = 0;
        int menorSete = 10;
        int maiorSete = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = random.nextInt(10);
                if (i == 5) {
                    if (matriz[i][j] < menorCinco) {
                        menorCinco = matriz[i][j];
                    }
                    if (matriz[i][j] > maiorCinco) {
                        maiorCinco = matriz[i][j];
                    }
                }
                if (j == 7) {
                    if (matriz[i][j] < menorSete) {
                        menorSete = matriz[i][j];
                    }
                    if (matriz[i][j] > maiorSete) {
                        maiorSete = matriz[i][j];
                    }
                }
            }
        }
        System.out.println("Menor da linha 5: " + menorCinco);
        System.out.println("Maior da linha 5: " + maiorCinco);
        System.out.println("\nMenor da coluna 7: " + menorSete);
        System.out.println("Maior da coluna 7: " + maiorSete);
    }
}
