package exercicios.aula15;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        double morango, maca, pesoMorango, pesoMaca, valorTotal, pesoTotal;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de morangos comprados em Kg:");
        pesoMorango = input.nextDouble();
        System.out.println("Digite a quantidade de maçãs compradas em Kg:");
        pesoMaca = input.nextDouble();

        if (pesoMorango <= 5) {
            morango = pesoMorango * 2.50;
        } else morango = pesoMorango * 2.20;

        if (pesoMaca <= 5) {
            maca = pesoMaca * 1.80;
        } else maca = pesoMaca * 1.50;
        pesoTotal = pesoMaca + pesoMorango;
        valorTotal = maca + morango;
        if (pesoTotal > 8 || valorTotal > 25) {
            valorTotal = valorTotal * 0.9;
        }
        System.out.printf("O valor total da compra foi de R$%.2f", valorTotal);
    }
}
