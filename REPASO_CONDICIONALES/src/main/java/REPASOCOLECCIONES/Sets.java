/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package REPASOCOLECCIONES;

import java.util.*;

/**
 *
 * @author Jose Ignacio
 */
public class Sets {
    public static void main(String[] args) {
         
        HashSet<String> conjunto = new HashSet<>();
        
        // AÑADIR
        conjunto.add("JUAN");
        conjunto.add("ANA");
        conjunto.add("EVA");
        conjunto.add("ANA");
        

        
        // BORRAR
        conjunto.remove("PACO");
        
        // TAMAÑO
        int j = conjunto.size();
        
        // CONTIENE ? 
        if ( conjunto.contains("EVA")){
            
        }
        
        // BORRAR TODO
        conjunto.clear();

        // RECORRER UNA LISTA 
        for( String s    :  conjunto    ){
            System.out.println(s);
        }
        

         Iterator<String> iterator = conjunto.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.equals("ANA")) {
                iterator.remove();
            }
        }
        
                
                
      
    }
}
