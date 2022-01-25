package exercicios.aula19;

import java.util.Arrays;

public class Exercicio27 {
    public static void main(String[] args) {
        int[] A = {1, 2, 4, 6, 7, 8, 7, 11, 9, 10};
        char[] B = new char[10];
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 7) {
                B[i] = 'a';
            } else if (A[i] == 7) {
                B[i] = 'b';
            } else if (A[i] > 7 && A[i] < 10) {
                B[i] = 'c';
            } else if (A[i] == 10) {
                B[i] = 'd';
            } else B[i] = 'e';
        }
        System.out.println(Arrays.toString(B));
    }
}
