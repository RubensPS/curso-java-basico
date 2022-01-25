package exercicios.aula19;

public class Exercicio13 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int soma = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 5 == 0) {
                soma += A[i];
            }
        }
        System.out.println("A soma dos elementos do vetor que são divisíveis por 5 é " + soma);
    }
}
