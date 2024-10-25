package Exercicios_primeira_aula;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);
        long valor, anterior, seguro;
        int posicao;

        System.out.println("Digite uma posição para ser consultada: ");
        posicao = ler.nextInt();

        if (posicao > 0) {
            if (posicao == 1) {
                valor = 0;
            } else if(posicao <= 3){
                valor = 1;
            } else {
                valor = 1;
                anterior = 1;

                for (int i = 4; i <= posicao; i++) {
                    seguro = valor;
                    valor += anterior;
                    anterior = seguro;
                }
            }

            System.out.printf("Valor da posição %d: %d\n", posicao, valor);
        } else {
            System.out.printf("Posição [%d] inválida\n", posicao);
        }
    }
}
