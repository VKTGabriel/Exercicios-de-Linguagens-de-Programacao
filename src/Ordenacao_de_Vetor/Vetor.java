package Ordenacao_de_Vetor;

import java.util.Scanner;

public class Vetor {
    private int[] vetor;

    public Vetor(int[] vetor) {
        this.vetor = vetor;
    }

    public Vetor() {
        preencheVetor();
    }

    public Vetor copiaSegura() {
        int[] x = new int[getVetor().length];
        Vetor novo = new Vetor(x);
        for (int i = 0; i < getVetor().length; i++){
            novo.getVetor()[i] = getVetor()[i];
        }
        return novo;
    }

    private void preencheVetor() {
        System.out.println("Digite o tamanho do vetor:");
        Scanner ler = new Scanner(System.in);
        this.vetor = new int[ler.nextInt()];

        for (int i=0; i<this.vetor.length; i++){
            System.out.printf("Digite o valor da posição [%d]:\n",i);
            this.vetor[i] = ler.nextInt();
        }
    }

    public void metodoBubble() {
        Vetor novo = copiaSegura();
        for (int i=1; i<novo.getVetor().length; i++) {
            for (int j = 0; j < novo.getVetor().length - i; j++) {
                if(novo.getVetor()[j] > novo.getVetor()[j+1]){
                    int x = novo.getVetor()[j];
                    novo.getVetor()[j] = novo.getVetor()[j+1];
                    novo.getVetor()[j+1] = x;
                }
            }
        }
        exibirInfo("Bubble", novo);
    }

    public void metodoSelection() {
        Vetor novo = copiaSegura();
        for (int i = 0; i < novo.getVetor().length; i++) {
            int posMenor = i;
            for (int j = i; j < novo.getVetor().length; j++) {
                posMenor = (novo.getVetor()[posMenor] < novo.getVetor()[j]) ? posMenor : j;
            }
            int x = novo.getVetor()[i];
            novo.getVetor()[i] = novo.getVetor()[posMenor];
            novo.getVetor()[posMenor] = x;
        }
        exibirInfo("Selection", novo);
    }

    public void metodoInsert(){
        Vetor novo = copiaSegura();
        for (int i = 1; i < novo.getVetor().length; i++) {
            int guarda = novo.getVetor()[i];
            for (int j = i; j > -1; j--){
                if (j == 0 || guarda >= novo.getVetor()[j -1]){
                    novo.getVetor()[j] = guarda;
                    break;
                } else {
                    novo.getVetor()[j] = novo.getVetor()[j -1];
                }
            }
        }
        exibirInfo("Insert", novo);
    }

    public void metodoHeapfy() {
        Vetor novo = copiaSegura();
        for (int i = 0; i < novo.getVetor().length/2; i++) {

        }
        exibirInfo("Heapfy", novo);
    }

    public String toString() {
        String array = "";
        for (int pos : vetor) {
            array += pos + " ";
        }
        return array;
    }

    public void exibirInfo(String tipo, Vetor ArrayFormat) {
        System.out.printf("\nMétodo: %s\nArray original: %s\nArray ordenado: %s\n",
                tipo, this.toString(), ArrayFormat.toString());
    }

    public int[] getVetor() {
        return vetor;
    }
}