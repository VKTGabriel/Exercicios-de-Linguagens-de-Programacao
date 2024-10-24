package Ordenacao_de_Vetor;

public class Teste_Vetor {
    public static void main(String[] args){
        int[] vA = {3,-6,7,8,3,34,-6,4,-66,23,1,33,0};
        Vetor v = new Vetor(vA);

        v.metodoBubble();
        v.metodoSelection();
        v.metodoInsert();
        v.metodoHeapfy();
    }
}
