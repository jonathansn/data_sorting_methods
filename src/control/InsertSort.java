package control;

public class InsertSort {
    
    private int comparacoes;
    private int trocas;
    
    public void ordenar(int[] vetor) {

        int i, j, eleito, trocas=0, comparacoes=0;
        for (i = 1; i < vetor.length; i++){            
            eleito = vetor[i];
            j = i - 1; 
            comparacoes++;
                while ((j>=0) && (eleito < vetor[j])) {
                 vetor[j+1] = vetor[j];
                 j--;
                 trocas++;
                 comparacoes++;
                }
            vetor[j+1] = eleito;
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