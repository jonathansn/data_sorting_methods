/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author admin
 */
public class CarregaVetor {
    
    public String vetorGerado(String path) {
        
        String vetorGerado = null; 
          
        try {  
            BufferedReader in = new BufferedReader(new FileReader(path));  
            System.out.println("Arquivo lido!");  
            String str, txt = "";  
            while((str = in.readLine()) != null) {  
                txt += str;  
            }
            vetorGerado = txt;
            in.close();
        }  
        catch (Exception e) {  
            System.err.println("erro");  
        }       
        return vetorGerado;        
    }
    
    public String vetorOrdenado(String path) {
        
        String vetorGerado = null; 
          
        try {  
            BufferedReader in = new BufferedReader(new FileReader(path));  
            System.out.println("Arquivo lido!");  
            String str, txt = "";  
            while((str = in.readLine()) != null) {  
                txt += str;  
            }
            vetorGerado = txt;
            in.close();
        }  
        catch (Exception e) {  
            System.err.println("erro");  
        }       
        return vetorGerado;        
    }
}