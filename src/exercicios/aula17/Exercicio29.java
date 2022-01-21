package exercicios.aula17;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        int numero;
        int contaDivisor = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número máximo paragerar a lista de primos:");
        numero = input.nextInt();
        System.out.println("----------------------------------------------");
        System.out.println("Lista de números primos de 1 a " + numero + ":");
        for (int j = 1; j <= numero; j++) {
            for (int i = 1; i < j-1; i++) {
                if (j%(j-i) == 0) {
                    contaDivisor++;
                }
            }
            if (contaDivisor == 0) {
                System.out.print(j + " ");
            }
            contaDivisor = 0;
        }
        System.out.println("\n----------------------------------------------");
    }
}
