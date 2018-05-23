/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Collections;
import java.util.Vector;

/**
 *
 * @author User
 */
public class TesteGera {
    
    public static void main(String[] args){
        Vector<Integer> numeros = new Vector<Integer>(5);
        for (int i = 0; i <= 5; i++) {
            Integer num = (int) Math.round(Math.random() * 23);
            numeros.add(num);
        }
        Collections.sort(numeros);
        
        InsertSort is = new InsertSort();
    }
    
}
