import java.util.Scanner;

public class ExerciciosB {
    public static void main(String[] args) {
        System.out.println("\n\n======Exercitando o uso do Java======\n        By SeVIIeN :)\n\n");

        //Atividade 1

        double nota = 6.5;
        if (nota >= 7.0) {
            System.out.println("O estudante teve média " + nota + " e foi aprovado. ");
        } else if (nota >= 5.0) {
            System.out.println("O estudante teve média " + nota + " e está de recuperação. ");
        } else {
            System.out.println("O estudante teve média " + nota + " e foi reprovado. ");
        }

        System.out.println("\n-----------------------------\n");


        //Atividade 2

        String senha = "AKdw3(800aD";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sou senha: \n");
        String tentativaSenha = scanner.nextLine();

        scanner.close();

        if (tentativaSenha.equals(senha)) {
            System.out.println("Bem-vindo de volta!");
        } else {
            System.out.println("Login ou senha estão invalidos!\nAcesso negado!");
        }
        System.out.println("\n-----------------------------\n");

        //Atividade 3


    }
}
