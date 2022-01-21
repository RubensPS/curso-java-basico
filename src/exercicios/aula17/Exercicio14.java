package exercicios.aula17;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        int numero;
        int pares = 0;
        int impares = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <=10; i++) {
            System.out.println("Digite o número " + i + ":");
            numero = input.nextInt();
            if (numero%2 == 0) {
                pares++;
            } else impares++;
        }
        System.out.println("Pares: " + pares + "\nÍmpares: " + impares);
    }
}
