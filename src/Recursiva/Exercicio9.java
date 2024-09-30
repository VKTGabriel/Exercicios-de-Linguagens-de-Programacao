package Recursiva;

import java.util.Scanner;

public class Exercicio9 {
    public static int somaNaturais(int a){
        if (a==1){
            return 1;
        } else {
            return a+somaNaturais(a-1);
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor;

        System.out.print("Digite um valor: ");
        valor = ler.nextInt();

        System.out.print("Soma dos números: " + somaNaturais(valor));
    }
}
