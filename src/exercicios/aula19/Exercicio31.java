package exercicios.aula19;

import java.util.Arrays;

public class Exercicio31 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] B = new int[A.length];
        int pares = 0;
        int impares = A.length-1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                B[pares] = A[i];
                pares++;
            } else {
                B[impares] = A[i];
                impares--;
            }
        }
        System.out.println(Arrays.toString(B));

    }
}
