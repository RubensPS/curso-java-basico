package exercicios.aula15;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        String turno;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeira letra do turno que você estuda M, T ou N:");
        turno = input.next();
        turno = turno.toUpperCase();
        switch (turno) {
            case "M":
                System.out.println("Bom dia!");
                break;
            case "T":
                System.out.println("Boa tarde!");
                break;
            case "N":
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Valor inválido!");
                break;
        }
    }
}
