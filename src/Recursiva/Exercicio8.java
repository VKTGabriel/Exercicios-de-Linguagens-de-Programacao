package Recursiva;

import java.util.Scanner;

public class Exercicio8 {
    public static int cont_Par_no_Vetor(int[] vetor, int a) {
        if (a == vetor.length-1) {
            return (vetor[a]%2 == 0) ? 1 : 0;
        } else {
            return ((vetor[a]%2 == 0) ? 1 : 0) + cont_Par_no_Vetor(vetor, a+1);
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++){
            System.out.printf("Digite o valor da posição %d do vetor: ", i);
            vetor[i] = ler.nextInt();
        }

        System.out.printf("\n%d valores pares\n", cont_Par_no_Vetor(vetor, 0));
    }
}
