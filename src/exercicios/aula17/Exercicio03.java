package exercicios.aula17;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        String nome, genero, estadoCivil;
        int idade;
        double salario;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        nome = input.next();
        while (nome.length() <= 3) {
            System.out.println("O nome deve ter mais de 03 letras. Digite novamente:");
            nome = input.next();
        }
        System.out.println("Digite sua idade:");
        idade = input.nextInt();
        while (idade < 0 || idade > 150) {
            System.out.println("A idade deve estar entre 0 e 150. Digite novamente:");
            idade = input.nextInt();
        }
        System.out.println("Digite seu salário:");
        salario = input.nextDouble();
        while (salario <= 0) {
            System.out.println("O salário deve ser maior que zero. Digite novamente:");
            salario = input.nextDouble();
        }
        System.out.println("Digite seu gênero." + "\nM - masculino" +   "F - feminino");
        genero = input.next().toUpperCase();
        while (!genero.equals("F") && !genero.equals("M")) {
            System.out.println("O gênero digitado é inválido. Digite novamente F ou M:");
            genero = input.next().toUpperCase();
        }
        System.out.println("Digite seu estado civil." + "\nC - casado" + "   S - solteiro" + "\nV - viúvo" + "   D - divorciado");
        estadoCivil = input.next().toUpperCase();
        while (!estadoCivil.equals("C") && !estadoCivil.equals("S") && !estadoCivil.equals("V") && !estadoCivil.equals("D")) {
            System.out.println("O estado civil é inválido. Digite novamente C, S, V ou D:");
            estadoCivil = input.next().toUpperCase();
        }
    }
}
