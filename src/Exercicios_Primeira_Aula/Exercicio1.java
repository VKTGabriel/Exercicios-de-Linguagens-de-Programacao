package Exercicios_Primeira_Aula;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        String par = "Par: ", impar = "Impar: ";
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("[faltam %d] Digite um valor: ", vetor.length - i);
            vetor[i] = ler.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                par += vetor[i] + " ";
            } else {
                impar += vetor[i] + " ";
            }
        }

        System.out.printf("\nResultados:\n%s\n%s\n", par, impar);

    }
}