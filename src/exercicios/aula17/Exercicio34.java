package exercicios.aula17;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        final double NUMERADOR = 1;
        double soma = 0;
        int termos;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero de termos para o cálculo de H:");
        termos = input.nextInt();
        for (int i = 1; i <= termos; i++) {
            soma += NUMERADOR / i;
        }
        System.out.println("O valor de H é " + soma + ".");
    }
}
