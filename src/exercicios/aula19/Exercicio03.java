package exercicios.aula19;

import java.util.Arrays;

public class Exercicio03 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] B = new int[15];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] * A[i];
        }
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
    }
}
