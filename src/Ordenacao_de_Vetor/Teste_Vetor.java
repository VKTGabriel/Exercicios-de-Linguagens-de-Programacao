package Ordenacao_de_Vetor;

public class Teste_Vetor {
    public static void main(String[] args){

        int[] vA = {3,7,44,4,6,7,9,23,32,536,7,99,3,42};
        Vetor v = new Vetor(vA);

        v.metodoBubble();
        v.metodoSelection();
        v.metodoInsert();
        v.metodoHeapfy();
    }
}
