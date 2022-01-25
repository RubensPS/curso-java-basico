package exercicios.aula19;

public class Exercicio34 {
    public static void main(String[] args) {
        int[] A = { 10, 20, 30, 40, 50};
        for (int i = 0; i < A.length; i++) {
            System.out.println("Lista de pares de " + A[i]);
            for (int j = 0; j < A[i]; j++) {
                if (j % 2 == 0) {
                    System.out.print(j + ", ");
                }
            }
            System.out.println("\n");
        }
    }
}
