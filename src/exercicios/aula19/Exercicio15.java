package exercicios.aula19;

public class Exercicio15 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int contaPar = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                contaPar++;
            }
        }
        System.out.println("Existem " + contaPar + " elementos pares e " + (A.length - contaPar) + " elementos ímpares no array.");
    }
}
