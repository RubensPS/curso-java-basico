package exercicios.aula15;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        int preco1;
        int preco2;
        int preco3;
        int menor;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o preço dos três produtos:");
        preco1 = input.nextInt();
        preco2 = input.nextInt();
        preco3 = input.nextInt();

        if (Math.min(preco1, preco2) == preco1) {
            menor = Math.min(preco1, preco3);
            if (menor == preco1) {
                System.out.println("O primeiro produto deve ser comprado.");
            } else System.out.println("O terceiro produto deve ser comprado.");
        } else {
            menor = Math.min(preco2, preco3);
            if (menor == preco2) {
                System.out.println("O segundo produto deve ser comprado.");
            } else System.out.println("O terceiro produto deve ser comprado.");
        }
    }
}
