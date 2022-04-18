package TEDs;
import java.util.Scanner;

public class TedDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor, soma = 0, valoresPositivos = 0, valoresNegativos = 0, valoresLidos = 0; // variaveis inteiras

        do {
            System.out.print("Informe um número inteiro (0 para sair): ");
            valor = Integer.parseInt(scanner.nextLine()); // solicitando o valor ao usuario.

            if(valor > 0){
                valoresPositivos++; // adicionando valores positivos na variavel.
            }
            else if(valor < 0){
                valoresNegativos++; // adicionando valores negativos na variavel.
            }
            soma += valor; // somando quantidade de valores informados.

            if(valor != 0){
                valoresLidos++; // adicionando os valores informados na variavel.
            }
        }
        while(valor != 0);

        if(valoresLidos == 0){
            System.out.println("Não foi informou nenhum número.");
        }
        else{
            System.out.println("Quantidade de números positivos: " + valoresPositivos);
            System.out.println("Quantidade de números negativos: " + valoresNegativos);
            System.out.println("A soma dos números lidos é: " + soma);
            System.out.println("A média aritmética é: " + ((soma * 1.0) / valoresLidos)); // (valor * 1.0) apresenta o resultado como float(double).
        }
    }
}
