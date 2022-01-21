package exercicios.aula17;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        double salario;
        double aumento = 0.015;
        int ano;
        Calendar cal = GregorianCalendar.getInstance();
        ano = cal.get(Calendar.YEAR);
        System.out.println(ano);
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o salário inicial do empregado:");
        salario = input.nextDouble();

        for (int i = 1996; i <= ano; i++) {
            salario = salario * (1 + aumento);
            aumento *= 2;
        }
        System.out.println("O salário atual em " + ano + " é de R$" + salario);
    }
}
