import java.util.Scanner;

public class ExerciciosC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite primeiro número:");
        int numeroUm = scanner.nextInt();
        System.out.println("Digite segundo número!");
        int numeroDois = scanner.nextInt();

        if (numeroUm > numeroDois) {
            System.out.println("O maior número é " + numeroUm + ".");
        } else if ( numeroUm < numeroDois) {
            System.out.println("O maior número é " + numeroDois + ".");
        } else {
            System.out.println("Os dois números são iguais!");
        }
    }
}
