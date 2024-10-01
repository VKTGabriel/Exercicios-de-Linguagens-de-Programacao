package Tratamento_de_Erro.Exceptions;

public class IdadeInvalidaException extends RuntimeException {
    public IdadeInvalidaException() {
        super("Idade Invalida, Insira uma idade entre 1 e 150!");
    }
}
