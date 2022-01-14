package exercicios.aula13;

import java.util.Scanner;

public class Exercicio03 {
    public static void main (String[] Args) {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        num1 = input.nextInt();
        System.out.println("Digite o segundo número:");
        num2 = input.nextInt();
        System.out.println("A soma dos números é: " + (num1+num2));

    }

}
