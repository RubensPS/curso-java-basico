package exercicios.aula15;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        double salarioBruto, salarioLiquido, impRenda, inss, sindicato, fgts, totaldescontos;
        int horasTrabalhadas, valorHora;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero de horas:");
        horasTrabalhadas = input.nextInt();
        System.out.println("Digite o valor da hora de trabalho:");
        valorHora = input.nextInt();
        salarioBruto = horasTrabalhadas * valorHora;
        sindicato = salarioBruto * 0.03;
        fgts = salarioBruto * 0.11;
        inss = salarioBruto * 0.10;


        if (salarioBruto > 0 && salarioBruto <= 900) {
            impRenda = 0;
            totaldescontos = sindicato + inss + impRenda;
            salarioLiquido = salarioBruto - totaldescontos;
            System.out.printf("Salário bruto (%d * %d): R$%.2f %n(-) IR: R$%.2f %n(-) Sindicato: R$%.2f %n(-) INSS: R$%.2f %nFGTS: R$%.2f %nTotal de descontos: R$%.2f %nSalário líquido: R$%.2f",valorHora, horasTrabalhadas, salarioBruto, impRenda, sindicato, inss, fgts, totaldescontos, salarioLiquido);
        } else  if (salarioBruto > 900 && salarioBruto <= 1500) {
            impRenda = salarioBruto * 0.05;
            totaldescontos = sindicato + inss + impRenda;
            salarioLiquido = salarioBruto - totaldescontos;
            System.out.printf("Salário bruto (%d * %d): R$%.2f %n(-) IR: R$%.2f %n(-) Sindicato: R$%.2f %n(-) INSS: R$%.2f %nFGTS: R$%.2f %nTotal de descontos: R$%.2f %nSalário líquido: R$%.2f",valorHora, horasTrabalhadas, salarioBruto, impRenda, sindicato, inss, fgts, totaldescontos, salarioLiquido);
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            impRenda = salarioBruto * 0.10;
            totaldescontos = sindicato + inss + impRenda;
            salarioLiquido = salarioBruto - totaldescontos;
            System.out.printf("Salário bruto (%d * %d): R$%.2f %n(-) IR: R$%.2f %n(-) Sindicato: R$%.2f %n(-) INSS: R$%.2f %nFGTS: R$%.2f %nTotal de descontos: R$%.2f %nSalário líquido: R$%.2f",valorHora, horasTrabalhadas, salarioBruto, impRenda, sindicato, inss, fgts, totaldescontos, salarioLiquido);
        } else {
            impRenda = salarioBruto * 0.20;
            totaldescontos = sindicato + inss + impRenda;
            salarioLiquido = salarioBruto - totaldescontos;
            System.out.printf("Salário bruto (%d * %d): R$%.2f %n(-) IR: R$%.2f %n(-) Sindicato: R$%.2f %n(-) INSS: R$%.2f %nFGTS: R$%.2f %nTotal de descontos: R$%.2f %nSalário líquido: R$%.2f",valorHora, horasTrabalhadas, salarioBruto, impRenda, sindicato, inss, fgts, totaldescontos, salarioLiquido);
        }
    }
}
