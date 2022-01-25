package exercicios.aula19;

import java.util.Arrays;

public class Exercicio04 {
    public static void main(String[] args) {
        double[] A = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169, 196, 225};
        double[] B = new double[15];
        for (int i = 0; i < A.length; i++) {
            B[i] = Math.sqrt(A[i]);
        }
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
    }
}
