package Exercicios_Primeira_Aula;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um valor entre 2 e 5: ");
        int n = ler.nextInt();
        if (n >= 2 && n <= 5) {
            int valor = 0;

            int[][] matriz = new int[n][n];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = i*n + j + 1;
                }
            }

            System.out.println("\nMatriz Resultante:");

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    for (int k = 0; k < matriz.length; k++) {
                        valor += matriz[i][k] * matriz[k][j];
                    }
                    System.out.print(valor + "\t");
                    valor = 0;
                }
                System.out.println();
            }
        } else {
            System.out.println("Número inválido");
        }
    }
}