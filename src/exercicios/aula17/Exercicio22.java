package exercicios.aula17;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        int numeroCds;
        int precoCd;
        double soma = 0;
        double media;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número de CD`s da coleção:");
        numeroCds = input.nextInt();
        for (int i = 1; i <= numeroCds; i++) {
            System.out.println("Digite o valor do CD " + i + ":");
            precoCd = input.nextInt();
            soma += precoCd;
        }
        media = soma / numeroCds;
        System.out.printf("O valor total gasto na coleção foi de R$%.2f.", soma);
        System.out.printf("%nO valor médio poor CD é de R$%.2f.",media);
    }
}
