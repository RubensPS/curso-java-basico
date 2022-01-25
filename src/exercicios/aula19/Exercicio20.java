package exercicios.aula19;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        double cotacao;
        double real;
        double[] conversao = new double[20];
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a cotação do dólar na data desejada:");
        cotacao = input.nextDouble();
        for (int i = 1; i <= 20; i++) {
            conversao[i-1] = cotacao * i;
        }
        System.out.println(Arrays.toString(conversao));
    }
}
