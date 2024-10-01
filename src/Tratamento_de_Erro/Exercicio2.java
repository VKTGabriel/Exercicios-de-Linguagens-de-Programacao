package Tratamento_de_Erro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2 {
    public static int coleta(){

        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero: ");

        return ler.nextInt();
    }

    public static void main(String[] args) {
        do {
            try {
                System.out.printf("\nNúmero digitado: %d", coleta());
                break;
            } catch (InputMismatchException e) {
                System.out.println("\nTenta denovo, Leia a solicitação dessa vez:");
            }
        } while (true);

    }
}
