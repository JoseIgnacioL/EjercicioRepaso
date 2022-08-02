/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10a3;

import ejercicio7a8.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Jose Ignacio
 */
public class lista {

    public static void menu() {
        System.out.println("1.-Introducir palabra");
        System.out.println("2.-Listar palabras");
        System.out.println("3.-Mostrar tamaño");
        System.out.println("4.-Borrar todas");
        System.out.println("5.-Eliminar palabra");
        System.out.println("0.-Salir");
    }

    public static void main(String[] args) {
        Palabras p1;
        ArrayList<Palabras> lista = new ArrayList<Palabras>();

        int opcion;
        String palabra = "";

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
                    palabra = sc.nextLine();
                    
                     p1 = new Palabras(palabra);

                    if (!lista.equals(p1)) {

                       
                        lista.add(p1);

                    } else {

                        System.out.println("La palabra esta repetida");
                    }

                    break;
                case 2:
                    for (Palabras palabra1 : lista) {
                        System.out.println(palabra1);
                    }
                    break;
                case 3:
                    System.out.println("El tamaño " + lista.size());
                    break;
                case 4:
                    Iterator<Palabras> iterator = lista.iterator();

                    while (iterator.hasNext()) {
                        Palabras s = iterator.next();

                        iterator.remove();
                    }
                    break;
                case 5:
                    Iterator<Palabras> iterator1 = lista.iterator();
                    System.out.println("Introduce el nombre que quieres borrar");
                    String nombre = sc.nextLine();
                    Palabras p2 = new Palabras();
                    p2 = new Palabras(nombre);
                    while (iterator1.hasNext()) {
                        Palabras s = iterator1.next();
                        if (s.equals(p2)) {
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
