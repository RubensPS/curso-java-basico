package exercicios.aula19;

public class Exercicio33 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 17, 22, 30};
        boolean primo = true;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 1) {
                primo = false;
            } else {
                for (int j = A[i]-1; j > 1; j--) {
                    if (A[i] % j == 0) {
                        primo = false;
                    }
                }
            }
            if (primo) {
                System.out.println("Elemento " + A[i] + " = É PRIMO");
            } else System.out.println("Elemento " + A[i] + " = NÃO É PRIMO");
            primo = true;
        }
    }
}
