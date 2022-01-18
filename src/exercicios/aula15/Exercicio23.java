package exercicios.aula15;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        double peso;
        double valor = 0;
        double desconto = 0;
        double valorComDesconto = 0;
        String tipoDeCarne;
        String cartaoTabajara;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a carne escolhida:" + "\nF - filé   A - alcatra   P - picanha");
        tipoDeCarne = input.next().toUpperCase();
        System.out.println("Digite o peso:");
        peso = input.nextDouble();
        System.out.println("Pagamento com cartões Tabajara? (sim ou não");
        cartaoTabajara = input.next();

        switch (tipoDeCarne) {
            case "F":
                tipoDeCarne = "Filé";
                if (peso <= 5) {
                    valor = peso * 4.90;
                } else valor = peso * 5.80;
                break;
            case "A":
                tipoDeCarne = "Alcatra";
                if (peso <= 5) {
                    valor = peso * 5.90;
                } else valor = peso * 6.80;
                break;
            case "P":
                tipoDeCarne = "Picanha";
                if (peso <= 5) {
                    valor = peso * 6.90;
                } else valor = peso * 7.80;
                break;
            default:
                System.out.println("Não foi encontrada a carne escolhida.");
                break;
        }
        if (cartaoTabajara.equals("sim")) {
            desconto = valor * 0.05;
            valorComDesconto = valor - desconto;
            System.out.println("Tipo de carne: " + tipoDeCarne);
            System.out.println("Quantidade: " + peso + "kg");
            System.out.println("Valor: R$" + valor);
            System.out.println("Pagamento: cartão Tabajara");
            System.out.printf("Desconto: R$%.2f", desconto);
            System.out.println("Valor final: R$" + valorComDesconto);
        } else {
            valorComDesconto = valor;
            System.out.println("Tipo de carne: " + tipoDeCarne);
            System.out.println("Quantidade: " + peso + "kg");
            System.out.println("Valor: R$" + valor);
            System.out.println("Pagamento: sem cartão Tabajara");
            System.out.println("Desconto: R$" + desconto);
            System.out.println("Valor final: R$" + valorComDesconto);
        }
    }
}
