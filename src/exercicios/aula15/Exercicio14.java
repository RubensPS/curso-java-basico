package exercicios.aula15;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        double nota1, nota2, media;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        nota1 = input.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2 = input.nextDouble();
        media = (nota1 + nota2) / 2;
        if (media < 4) {
            System.out.println("Notas: " + nota1 + " e " + nota2 + "\nMédia:" + media + "\nConceito: E" + "\n!!REPROVADO!!");
        }else if (media >= 4 && media < 6) {
            System.out.println("Notas: " + nota1 + " e " + nota2 + "\nMédia:" + media + "\nConceito: D" + "\n!!REPROVADO!!");
        } else if (media >= 6 && media < 7.5) {
            System.out.println("Notas: " + nota1 + " e " + nota2 + "\nMédia:" + media + "\nConceito: C" + "\n!!APROVADO!!");
        }else if (media >= 7.5 && media < 9) {
            System.out.println("Notas: " + nota1 + " e " + nota2 + "\nMédia:" + media + "\nConceito: B" + "\n!!APROVADO!!");
        }else if (media >=9 && media <= 10) {
            System.out.println("Notas: " + nota1 + " e " + nota2 + "\nMédia:" + media + "\nConceito: A" + "\n!!APROVADO!!");
        } else System.out.println("Nota não compatível, verifique os dados digitados.");

    }
}
