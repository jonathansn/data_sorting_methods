package control;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class GeraVetor {
    
    public void geraVetorTxt(int[] vetor) throws IOException {	
        
        int tamanho = vetor.length;        
        String[] vetorS = new String[tamanho];
        
        for(int i=0; i<vetor.length; i++){
            vetorS[i] = String.valueOf(vetor[i]);
        }
        
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("vetor.txt"),1*1024*1024))) {
            for(int i=0; i<vetor.length; i++)
                out.print(vetorS[i]+",");
            
            out.close();
        }
        
    }
    
    public void geraVetorChar(String[] vetor) throws IOException {	
        
        int tamanho = vetor.length;
        
        for(int i=0; i<vetor.length; i++){
            System.out.println(vetor[i]);
        }
        
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("vetor.txt"),1*1024*1024))) {
            for(int i=0; i<vetor.length; i++)
                out.print(vetor[i]+",");
            
            out.close();
        }
        
    }
        
    public void geraTxtOrdenado(int[] vetor) throws IOException {	
        
        int tamanho = vetor.length;        
        String[] vetorS = new String[tamanho];
        
        for(int i=0; i<vetor.length; i++){
            vetorS[i] = String.valueOf(vetor[i]);
        }
        
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("vetorOrdenado.txt")))) {
            for(int i=0; i<vetor.length; i++)
                out.print(vetorS[i]+",");
            
            out.close();
        }
    }
    
    public int[] lerTxtGerado(int tamanho, String path) throws FileNotFoundException, IOException{
        Scanner scanner = new Scanner(new FileReader(path)).useDelimiter("\\,");
        
        int vetorD[] = new int[tamanho];
        int i=0;
        
        while (scanner.hasNext()) {
          String vetor = scanner.next();
          vetorD[i] = Integer.parseInt(vetor);
          i++;
        }
        return vetorD;
    }
    
    Random gerador = new Random();
    
    public String[] gerarVetorChar(int tamanho){
        String[] vetor = new String[tamanho];
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = String.valueOf('A' + Math.random()*('Z' - 'A' + 1));
        }
        return vetor;
    }
    
    public int[] gerarVetorAleatorio(int tamanho, int variedade){
        int[] vetor = new int[tamanho];
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(variedade);
        }
        return vetor;
    }
    
    public int[] gerarVetorCrescente(int tamanho){
        int[] vetor = new int[tamanho];
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = i+1;
        }
        return vetor;
    }
    
    public int[] gerarVetorDecrescente(int tamanho){
        int[] vetor = new int[tamanho];
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = tamanho; 
            tamanho--;
        }        
        
        return vetor;
    }
    
    public void mostrar(int vetor[]){
        for(int i=0; i < vetor.length; i++)
            System.out.println(vetor[i]);
    }
}