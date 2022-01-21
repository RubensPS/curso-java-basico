package exercicios.aula17;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        int codigo;
        double quantidade;
        double valor = 0;
        double total = 0;
        final String tabela = "-----------------------------------" +
                              "\nEspecificação      Código   Preço" +
                              "\nCachorro Quente     100    R$ 1.20" +
                              "\nBauru Simples       101    R$ 1.30" +
                              "\nBauru com Ovo       102    R$ 1.50" +
                              "\nHambúrguer          103    R$ 1.20" +
                              "\nCheeseburguer       104    R$ 1.30" +
                              "\nRefrigerante        105    R$ 1.00" +
                              "\n----------------------------------";
        String continua = "S";
        String resumoCompra;
        Scanner input = new Scanner(System.in);
        while (continua.equals("S")) {
            System.out.println(tabela);
            System.out.println("Digite o codigo do item desejado:");
            codigo = input.nextInt();
            System.out.println("Digite a quantidade de itens desejada:");
            quantidade = input.nextInt();
            switch (codigo) {
                case 100:
                case 103:
                    valor = 1.2 * quantidade;
                    total += valor;
                    break;
                case 101:
                case 104:
                    valor = 1.3 * quantidade;
                    total += valor;
                    break;
                case 102:
                    valor = 1.5 * quantidade;
                    total += valor;
                    break;
                case 105:
                    valor = 1.0 * quantidade;
                    total += valor;
                    break;
            }
            System.out.println("Deseja continuar o consumo?" + "\nS - Sim   N - Não");
            continua = input.next().toUpperCase();
        }
        System.out.println("O total da conta é de R$" + total);
    }
}
