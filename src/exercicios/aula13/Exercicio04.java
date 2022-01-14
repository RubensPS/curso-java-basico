package exercicios.aula13;

import java.util.Scanner;

public class Exercicio04 {

    public static void main (String[] Args){

        double nota1, nota2, nota3, nota4;
        double media;
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com as quatro notas do aluno:");
        System.out.println("Primeira nota:");
        nota1 = input.nextDouble();
        System.out.println("Segunda nota:");
        nota2 = input.nextDouble();
        System.out.println("Terceira nota:");
        nota3 = input.nextDouble();
        System.out.println("Quarta nota:");
        nota4 = input.nextDouble();
        media = (nota1+nota2+nota3+nota4)/4;
        System.out.printf("A média do ano foi de %.2f", media);

    }
}
