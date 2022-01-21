package exercicios.aula17;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        int popA;
        int popB;
        int anos = 0;
        double taxaA;
        double taxaB;
        String resposta;
        boolean repetir = true;
        Scanner input = new Scanner(System.in);

        while (repetir) {
            repetir = false;
            System.out.println("Digite a população inicial do país A:");
            popA = input.nextInt();
            while (popA <= 0) {
                System.out.println("A população de A deve ser maior que zero. Digite novamente:");
                popA = input.nextInt();
            }
            System.out.println("Digite a população inicial do país B:");
            popB = input.nextInt();
            while (popB <= 0) {
                System.out.println("A população de B deve ser maior que zero. Digite novamente:");
                popB = input.nextInt();
            }
            System.out.println("Digite a taxa de crescimento do país A:");
            taxaA = input.nextDouble();
            while (taxaA < 1) {
                System.out.println("A taxa de crescimento de A deve ser maior que 1. Digite novamente:");
                taxaA = input.nextDouble();
            }
            System.out.println("Digite a taxa de crescimento do país B:");
            taxaB = input.nextDouble();
            while (taxaB < 1) {
                System.out.println("A taxa de crescimento de B deve ser maior que 1. Digite novamente:");
                taxaB = input.nextDouble();
            }
            while (popB > popA) {
                popA *= taxaA;
                popB *= taxaB;
                anos++;
            }
            System.out.println("A população de A ultrapassará a de B em " + anos + " anos.");
            System.out.println("Deseja realizar outra operação?" + "\nS - sim   N - não");
            resposta = input.next().toUpperCase();
            while (!resposta.equals("S") && !resposta.equals("N")) {
                System.out.println("Resposta inválida. Digite novamente S para sim ou N para não:");
                resposta = input.next();
            }
            switch (resposta) {
                case "S":
                    repetir = true;
                    break;
                case "N":
                    System.out.println("Saindo do programa...");
                    break;
            }
        }

    }
}
