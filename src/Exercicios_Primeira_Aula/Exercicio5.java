package Exercicios_Primeira_Aula;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        long valor, anterior, seguro;
        int posicao;

        System.out.println("Digite uma posição para ser consultada: ");
        posicao = ler.nextInt();

        if (posicao > 0) {
            if (posicao <= 2) {
                valor = 1;

            } else {
                valor = 1;
                anterior = 1;

                for (int i = 3; i <= posicao; i++) {
                    seguro = valor;
                    valor += anterior;
                    anterior = seguro;
                }
            }

            System.out.printf("Valor da posição %d: %d\n", posicao, valor);
        } else {
            System.out.printf("Posição [%d] inválida\n", posicao);
        }
    }
}
