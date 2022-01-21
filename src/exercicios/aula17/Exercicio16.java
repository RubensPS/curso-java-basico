package exercicios.aula17;

public class Exercicio16 {
    public static void main(String[] args) {
        double funcaoN = 0;

        for (int i = 1; funcaoN < 500; i++) {
            funcaoN = ((1/Math.sqrt(5)) * Math.pow((1+Math.sqrt(5))/2, i)) - ((1/Math.sqrt(5)) * Math.pow((1-Math.sqrt(5))/2, i));
            System.out.printf("%.0f ", funcaoN);
        }
    }
}
