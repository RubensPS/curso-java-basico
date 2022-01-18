package exercicios.aula15;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        double a, b, c, delta, raiz1, raiz2;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o coeficiente a:");
        a = input.nextDouble();
        if (a == 0) {
            System.out.println("A equação não é de segundo grau, reinicie o programa.");
        } else {
            System.out.println("Digite o coeficiente b:");
            b = input.nextDouble();
            System.out.println("Digite o coeficiente c:");
            c = input.nextDouble();
            delta = (b*b)-4*a*c;
            raiz1 = (-b+Math.sqrt(delta))/(2*a);
            raiz2 = (-b-Math.sqrt(delta))/(2*a);
            if (delta < 0) {
                System.out.println("A equação não possui raizes reais.");
            } else if (delta == 0) {
                System.out.println("Delta igual a zero. A equação possui apenas uma raiz de valor " + raiz1);
            } else {
                System.out.println("As duas raízes da equação são: " + raiz1 + " e " + raiz2);
            }
        }
    }
}
