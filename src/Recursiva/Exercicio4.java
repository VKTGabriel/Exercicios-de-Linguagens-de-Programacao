package Recursiva;

import java.util.Scanner;

public class Exercicio4 {
    public static int maior_no_Vetor(int[] vetor, int n) {
        if (n == vetor.length-1) {
            return vetor[n];
        } else {
            return Math.max(vetor[n], maior_no_Vetor(vetor, n+1));
        }
    }

    public static void main(String[] args) {
        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {

            Scanner ler = new Scanner(System.in);
            System.out.printf("Digite o valor da posição %d do vetor: ", i);
            vetor[i] = ler.nextInt();

        }

        System.out.printf("\nMaior valor: %d", maior_no_Vetor(vetor, 0));
    }
}
