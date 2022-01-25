package exercicios.aula19;

import java.util.Arrays;

public class Exercicio26 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] B = {10, 9, 8, 7, 5, 5, 4, 3, 2, 1};
        int[] C = new int[10];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > B[i]) {
                C[i] = 1;
            } else if (A[i] == B[i]) {
                C[i] = 0;
            } else C[i] = -1;
        }
        System.out.println(Arrays.toString(C));
    }
}
