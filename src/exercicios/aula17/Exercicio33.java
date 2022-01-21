package exercicios.aula17;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        int numerador = 1;
        int denominador = 1;
        double termo;
        double soma = 1;
        int totalTermos;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número de termos para a sequência:");
        totalTermos = input.nextInt();
        System.out.print("s = 1/1");
        for (int i = 1; i <= totalTermos; i++) {
            numerador += 1;
            denominador += 2;
            termo = (double) numerador / (double) denominador;
            soma += termo;
            System.out.print(" + " + numerador + "/" + denominador);
        }
        System.out.println("\nA soma dos " + totalTermos + " termos é " + soma);
    }
}
