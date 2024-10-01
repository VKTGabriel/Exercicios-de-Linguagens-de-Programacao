package Tratamento_de_Erro;

import java.util.Scanner;

public class Exercicio5 {
    public static double coleta() throws IllegalArgumentException  {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double valor = ler.nextDouble();
        if (valor < 0) {
            throw new IllegalArgumentException("Não envie números negativos!");
        } else {
            return valor;
        }

    }

    public static double raiz() {
        return Math.sqrt(coleta());
    }

    public static void main(String[] args) {
        do {
            try {
                System.out.printf("Raiz = %.2f", raiz());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }
}
