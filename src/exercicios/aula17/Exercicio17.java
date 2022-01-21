package exercicios.aula17;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número para realização do cálculo fatorial:");
        numero = input.nextInt();
        System.out.print("Fatorial de " + numero + " = " );
        for (int i = numero - 1; i > 0; i--) {
            numero = numero * i;
        }
        System.out.print(numero);
    }
}
