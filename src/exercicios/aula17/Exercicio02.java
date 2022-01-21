package exercicios.aula17;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        String usuario, senha;
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com o nome de usuário e senha:");
        System.out.println("Usuário:");
        usuario = input.next();
        System.out.println("Senha:");
        senha = input.next();
        while (senha.equals(usuario)) {
            System.out.println("O nome de usuário e a senha devem ser diferentes. Digite novamente.");
            System.out.println("Usuário:");
            usuario = input.next();
            System.out.println("Senha:");
            senha = input.next();
        }
    }
}
