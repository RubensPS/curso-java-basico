package exercicios.aula15;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        int ano;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o ano para verificar se é bissexto:");
        ano = input.nextInt();
        if (ano%400 == 0) {
            System.out.printf("O ano %d é bissexto.", ano);
        } else if ((ano%4 == 0) && (ano%100 != 0)) {
            System.out.printf("O ano %d é bissexto.", ano);
        } else System.out.printf("O ano %d não é bissexto.", ano);
    }
}
