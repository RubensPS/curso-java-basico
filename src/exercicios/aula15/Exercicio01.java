package exercicios.aula15;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        firstNumber = input.nextInt();
        System.out.println("Digite o segundo número:");
        secondNumber = input.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("O primeiro número é maior que o segundo e igual a " + firstNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println("O segundo número é maior que o primeiro e igual a " + secondNumber);
        } else System.out.println("Os números são iguais. Valor: " + firstNumber);
    }
}
