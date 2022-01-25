package exercicios.aula19;

public class Exercicio32 {
    public static void main(String[] args) {
        int[] A = {2, 3, 4, 5, 6};
        for (int i = 0; i < A.length; i++) {
            System.out.println("Tabuada de " + A[i]);
            for (int j = 0; j < 11; j++) {
                System.out.println(A[i] + " x " + j + " = " + A[i]*j);
            }
            System.out.println("\n");
        }
    }
}
