package Recursiva;

import java.util.Scanner;

public class Exercicio2 {
    public static double potencia(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else if (exp < 0) {
            return (1.0/base) * potencia(base, exp+1);
        } else {
            return base * potencia(base, exp-1);
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int base, exp;

        System.out.print("Digite um valor para a Base: ");
        base = ler.nextInt();
        System.out.print("Digite um valor para o Expoente: ");
        exp = ler.nextInt();

        System.out.printf("Soma dos números: %.5f", potencia(base, exp));
    }
}
