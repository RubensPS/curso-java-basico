package exercicios.aula19;

public class Exercicio24 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        boolean flag = false;
        for (int i = 0; i < (A.length/2); i++) {
            if (A[i] != A[(A.length-1)-i]) {
                flag = true;
                System.out.println("O número não é um palíndromo.");
                break;
            }
        }
        if (!flag) {
            System.out.println("O número é um palíndromo.");
        }
    }
}
