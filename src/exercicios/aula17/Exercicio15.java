package exercicios.aula17;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        int n;
        double funcaoN;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número de termos que quer calcular:");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            funcaoN = ((1/Math.sqrt(5)) * Math.pow((1+Math.sqrt(5))/2, i)) - ((1/Math.sqrt(5)) * Math.pow((1-Math.sqrt(5))/2, i));
            System.out.printf("%.0f ", funcaoN);
        }
    }
}
