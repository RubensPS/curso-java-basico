package exercicios.aula20;

import java.util.Random;

public class Exercicio01 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int maior = 0;
        int linha = 0;
        int coluna = 0;
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = random.nextInt(10);
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        System.out.println("O maior elemento da matriz é o matriz[" + linha + "][" + coluna + "]." + "\nValor = " + maior);
    }
}
