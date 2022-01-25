package exercicios.aula19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Exercicio30 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        List<Integer> B = new ArrayList();
        List<Integer> C = new ArrayList();
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                B.add(A[i]);
            } else C.add(A[i]);
        }
        System.out.println("A = " + Arrays.toString(A));
        System.out.println("B = " + B);
        System.out.println("C = " + C);

        //A alternativa, utilizando apenas Array, seria verificar quantos elementos de A são pares,
        // quantos são ímpares e só então criar os vetores com o tamanho definido e utilizar contadores
        //em ambos para saber em qual indice parou a adição de elementos.
        int[] D = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < D.length; i++) {
            if (D[i] % 2 == 0) {
                pares++;
            } else impares++;
        }
        int[] E = new int[pares];
        int[] F = new int[impares];
        int indexE = 0;
        int indexF = 0;
        for (int i = 0; i < D.length; i++) {
            if (D[i] % 2 == 0) {
                E[indexE] = D[i];
                indexE++;
            } else {
                F[indexF] = D[i];
                indexF++;
            }
        }
        System.out.println("\nD = " + Arrays.toString(D));
        System.out.println("E = " + Arrays.toString(E));
        System.out.println("F = " + Arrays.toString(F));
    }
}
