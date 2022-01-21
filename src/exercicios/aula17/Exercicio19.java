package exercicios.aula17;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        int numeroNotas;
        double nota;
        double soma = 0;
        double media;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número de notas para o cálculo:");
        numeroNotas = input.nextInt();
        for (int i = 1; i <= numeroNotas; i++) {
            System.out.println("Digite a nota " + i + ":");
            nota = input.nextDouble();
            soma += nota;
        }
        media = soma / numeroNotas;
        System.out.println("A média do aluno foi de " + media + " pontos");
    }
}

