package Exercicios_primeira_aula;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int total = 0, divisor = 0;
        double media;
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("[faltam %d] Digite um valor: ", vetor.length - i);
            vetor[i] = ler.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            total += vetor[i] * i;
            divisor += i;
        }

        media = ((double) total) / divisor;
        System.out.printf("\nMédia: %.2f\n", media);

    }
}
