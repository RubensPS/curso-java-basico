package exercicios.aula19;

public class Exercicio12 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int soma = 0;
        for (int i = 0; i < A.length; i++) {
            soma += A[i];
        }
        System.out.println("A soma dos elementos do vetor é " + soma);
    }
}
