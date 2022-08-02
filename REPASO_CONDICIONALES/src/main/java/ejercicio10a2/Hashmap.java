/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10a2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


/**
 *
 * @author Jose Ignacio
 */
public class Hashmap {
    
      public static void menu() {
        System.out.println("1.-Introducir palabra");
        System.out.println("2.-Listar palabras");
        System.out.println("3.-Mostrar tamaño");
        System.out.println("4.-Borrar todas");
        System.out.println("5.-Eliminar palabra");
        System.out.println("0.-Salir");
    }

    public static void main(String[] args) {
        HashMap<Integer ,String> hm = new HashMap<Integer, String>();

       
        int opcion;
        int id = hm.size();
        String palabra;

        do {
            menu();
            Scanner sc = new Scanner(System.in);
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 0:
                    System.out.println("Saliendo");
                    break;
                case 1:
                    Scanner sc1 = new Scanner(System.in);
                    
                    
                    System.out.println("Introduce una palabra");
                    palabra = sc.next();

                    if (!hm.containsValue(palabra)) {
                        hm.put(id, palabra);
                    } else {
                        System.out.println("La palabra esta repetida");
                    }

                    break;
                case 2:
                    for (String palabra1 : hm.values()) {
                        System.out.println(palabra1);
                    }
                    break;
                case 3:
                    System.out.println("El tamaño " + hm.size());
                    break;
                case 4:
                    Iterator<String> iterator = hm.values().iterator();

                    while (iterator.hasNext()) {
                        String s = iterator.next();

                        iterator.remove();
                    }

                    break;
                case 5:
                    Iterator<String> iterator1 = hm.values().iterator();
                    System.out.println("Introduce el nombre que quieres borrar");
                    String nombre = sc.nextLine();
                    while (iterator1.hasNext()) {
                        String s = iterator1.next();
                        if (s.equals(nombre)) {
                            iterator1.remove();
                        }
                    }
                    break;
                default:
                    throw new AssertionError();
            }

        } while (opcion != 0);

    }
    
}
