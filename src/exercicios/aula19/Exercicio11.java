package exercicios.aula19;

public class Exercicio11 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("O número de elementos pares do vetor é " + count);
    }
}
