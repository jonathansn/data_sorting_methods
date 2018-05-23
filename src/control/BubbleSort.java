package control;

public class BubbleSort {
    
    private int comparacoes;
    private int trocas;

    public void ordenar(int vetor[]){
        
        int aux,i,j;
        int trocas = 0;
        int comparacoes = 0;
            
        for(i=vetor.length-1; i >= 1; i--) {
 
            for(j=0; j < i ; j++) {

                if(vetor[j]>vetor[j+1]) {

                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                    trocas++;
                }
                comparacoes++;
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