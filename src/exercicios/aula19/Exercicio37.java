package exercicios.aula19;

import java.util.Arrays;

public class Exercicio37 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        long[] B = new long[15];
        for (int k = 0; k < B.length; k++) {
            B[k] = 1;
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = A[i]; j > 0; j--)
            B[i] *= j;
        }
        System.out.println(Arrays.toString(B));
    }
}
