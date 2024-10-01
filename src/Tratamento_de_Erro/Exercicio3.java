package Tratamento_de_Erro;

import java.util.Scanner;

public class Exercicio3 {
    public static int coleta() {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o index desejado: ");
        return ler.nextInt();
    }

    public static String acessaDados(int n) {
        String[] nome = {"Thiago", "Tulio", "Victor", "Matheus", "Ane", "Lucas", "Tony"};
        return nome[n];
    }

    public static void main(String[] args) {
        do {
            try {
                System.out.printf("\nNome corrspondente: %s", acessaDados(coleta()));
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("\nA posição solicitada não existe, tente denovo: ");
            }
        } while (true);
    }
}
