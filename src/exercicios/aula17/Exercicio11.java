package exercicios.aula17;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int soma = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        num1 = input.nextInt();
        System.out.println("Digite o segundo número:");
        num2 = input.nextInt();
        if (num1 > num2) {
            for (int i = num2+1; i < num1; i++) {
                soma += i;
                System.out.print(i + " ");
            }
        } else if (num2 > num1) {
            for (int i = num1+1; i < num2; i++) {
                soma += i;
                System.out.print(i + " ");
            }
        } else System.out.println("Os números não podem ser iguais.");
        System.out.println("\nSoma: " + soma);
    }
}
