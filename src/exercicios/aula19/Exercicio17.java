package exercicios.aula19;

public class Exercicio17 {
    public static void main(String[] args) {
        int[] A = {15, 22, 25, 31, 33, 38, 40, 44, 55, 63};
        int counter = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 35) {
                counter++;
            }
        }
        System.out.println("O numero de pessoas com idade superior a 35 anos é de " + counter + " pessoas.");
    }
}
