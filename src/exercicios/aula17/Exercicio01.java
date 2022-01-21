package exercicios.aula17;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        double nota;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma nota de 0 a 10:");
        nota = input.nextDouble();
        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida. Digite novamente a nota de 0 a 10:");
            nota = input.nextDouble();
        }
        input.close();
    }
}
