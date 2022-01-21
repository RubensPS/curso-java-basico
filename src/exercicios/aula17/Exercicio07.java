package exercicios.aula17;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        int maior = -999999999;
        int numero;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Entre com o numero " + i);
            numero = input.nextInt();
            if (numero >= maior) {
                maior = numero;
            }
        }
        System.out.println("O maior número é " + maior);
    }
}
