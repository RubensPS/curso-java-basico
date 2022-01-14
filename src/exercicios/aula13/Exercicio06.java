package exercicios.aula13;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        double raio;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o raio do círculo em centimetros:");
        raio = input.nextDouble();
        area = Math.PI * Math.pow(raio, 2);
        System.out.printf("A área do círculo com raio igual a %.2fcm é de %.2fcm2", raio, area);
    }
}
