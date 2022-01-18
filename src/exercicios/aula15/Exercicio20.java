package exercicios.aula15;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        int contadorSim = 0;
        Scanner input = new Scanner(System.in);
        String resposta;

        System.out.println("!!!Responda a todas as perguntas com SIM ou NÃO!!!");
        System.out.println("Você telefonou para a vítima?");
        resposta = input.next();
        if (resposta.equals("sim")) {
            contadorSim++;
        }
        System.out.println("Você esteve no local do crime?");
        resposta = input.next();
        if (resposta.equals("sim")) {
            contadorSim++;
        }
        System.out.println("Você mora perto da vítima?");
        resposta = input.next();
        if (resposta.equals("sim")) {
            contadorSim++;
        }
        System.out.println("Você devia dinheiro para a  vítima?");
        resposta = input.next();
        if (resposta.equals("sim")) {
            contadorSim++;
        }
        System.out.println("Você já trabalhou com a vítima?");
        resposta = input.next();
        if (resposta.equals("sim")) {
            contadorSim++;
        }
        switch (contadorSim) {
            case 0:
            case 1:
                System.out.println("O depoente é inocente.");
                break;
            case 2:
                System.out.println("O depoente é um suspeito em potencial.");
                break;
            case 3:
            case 4:
                System.out.println("O depoente foi cúmplice no assassinato.");
                break;
            case 5:
                System.out.println("O depoente é o assassino.");
                break;
            default:
                System.out.println("Não foi possível concluir nada do interrogatório.");
                break;
        }
    }
}
