package exercicios.aula20;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        String[][] agenda = new String[30][24];
        Scanner input = new Scanner(System.in);
        String compromisso = "";
        String operacao = "";
        String novaOperacao = "S";
        int dia = 0;
        int hora = 0;

        for (int i = 0; i < agenda.length; i++) {
            for (int j = 0; j < agenda[0].length; j++) {
                agenda[i][j] = "";
            }
        }

        while (novaOperacao.equals("S")) {
            System.out.println("---------------------------");
            System.out.println("Digite a operação desejada:" + "\n0 - Adicionar compromisso \n1 - Consultar compromisso  \n2 - Apagar compromisso");
            operacao = input.next();
            switch (operacao) {
                case "0":
                    System.out.println("Digite o dia do mês:");
                    dia = input.nextInt();
                    System.out.println("Digite a hora do compromisso:");
                    hora = input.nextInt();
                    System.out.println("Digite o compromisso para registro:");
                    compromisso = input.next();
                    agenda[dia][hora] = compromisso;
                    break;
                case "1":
                    System.out.println("Digite o dia para consulta:");
                    dia = input.nextInt();
                    System.out.println("Digite a hora para consulta:");
                    hora = input.nextInt();
                    compromisso = agenda[dia][hora];
                    if (compromisso.equals("")) {
                        System.out.println("Não há compromissos para a data e horário digitados.");
                    } else System.out.println("Dia: " + dia + "\nHora: " + hora + "h" + "\nCompromisso: " + compromisso);
                    break;
                case "2":
                    System.out.println("Digite o dia e hora para apagar um compromisso:");
                    System.out.println("Dia:");
                    dia = input.nextInt();
                    System.out.println("Hora:");
                    hora = input.nextInt();
                    agenda[dia][hora] = "";
                    break;
                default:
                    System.err.println("!!!A operação digitada não existe!!!");
                    break;
            }
            System.out.println("-------------------------------");
            System.out.println("Deseja realizar outra operação?" + "\nS - Sim   N - Não");
            novaOperacao = input.next().toUpperCase();
            if (novaOperacao.equals("N")) {
                System.out.println("Saindo do sistema...");
            }
        }

    }
}
