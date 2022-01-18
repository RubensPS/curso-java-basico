package exercicios.aula15;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        double salario, salarioRj, reajuste, aumento;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o salário a ser reajustado:");
        salario = input.nextDouble();
        if (salario > 0 && salario <= 280) {
            reajuste = 20;
            salarioRj = salario * (1 + reajuste/100);
            aumento = salarioRj - salario;
            System.out.printf("Salário: R$%.2f %n Reajuste: %.0f%% %n Aumento: R$%.2f %n Salário reajustado: R$%.2f",salario, reajuste, aumento, salarioRj);
        } else  if (salario > 280 && salario <= 700) {
            reajuste = 15;
            salarioRj = salario * (1 + reajuste/100);
            aumento = salarioRj - salario;
            System.out.printf("Salário: R$%.2f %n Reajuste: %.0f%% %n Aumento: R$%.2f %n Salário reajustado: R$%.2f",salario, reajuste, aumento, salarioRj);
        } else if (salario > 700 && salario <= 1500) {
            reajuste = 10;
            salarioRj = salario * (1 + reajuste/100);
            aumento = salarioRj - salario;
            System.out.printf("Salário: R$%.2f %n Reajuste: %.0f%% %n Aumento: R$%.2f %n Salário reajustado: R$%.2f",salario, reajuste, aumento, salarioRj);
        } else {
            reajuste = 5;
            salarioRj = salario * (1 + reajuste/100);
            aumento = salarioRj - salario;
            System.out.printf("Salário: R$%.2f %n Reajuste: %.0f%% %n Aumento: R$%.2f %n Salário reajustado: R$%.2f",salario, reajuste, aumento, salarioRj);
        }
    }
}
