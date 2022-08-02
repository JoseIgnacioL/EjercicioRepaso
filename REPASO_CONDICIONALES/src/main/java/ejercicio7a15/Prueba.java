/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7a15;

import java.util.ArrayList;

/**
 *
 * @author Jose Ignacio
 */
public class Prueba {
    public static void main(String[] args) {
        Vestido v2 = new Vestido();
        ArrayList<Vestido> vestidos = new ArrayList<Vestido>();
        
        v2.setMarca("Patata");
        v2.setNombre("Pa");
        v2.setPrecio(20);
        v2.setTalla(30);
        
        vestidos.add(v2);
        
        Vestido v3 = new Vestido("pop", 7,"popo", 23, true, 44);
        vestidos.add(v3);
        
        double elMasCaro= -12123123;
        double elMasBarato = 12313123;
        
        for (int i = 0; i < vestidos.size(); i++) {
            System.out.println(vestidos.get(i));
            
            
              if(vestidos.get(i).getPrecio() > elMasCaro) {
                elMasCaro = vestidos.get(i).getPrecio();
              }
              
              if(vestidos.get(i).getPrecio() < elMasBarato) {
                  elMasBarato = vestidos.get(i).getPrecio();
              }
            
        }
        
        
        System.out.println("El mas cado es  "  +  elMasCaro);
        System.out.println("El mas barato es "+elMasBarato);
        

    }
    
}