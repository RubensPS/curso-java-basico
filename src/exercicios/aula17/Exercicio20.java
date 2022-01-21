package exercicios.aula17;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        int tamanhoTurma;
        double idade = 0;
        double soma = 0;
        double media;
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o numero de alunos da turma?");
        tamanhoTurma = input.nextInt();
        for (int i = 1; i <= tamanhoTurma; i++) {
            System.out.println("Digite a idade do aluno " + i + " :");
            idade = input.nextInt();
            soma += idade;
        }
        media = soma / tamanhoTurma;
        if (media > 0 && media < 26) {
            System.out.println("A média de idade da turma é de " + media + " anos");
            System.out.println("A turma é jovem.");
        } else if (media >= 26 && media < 61) {
            System.out.println("A média de idade da turma é de " + media + " anos");
            System.out.println("A turma é adulta.");
        } else {
            System.out.println("A média de idade da turma é de " + media + " anos");
            System.out.println("A turma é idosa.");
        }
    }
}
