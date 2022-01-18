package exercicios.aula15;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        int numero1, numero2, numero3, menor, maior;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite 3 numeros:");
        numero1 = input.nextInt();
        numero2 = input.nextInt();
        numero3 = input.nextInt();
        if (Math.min(numero1, numero2) == numero1) {
            menor = Math.min(numero1, numero3);
            System.out.println("O menor número é " + menor);
        } else {
            menor = Math.min(numero2, numero3);
            System.out.println("O menor número é " + menor);
        }
        if (Math.max(numero1, numero2) == numero1) {
            maior = Math.max(numero1, numero3);
            System.out.println("O maior número é " + maior);
        } else {
            maior = Math.max(numero2, numero3);
            System.out.println("O maior número é " + maior);
        }

    }
}
