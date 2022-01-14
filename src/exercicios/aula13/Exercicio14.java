package exercicios.aula13;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        double tamanho;
        double velocidade;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho do arquivo a ser baixado em MB:");
        tamanho = 8 * input.nextDouble();
        System.out.println("Digite a velocidade da conexão em Mbps:");
        velocidade = input.nextDouble();
        System.out.println("O tempo estimado para download é de " + (tamanho/velocidade) + "s");

    }
}
