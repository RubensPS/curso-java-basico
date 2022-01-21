package exercicios.aula17;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        int numero;
        int multipliplo;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número de 1 a 10:");
        numero = input.nextInt();
        while (numero <= 0 && numero > 10) {
            System.out.println("O número deve estar entre 1 e 10. Digite novamente:");
            numero = input.nextInt();
        }
        for (int i = 1; i <= 10; i++) {
            multipliplo = numero * i;
            System.out.println(numero + " * " + i + " = " + multipliplo);
        }
    }
}
