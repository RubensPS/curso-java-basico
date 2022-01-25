package exercicios.aula20;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int contaPares = 0;
        int contaImpares = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Entre com o valor do elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
                if (matriz[i][j] % 2 == 0) {
                    contaPares++;
                } else contaImpares++;
            }
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
        System.out.println("\nNúmeros pares: " + contaPares);
        System.out.println("Números ímpares: " + contaImpares);
    }
}
