package exercicios.aula15;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        int lado1, lado2, lado3;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro lado:");
        lado1 = input.nextInt();
        System.out.println("Digite o segundo lado:");
        lado2 = input.nextInt();
        System.out.println("Digite o teceiro lado:");
        lado3 = input.nextInt();

        if ((lado1+lado2) > lado3 && (lado1+lado3) > lado2 && (lado2+lado3) > lado1) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("O triângulo é equilátero.");
            } else if (lado1 == lado2 ^ lado1 == lado3 ^ lado2 == lado3) {
                System.out.println("O triâmgulo é isosceles.");
            } else if (lado1 != lado2 && lado1!=lado3) {
                System.out.println("O trângulo é escaleno.");
            }
        } else System.out.println("Os três lados não formam um triângulo.");
    }
}
