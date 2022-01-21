package exercicios.aula17;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        double temp;
        double menor = 100000000;
        double maior = -100000000;
        double soma = 0;
        double media;
        String sair = "N";
        int contaTemperatura = 1;
        Scanner input = new Scanner(System.in);

        while (sair.equals("N")) {
            System.out.println("Digite a temperatura " + contaTemperatura + " em ºC:");
            temp = input.nextDouble();
            menor = Math.min(menor, temp);
            maior = Math.max(maior, temp);
            soma += temp;
            contaTemperatura++;
            System.out.println("Deseja encerrar a lista? S - Sim   N - Não");
            sair = input.next().toUpperCase();
        }
        media = soma / contaTemperatura;
        System.out.println("A menor temperatura é: " + menor + "ºC");
        System.out.println("A maior temperatura é: " + maior + "ºC");
        System.out.println("A média das temperaturas é: " + media + "ºC");
    }
}
