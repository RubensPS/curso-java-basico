package exercicios.aula15;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        int numero1, numero2, numero3;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite 3 numeros:");
        numero1 = input.nextInt();
        numero2 = input.nextInt();
        numero3 = input.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            if (numero2 > numero3) {
                System.out.println(numero1 + "\n" + numero2 + "\n" + numero3);
            } else System.out.println(numero1 + "\n" + numero3 + "\n" + numero2);
        } else if (numero2 > numero1 && numero2 > numero3) {
            if (numero1 > numero3) {
                System.out.println(numero2 + "\n" + numero1 + "\n" + numero3);
            } else System.out.println(numero2 + "\n" + numero3 + "\n" + numero1);
        } else if (numero1 > numero2) {
            System.out.println(numero3 + "\n" + numero1 + "\n" + numero2);
        } else System.out.println(numero3 + "\n" + numero2 + "\n" + numero1);
    }
}
