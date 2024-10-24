package Ordenacao_de_Vetor;

public class Teste_Vetor {
    public static void main(String[] args){

        int[] vA = {3,7,4,5,9,64,14,-4,11,6};
        Vetor v = new Vetor(vA);

        v.metodoBubble();
        v.metodoSelection();
        v.metodoInsert();
        v.metodoHeapfy();
    }
}
