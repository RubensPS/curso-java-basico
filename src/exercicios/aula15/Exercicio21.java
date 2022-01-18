package exercicios.aula15;

import java.util.Scanner;

public class Exercicio21 {
    public static void main (String[] args) {
        double gasolina = 2.50;
        double alcool = 1.90;
        double volumeAbastecido, preco = 0;
        String combustivel;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o volume abastecido:");
        volumeAbastecido = input.nextDouble();
        System.out.println("Digite o combustível escolhido:" + "\nA - Álcool    G - Gasolina");
        combustivel = input.next().toUpperCase();
        switch (combustivel) {
            case "A":
                if (volumeAbastecido > 0 && volumeAbastecido <= 20) {
                    preco = volumeAbastecido * alcool * 0.97;
                } else preco = volumeAbastecido * alcool * 0.95;
                break;
            case "G":
                if (volumeAbastecido > 0 && volumeAbastecido <= 20) {
                    preco = volumeAbastecido * gasolina * 0.96;
                } else preco = volumeAbastecido * gasolina * 0.94;
                break;
            default:
                System.out.println("Dados incorretos, reinicie o processo.");
                break;
        }
        System.out.printf("O valor com desconto é de R$%.2f", preco);
    }
}
