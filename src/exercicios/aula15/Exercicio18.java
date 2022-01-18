package exercicios.aula15;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero a ser verificado:");
        numero = input.nextInt();
        if (numero%2 == 0) {
            System.out.println("O número digitado é par.");
        } else System.out.println("O número digitado é ímpar.");
    }
}
