package Tratamento_de_Erro;

import Tratamento_de_Erro.Exceptions.IdadeInvalidaException;

import java.util.Scanner;

public class Exercicio4 {
    public static int coleta() throws IdadeInvalidaException {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite uma idade: ");
        int idade = ler.nextInt();

        if (idade < 0 || idade >= 150) {
            throw new IdadeInvalidaException();
        } else {
            return idade;
        }
    }

    public static void main(String[] args) {
        do {
            try {
                System.out.printf("\nIdade inserida: %d", coleta());
                break;
            } catch (IdadeInvalidaException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }
}
