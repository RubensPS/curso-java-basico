package exercicios.aula19;

import java.util.Arrays;


public class Exercicio18 {
    public static void main(String[] args) {
        int menor;
        int maior;
        int posMenor = 0;
        int posMaior = 0;
        int[] A = {15, 22, 25, 31, 33, 38, 40, 44, 55, 63};
        menor = Arrays.stream(A).min().getAsInt();
        maior = Arrays.stream(A).max().getAsInt();
        for (int i = 0; i < A.length; i++) {
            if (A[i] == menor) {
                posMenor = i;
            } else if (A[i] == maior) {
                posMaior = i;
            }
        }
        System.out.println("O menor elemento do array está na posição " + posMenor + " e é igual a " + menor);
        System.out.println("O maior elemento do array está na posição " + posMaior + " e é igual a " + maior);
    }
}
