package exercicios.aula15;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        double nota1;
        double nota2;
        double media;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        nota1 = input.nextInt();
        System.out.println("Digite a segunda nota:");
        nota2 = input.nextInt();
        media = (nota1 + nota2) / 2;
        if (media == 10) {
            System.out.println("Aprovado com distinção!");
        } else if (media >= 7 && media < 10) {
            System.out.println("Aprovado.");
        } else System.out.println("Reprovado.");
    }

}
