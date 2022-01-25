package exercicios.aula19;

public class Exercicio19 {
    public static void main(String[] args) {
        double[] nota1 = {4.1, 5.5, 9.0, 8.2, 3.3, 6.4, 6.0, 7.1, 6.9, 9.6};
        double[] nota2 = {6.7, 7.7, 7.4, 6.1, 8.2, 7.0, 9.1, 4.9, 6.0, 8.1};
        double[] result = new double[10];
        for (int i = 0; i < result.length; i++) {
            result[i] = (nota1[i] + nota2[i]) / 2;
            if (result[i] >= 756) {
                System.out.println("Aluno " + (i+1) + " APROVADO com nota " + result[i]);
            } else System.out.println("Aluno " + (i+1) + " REPROVADO com nota " + result[i]);
        }
    }
}
