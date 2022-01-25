package exercicios.aula19;

public class Exercicio14 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double soma = 0;
        double media = 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 0) {
                count++;
                soma += (double)A[i];
            }
        }
        media = soma / count;
        System.out.println("A média dos elementos ímpares do vetor é " + media);
    }
}
