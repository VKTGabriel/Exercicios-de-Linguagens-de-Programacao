package Recursiva;

import java.util.Scanner;

public class Exercicio7 {
    public static int mmc(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mmc(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor1, valor2;

        System.out.print("Digite dois valor: ");
        valor1 = ler.nextInt();
        valor2 = ler.nextInt();

        System.out.print("MMC: " + mmc(valor1, valor2));
    }
}
