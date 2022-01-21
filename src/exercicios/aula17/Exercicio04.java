package exercicios.aula17;

public class Exercicio04 {
    public static void main(String[] args) {
        int popA = 80000;
        int popB = 200000;
        int anos = 0;
        double taxaA = 1.03;
        double taxaB = 1.015;
        while (popB > popA) {
            popA *= taxaA;
            popB *= taxaB;
            anos++;
        }
        System.out.println("A população de A ultrapassará a de B em " + anos + " anos.");
    }
}
