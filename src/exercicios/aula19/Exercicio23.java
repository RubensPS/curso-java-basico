package exercicios.aula19;

public class Exercicio23 {
    public static void main(String[] args) {
        int[] A = {2, 4, 6, 8, 7, 12, 14, 16, 18, 20};
        boolean flag = false;
        for (int i = 0; i < A.length; i++) {
           if (A[i] % 2 != 0) {
               flag = true;
               System.out.println("O número " + A[i] + " de índice " + i + " é ímpar. Execução interrompida.");
               break;
           }
        }
        if (!flag) {
            System.out.println("O array possúi apenas números pares.");
        }
    }
}
