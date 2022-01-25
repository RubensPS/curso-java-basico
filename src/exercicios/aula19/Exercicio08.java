package exercicios.aula19;

import java.util.Arrays;

public class Exercicio08 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] B = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] C = new int[10];
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] * B[i];
        }
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        System.out.println(Arrays.toString(C));
    }
}
