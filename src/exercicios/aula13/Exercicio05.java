package exercicios.aula13;

import java.util.Scanner;

public class Exercicio05 {

    public static void main (String[] Args) {

        double metros, centimetros;
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o valor em metros para ser convertido:");
        metros = input.nextDouble();
        centimetros = metros * 100;
        System.out.println(metros + "m = " + centimetros + "cm.");

    }

}
