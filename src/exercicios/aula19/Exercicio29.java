package exercicios.aula19;

import java.util.Arrays;

public class Exercicio29 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] B = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] C = new int[20];
        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                C[i] = A[i];
            } else C[i] = B[i-10];
        }
        System.out.println(Arrays.toString(C));
    }
}
