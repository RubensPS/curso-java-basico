package exercicios.aula17;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número a ser verificado:");
        numero = input.nextInt();
        for (int i = 1; i < numero-1; i++) {
            if (numero%(numero-i) == 0) {
                System.out.println("O número não é primo.");
            System.exit(0);
            }
        }
        System.out.println("O número é primo.");
    }
}
