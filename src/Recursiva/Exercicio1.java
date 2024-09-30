package Recursiva;

import java.util.Scanner;

public class Exercicio1 {
    public static int soma_Numeros(int valor, int b){
        if (b == 0) {
            return 0;
        } else {
            return valor/b + soma_Numeros(valor%b, b/10);
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Integer valor, contador;

        System.out.print("Digite um valor: ");

        valor = ler.nextInt();
        contador = valor.toString().length();

        System.out.printf("\nSoma dos digitos: %d", soma_Numeros(valor, (int) Math.pow(10,contador)));
    }
}
