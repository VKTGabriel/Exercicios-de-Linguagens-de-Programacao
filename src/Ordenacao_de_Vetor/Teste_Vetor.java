package Ordenacao_de_Vetor;

public class Teste_Vetor {
    public static void main(String[] args){

        int[] vA = {3,7,4,5,9,64,14,-4,11,6};
        Vetor v1 = new Vetor(vA);
        Vetor v2 = new Vetor();

        System.out.println("\nOrdenação de v1:");
        v1.metodoBubble();
        v1.metodoSelection();

        System.out.println("\nOrdenação de v2:");
        v2.metodoInsert();
        v2.metodoHeapfy();
    }
}
