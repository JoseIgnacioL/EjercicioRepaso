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
public class Listas {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        // AÑADIR
        lista.add("JUAN");
        lista.add("ANA");
        lista.add("EVA");
        lista.add("ANA");

        // INSERTAR
        lista.add(2, "PACO");

        // BORRAR
        lista.remove(2);
        lista.remove("PACO");

        // TAMAÑO
        int j = lista.size();

        // CONTIENE ? 
        if (lista.contains("EVA")) {

        }

        // BORRAR TODO
        lista.clear();

        // CONSULTAR UN VALOR POR SU POSICION 
        String n = lista.get(2);

        // RECORRER UNA LISTA
        for (int i = 0; i < lista.size(); i++) {
            String s = lista.get(i);
            System.out.println(s);
        }

        for (String s : lista) {
            System.out.println(s);
        }

        // BORRAR MUCHOS ELEMENRTOS DE UNA MISMA LISTA
//         for( String s    :  lista    ){
//             if(s.equals("ANA")){
//                 lista.remove(s);
//             }
//        }
        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.equals("ANA")) {
                iterator.remove();
            }
        }

    }
}
