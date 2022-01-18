package exercicios.aula15;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        String letterCheck;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma letra para ser verificada:");
        letterCheck = input.next();

        switch (letterCheck) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("A letra digitada é uma vogal.");
                break;
            default:
                System.out.println("A letra digitada é uma consoante;");
                break;
         }
    }
}
