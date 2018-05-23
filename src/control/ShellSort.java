package control;

public class ShellSort { 
    
    private int comparacoes;
    private int trocas;
    
    public void ordenar(int vetor[]){

        int h = 1,trocas=0, comparacoes=0;
        int n = vetor.length;
        while(h < n)
                h = h * 3 + 1;
        h = h / 3;
        int c, j;
        while (h > 0) {
            
            for (int i = h; i < n; i++) {
                comparacoes++;
                    c = vetor[i];
                    j = i;
                    while (j >= h && vetor[j - h] > c) {                        
                        vetor[j] = vetor[j - h];
                        j = j - h;
                        trocas++;
                    }
                    vetor[j] = c;
            }
                h = h / 2;
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