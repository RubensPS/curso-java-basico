package exercicios.aula19;

import java.sql.Array;
import java.util.Arrays;

public class Exercicio02 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] B = new int[8];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] * 2;
        }
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));

    }
}
