package Tratamento_de_Erro;

import java.util.Scanner;

public class Exercicio1 {

    public static int divisao() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o dividendo: ");
        int a = ler.nextInt();
        System.out.println("Digite o divisor: ");
        int b = ler.nextInt();

        return executar(a, b);
    }

    public static int executar(int a, int b){
        return a / b;
    }

    public static void main(String[] args) {
        do {
            try {
                System.out.printf("\nResultado: %d", divisao());
                break;
            } catch (ArithmeticException e) {
                System.out.println("\nNão tenta dividir por zero... Burro :)\nTente denovo:\n");
            }
        } while (true);

    }
}