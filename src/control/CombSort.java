package control;

public class CombSort {
    
    private int comparacoes;
    private int trocas;
    
    public void ordenar(int vetor[]){
        
        int gap = vetor.length;
        int t, comparacoes=0, trocas=0;
        boolean swapped = true;
        while (gap > 1 || swapped) {
            if (gap > 1)
                gap = (int) (gap / 1.3);

            int i = 0;
            swapped = false;
            while (i + gap < vetor.length) {
                comparacoes++;
                if (vetor[i] > vetor[i + gap]) {
                    t = vetor[i];
                    vetor[i] = vetor[i + gap];
                    vetor[i + gap] = t;
                    swapped = true;
                    trocas++;
                }
                i++;
            }
        }
        System.out.println("Comparações: "+comparacoes);
        System.out.println("Trocas: "+trocas);
        
        setComparacoes(comparacoes);
        setTrocas(trocas);
    }

    /**
     * @return the comparacoes
     */
    public int getComparacoes() {
        return comparacoes;
    }

    /**
     * @param comparacoes the comparacoes to set
     */
    public void setComparacoes(int comparacoes) {
        this.comparacoes = comparacoes;
    }

    /**
     * @return the trocas
     */
    public int getTrocas() {
        return trocas;
    }

    /**
     * @param trocas the trocas to set
     */
    public void setTrocas(int trocas) {
        this.trocas = trocas;
    }
    
}