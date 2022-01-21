package exercicios.aula17;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        int primeiro;
        int segundo;
        int numero;
        int resultado;
        int menor, maior;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero para ser multiplicado:");
        numero = input.nextInt();
        System.out.println("Digite o multiplicador inicial:");
        primeiro = input.nextInt();
        System.out.println("Digite o multiplicador final:");
        segundo = input.nextInt();
        menor = Math.min (primeiro, segundo);
        if (menor == primeiro) {
            maior = segundo;
        } else maior = primeiro;

        System.out.println("------------------------------");
        System.out.println("Montar a tabuada de " + numero);
        for (int i = menor; i <= maior; i++) {
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        System.out.println("------------------------------");
    }
}
