package Exercicios_Primeira_Aula;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int diagonal_Principal = 0, diagonal_Secundaria = 0;
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("[linha %d, coluna %d] Digite um valor: ", i+1, j+1);
                matriz[i][j] = ler.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            diagonal_Principal += matriz[0][i] * matriz[1][(i+1 > 2) ? 0 : i+1] * matriz[2][(i+2 > 2) ? i+2-3 : i+2];
            diagonal_Secundaria -= matriz[0][(1-i < 0) ? 1-i+3 : 1-i] * matriz[1][(-i < 0) ? -i+3 : -i] * matriz[2][2 - i];
        }

        System.out.printf("\nDeterminante = %d\n", diagonal_Principal + diagonal_Secundaria);

    }
}