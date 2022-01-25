package exercicios.aula19;

public class Exercicio16 {
    public static void main(String[] args) {
        int[] A = {1, 4, 7, 11, 15, 22, 25, 26, 29, 30};
        int soma = 0;
        int conta15 = 0;
        double countMaior = 0;
        double somaMaior = 0;
        double media = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 15) {
                soma += A[i];
            } else if (A[i] == 15) {
                conta15++;
            } else {
                somaMaior += A[i];
                countMaior++;
            }
        }
        media = somaMaior / countMaior;
        System.out.println("A soma dos elementos menores que 15 é " + soma);
        System.out.println("O número de elementos iguais a 15 é " + conta15);
        System.out.println("A média dos elementos maiores que 15 é " + media);
    }
}
