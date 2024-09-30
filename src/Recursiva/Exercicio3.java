package Recursiva;

import java.util.Scanner;

public class Exercicio3 {

    public static String invertString(String string, int n) {
        if(n == 0) {
            return string.charAt(n) + "";
        } else {
            return string.charAt(n) + invertString(string, n-1);
        }
    }

    public static void main(String[] args) {
        String original;

        Scanner ler = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        original = ler.nextLine();

        System.out.printf("\nFrase invertida: %s", invertString(original, original.length()-1));

    }
}
