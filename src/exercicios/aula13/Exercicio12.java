package exercicios.aula13;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        double altura;
        double pesoIdeal;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a altura da pessoa:");
        altura = input.nextDouble();
        pesoIdeal = (72.7 * altura - 58);
        System.out.printf("O peso ideal para a pessoa é de %.2fkg", pesoIdeal);
    }
}
