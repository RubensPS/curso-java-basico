package exercicios.aula15;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        double numberSinal;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número:");
        numberSinal = input.nextDouble();
        if (numberSinal < 0) {
            System.out.println("O número é negativo.");
        } else if (numberSinal > 0) {
            System.out.println("O número é positivo.");
        } else System.out.println("O número é igual a zero.");
    }
}
