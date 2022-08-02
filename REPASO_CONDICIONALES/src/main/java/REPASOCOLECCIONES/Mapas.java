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
public class Mapas {

    public static void main(String[] args) {

        HashMap<Integer, String> mapa = new HashMap<>();

        // AÑADIR
        mapa.put(2, "JUAN");
        mapa.put(5, "ANA");
        mapa.put(9, "EVA");

        // SUSTITUIR
        mapa.put(2, "ANA");

        // BORRAR
        mapa.remove(2);

        // TAMAÑO
        int j = mapa.size();

        // CONTIENE ? 
        if (mapa.containsKey(4)) {

        }
        if (mapa.containsValue("ANA")) {

        }

        // BORRAR TODO
        mapa.clear();

        // CONSULTAR UN VALOR POR SU POSICION 
        String n = mapa.get(2);

        // RECORRER UN MAPA - VALORES
        for (String s : mapa.values()) {
            System.out.println(s);
        }

        // RECORRER UN MAPA - CLAVES
        for (int s : mapa.keySet()) {
            System.out.println(s);
        }

        // RECORRER UN MAPA - CLAVES Y VALORES
        for (String clave : mapa.values()) {
            String valor = mapa.get(clave);

            System.out.println(clave);
            System.out.println(valor);
        }
        
        
        Iterator<String> iterator = mapa.values().iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.equals("ANA")) {
                iterator.remove();
            }
        }
        
    }
}
