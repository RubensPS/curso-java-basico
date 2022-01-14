package exercicios.aula13;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        double valorDaHora;
        double salario;
        double horasTrabalhadas;
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o valor da hora trabalhada:");
        valorDaHora = input.nextDouble();
        System.out.println("Entre com o numero de horas trabalhadas no mês:");
        horasTrabalhadas = input.nextDouble();
        salario = valorDaHora * horasTrabalhadas;
        System.out.printf("O salário total no mês foi de: R$%.2f", salario);
    }



}
