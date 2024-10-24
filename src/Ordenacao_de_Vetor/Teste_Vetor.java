package Ordenacao_de_Vetor;

public class Teste_Vetor {
    public static void main(String[] args){
        int[] vA = {-4,4,3,78,65,22,-12,5,67,8,-90,4,34,-6};
        Vetor v = new Vetor(vA);

        v.metodoBubble();
        v.metodoSelection();
        v.metodoInsert();
        v.metodoHeapfy();
    }
}
