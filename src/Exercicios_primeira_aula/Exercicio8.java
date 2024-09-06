package Exercicios_primeira_aula;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        int[] num = new int[4];

        for (int i = 0; i < num.length; i++) {
            System.out.printf("Digite a quantidade de %s da matriz %d:", (i%2 == 0) ? "Linhas" : "Colunas", (i < 2 ? 1 : 2));
            num[i] = ler.nextInt();
        }

        if (num[1] == num[2]) {

            int[][] matriz = new int[num[0]][num[1]];
            int[][] matriz2 = new int[num[2]][num[3]];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.printf("[Matriz: %d, linha %d, coluna %d] Digite um valor: ", 1, i+1, j+1);
                    matriz[i][j] = ler.nextInt();
                }
            }

            for (int i = 0; i < matriz2.length; i++) {
                for (int j = 0; j < matriz2[i].length; j++) {
                    System.out.printf("[Matriz: %d, linha %d, coluna %d] Digite um valor: ", 2, i+1, j+1);
                    matriz2[i][j] = ler.nextInt();
                }
            }

            int valor = 0;

            System.out.println("\nMatriz Resultante:");

            for (int i = 0; i < num[0]; i++) {
                for (int j = 0; j < num[3]; j++) {
                    for (int k = 0; k < num[1]; k++) {
                        valor += matriz[i][k] * matriz2[k][j];
                    }
                    System.out.print(valor + "\t");
                    valor = 0;
                }
                System.out.println();
            }

        } else {
            System.out.println("Impossível multiplicar");
        }
    }
}