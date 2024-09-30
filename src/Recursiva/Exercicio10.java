package Recursiva;

import java.util.Scanner;

public class Exercicio10 {
    public static String binario(int n){
        if(n/2 == 0){
            return n%2+"";
        } else {
            return binario(n/2) + "" + n%2;
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor;

        System.out.print("Digite um valor para ser convertido em binário: ");
        valor = ler.nextInt();

        System.out.printf("%d em binário: %s", valor, binario(valor));
    }
}
