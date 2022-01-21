package exercicios.aula17;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        int numeroTurmas;
        int numeroAlunos;
        double soma = 0;
        double media;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número de turmas da escola:");
        numeroTurmas = input.nextInt();
        for (int i = 1; i <= numeroTurmas; i++) {
            System.out.println("Digite o numero de alunos da turma " + i + ":");
            numeroAlunos = input.nextInt();
            while (numeroAlunos > 40) {
                System.out.println("O numero máximo de alunos por turma é 40. Digite novamente.");
                numeroAlunos = input.nextInt();
            }
            soma += numeroAlunos;
        }
        media = soma / numeroTurmas;
        System.out.println("O numero médio de alunos por turma é de " + media + " alunos.");
    }
}
