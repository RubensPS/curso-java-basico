package exercicios.aula17;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        int base, expoente, resultado;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a base desejada:");
        base = input.nextInt();
        resultado = base;
        System.out.println("Digite o expoente:");
        expoente = input.nextInt();
        for (int i = 1; i < expoente; i++) {
            resultado *= base;
        }
        System.out.println("O resultado é: " + resultado);
    }
}
