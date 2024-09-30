package Recursiva;

import java.util.Scanner;

public class Exercicio6 {
    public static boolean ispalindromo(String s, int a, int b) {
        if (a == b) {
            return true;
        } else if (a == b-1) {
            return true;
        }else {
            return s.charAt(a) == s.charAt(b) && ispalindromo(s, a + 1, b-1);
        }
    }

    public static void main(String[] args) {
        String original;

        Scanner ler = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        original = ler.nextLine();

        System.out.printf("\nA palavra é palindromo: : %b", ispalindromo(original,0, original.length()-1));

    }
}
