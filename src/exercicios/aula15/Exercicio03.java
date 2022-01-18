package exercicios.aula15;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        String letter;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a letra referente ao gênero desejado F ou M:");
        letter = input.next();
        letter = letter.toUpperCase();
        switch (letter) {
            case "F":
                System.out.println("Feminino");
                break;
            case "M":
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Sexo inválido.");
                break;
        }
    }
}
