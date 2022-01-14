package exercicios.aula13;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        double tempF;
        double tempC;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius:");
        tempC = input.nextDouble();
        tempF = (9 * tempC / 5) + 32;
        System.out.printf("A temperatura convertida é de %.2f graus Celsius.", tempF);
    }
}
