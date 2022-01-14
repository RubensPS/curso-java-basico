package exercicios.aula13;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        double tempF;
        double tempC;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura em Farenheit:");
        tempF = input.nextDouble();
        //Não utilizar o 5/9 pois da um resultado de ZERO, o Java considera a divisão de inteiros
        tempC = 5 * (tempF - 32)/9;
        System.out.printf("A temperatura convertida é de %.2f graus Celsius.", tempC);
    }
}
