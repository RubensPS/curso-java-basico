package exercicios.aula13;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        int inteiro1;
        int inteiro2;
        double real;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro inteiro:");
        inteiro1 = input.nextInt();
        System.out.println("Digite o segundo inteiro:");
        inteiro2 = input.nextInt();
        System.out.println("Digite o numero real:");
        real = input.nextDouble();

        System.out.println("Dobro do primeiro inteiro * metade do segundo inteiro = " + ((2*inteiro1) * (inteiro2/2)));
        System.out.println("Triplo do primeiro inteiro + real = " + (3*inteiro1 + real));
        System.out.println("Cubo do real = " + Math.pow(real, 3));
    }
}
