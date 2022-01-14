package exercicios.aula13;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        double lado, area;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho do lado do quadrado em cm:");
        lado = input.nextDouble();
        area = lado * lado;
        System.out.printf("O dobro da área do quadrado com lado igual a %.2fcm é %.2fcm2", lado, (area*2));

    }
}
