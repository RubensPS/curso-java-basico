package exercicios.aula19;

public class Exercicio22 {
    public static void main(String[] args) {
        int[] A = new int[10];
        int countZeros = 0;
        double percentageZero;
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) Math.round(Math.random()*1);
            if (A[i] ==0) {
                countZeros++;
            }
        }
        percentageZero = ((double) countZeros / (double) A.length) * 100;
        System.out.println("A porcentagem de elementos iguais a 0 é de " + percentageZero + "%");
        System.out.println("A porcentagem de elementos iguais a 1 é de " + (100 - percentageZero) + "%");
    }
}
