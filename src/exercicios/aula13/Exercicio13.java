package exercicios.aula13;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        double valorDaHora;
        double salario, horasTrabalhadas, inss, ir, sindicato;
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o valor da hora trabalhada:");
        valorDaHora = input.nextDouble();
        System.out.println("Entre com o numero de horas trabalhadas no mês:");
        horasTrabalhadas = input.nextDouble();
        salario = valorDaHora * horasTrabalhadas;
        sindicato = salario * 0.05;
        inss = salario * 0.08;
        ir = salario * 0.11;
        System.out.println( "----------------------------\n" +
                            "Salário bruto: " + salario + " \n" +
                            "Sindicato: " + (sindicato) + " \n" +
                            "INSS: " + (inss) + " \n" +
                            "Imposto de Renda: " + (ir) + " \n" +
                            "Salário líquido: " + (salario - ir - inss - sindicato) + "\n" +
                            "----------------------------");
    }
}
