package exercicios.aula17;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        double soma = 0;
        double media;
        double numero;
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o numero " + i + ":");
            numero = input.nextDouble();
            soma += numero;
        }
        media = soma / 5;
        System.out.println("Soma: " + soma + "\nMédia: " + media);
    }
}
