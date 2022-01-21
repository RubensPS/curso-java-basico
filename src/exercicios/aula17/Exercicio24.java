package exercicios.aula17;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        double preco;
        double soma = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o valor do pão?");
        preco = input.nextDouble();
        System.out.printf("Preço do pão: R$ %.2f%n", preco);
        System.out.println("Panificadora Pão de Ontem - Tabela de Preços");
        for (int i = 1; i <= 50; i++) {
            soma += preco;
            System.out.printf("%d - R$ %.2f%n", i, soma);
        }
    }
}
