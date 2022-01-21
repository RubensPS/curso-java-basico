package exercicios.aula17;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        int contadorProduto = 1;
        double preco = 1;
        double soma = 0;
        double pagamento = 0;
        double troco = 0;
        String continua;
        String resumo = "Lojas Tabajara";
        Scanner input = new Scanner(System.in);

        System.out.println("Deseja fazer uma nova operação? S - Sim   N - Não");
        continua = input.next().toUpperCase();
        while (continua.equals("S")) {
            while (preco != 0) {
                System.out.println("Digite o preço do produto " + contadorProduto + "\nZero (0) finaliza a lista.");
                preco = input.nextDouble();
                if (preco == 0) {
                    break;
                } else {
                    resumo = resumo + "\nProduto " + contadorProduto + ": R$ " + preco;
                    soma += preco;
                    contadorProduto++;
                }
            }
            System.out.println("Total: R$" + soma);
            System.out.println("Digite o valor recebido:");
            pagamento = input.nextDouble();
            troco = pagamento - soma;
            System.out.println("-------------------------------");
            System.out.println(resumo);
            System.out.println("Total: R$" + soma);
            System.out.println("Dinheiro: R$" + pagamento);
            System.out.println("Troco: R$ " + troco);
            System.out.println("...");
            System.out.println("-------------------------------");

            preco = 1;
            contadorProduto = 1;
            resumo = "Lojas Tabajara";
            System.out.println("Deseja fazer uma nova operação? S - Sim   N - Não");
            continua = input.next().toUpperCase();
        }
    }
}
