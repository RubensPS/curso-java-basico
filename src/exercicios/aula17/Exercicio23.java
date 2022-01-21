package exercicios.aula17;

public class Exercicio23 {
    public static void main(String[] args) {
        final double PRECO = 1.99;
        double soma = 0;
        System.out.println("Lojas Quase Dois - Tabela de Preços");
        for (int i = 1; i <= 50; i++) {
            soma += PRECO;
            System.out.printf("%d - R$ %.2f%n", i, soma);
        }
    }
}
