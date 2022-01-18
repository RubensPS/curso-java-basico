package exercicios.aula15;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        int numero1, numero2;
        double resultado = 0;
        String operacao;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        numero1 = input.nextInt();
        System.out.println("Digite o segundo numero:");
        numero2 = input.nextInt();
        System.out.println("Digite a operação desejada:" + "\nSoma: +" + "\nSubtração: -" + "\nMultiplicação: *" + "\nDivisão: /");
        operacao = input.next();
        switch (operacao) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero1;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                resultado = (double) numero1 / numero2;
                break;
        }
        System.out.println("Resultado: " + resultado);
        if (resultado%2 == 0) {
            System.out.println("O resultado da operação é par.");
        } else System.out.println("O número digitado é ímpar.");
        if (resultado > 0) {
            System.out.println("O resultado é positivo.");
        } else if (resultado < 0) {
            System.out.println("O resultado é negativo.");
        } else System.out.println("O resultado é igual a zero.");
    }
}
