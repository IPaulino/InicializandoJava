package TEDs;
import java.util.Scanner;
import java.util.Random;

public class TedWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); // gerando numeros aleatorios.

        int valor, tentativas = 1, valorAleatorio = random.nextInt(10); // limitando o numero até 10.

        System.out.println("Digite um número de 0 a 10: ");
        valor = scanner.nextInt();


        while (valor != valorAleatorio) {

            if (valor > valorAleatorio) {
                System.out.println("Errou!! Tente um número menor.");
                valor = scanner.nextInt();
                tentativas++;
            }
            if (valor < valorAleatorio) {
                System.out.println("Errou!! Tente um número maior.");
                valor = scanner.nextInt();
                tentativas++;
            }
            if (valor == valorAleatorio) {
                System.out.println("Parabéns, você acertou!\nO número era o " + valorAleatorio + ".\nVocê preciso de " + tentativas + " tentativas para acertar!.");
            }

        }
    }
}
