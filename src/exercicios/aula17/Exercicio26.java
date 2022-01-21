package exercicios.aula17;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número para realização do cálculo fatorial:");
        numero = input.nextInt();
        System.out.println("Fatorial de: " + numero);
        System.out.print(numero + "! = " + numero);
        for (int i = numero - 1; i >= 1; i--) {
            System.out.print( " . " + i);
        }
        System.out.print(" = ");
        for (int i = numero - 1; i > 0; i--) {
            numero = numero * i;
        }
        System.out.print(numero);
    }
}
