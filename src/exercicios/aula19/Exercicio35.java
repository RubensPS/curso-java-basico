package exercicios.aula19;

public class Exercicio35 {
    public static void main(String[] args) {
        int[] A = {6, 10, 15, 22, 36, 45, 66, 79, 82, 99};
        for (int i = 0; i < A.length; i++) {
            System.out.println("\nDivisores de " + A[i] + ":");
            for (int j = 1; j <= A[i]; j++) {
                if (A[i] % j == 0) {
                    System.out.print(j + ", ");
                }
            }
        }
    }
}
