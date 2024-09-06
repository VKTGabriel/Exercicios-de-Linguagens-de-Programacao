package Exercicios_primeira_aula;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        double[] vetor = new double[100];
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite um valor inteiro: ");
        vetor[0] = ler.nextInt();
        String saida = "Vetor " + vetor[0] + " ";

        for (int i = 1; i < vetor.length; i++) {
            vetor[i] = vetor[i - 1] / 2;
            saida += vetor[i] + " ";
        }

        System.out.println(saida);
    }
}
