package exercicios.aula19;

import java.util.Arrays;

public class Exercicio25 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] B = new int[10];
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                B[i] = 1;
            } else B[i] = 0;
        }
        System.out.println(Arrays.toString(B));
    }
}
