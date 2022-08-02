/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repaso;

import java.util.Scanner;

/**
 *
 * @author Jose Ignacio
 */
public class REPASO_BUCLES {

    //        Hacer un programa que pide un número al usuario,  y escribe en pantalla 
    //                el mes correspondiente a tal número (si el usuario introduce  2, 
    //                el programa escribe “Febrero”). Si el numero no es válido, 
    //                        lo indica igualmente. 
    //                        Tras ello, se le pregunta al usuario si quiere repetir, 
    //                        y si dice “si”, se vuelve a repetir el proceso anterior
    public static void mes() {
        boolean salir = true;
        Scanner sc = new Scanner(System.in);
        while (salir == true) {
            int mes = sc.nextInt();

            if (mes == 1) {
                System.out.println("Enero");
            }
            if (mes == 2) {
                System.out.println("Febrero");
            }
            if (mes == 3) {
                System.out.println("Marzo");
            }
            System.out.println("Quieres repetir?");
            String respuesta = sc.nextLine();

            if ( ! respuesta.toLowerCase().equals("si")) {
                salir = false;
            }
        }

    }

    public static void main(String[] args) {
        //        int a= 1;
        //        while(a<=5){
        //            System.out.println("HOLA");
        //            
        //
        //            a++;
        //        }
        //
        //        boolean seguir= true;
        //        while(seguir==true){
        //            System.out.println("HOLA");
        //            int x = 4*2;
        //            
        //            if(x>10){
        //                seguir = false;
        //            }
        //        }
        //
        //        
        //        for(int i= 3; i<10; i++){
        //             System.out.println(a);
        //        }
        //        
        //        int b= 13;
        //        do{
        //            System.out.println(b);
        //
        //            b++;
        //        }while(b<10);

        //        for (int i = 1; i < 11; i++) {
        //            System.out.println("Numero ");
        //            System.out.println(i);
        //            
        //        }
        //Pide al usuario 10 numeros, y al final muestra la suma de todos ellos
        //
        //        int suma=0;
        //        Scanner sc = new Scanner(System.in);
        //        
        //        for (int i = 1; i < 10; i++) {
        //            System.out.println("Introduce"+i +"numero");
        //         
        //            int numeroUsuario = sc.nextInt();
        //            suma = suma + numeroUsuario;
        //
        //        }
        //        System.out.println(suma);
        //        int suma2 = 0;
        //        int contador = 0;
        //        int resultado = 0;
        //        // Pide al usuario 5 numeros, y al final muestra la media de los que son pares
        //        for (int i = 1; i < 6; i++) {
        //            System.out.println("Introduce 5 numeros" + i + " de 5");
        //            int numeroUsuario = sc.nextInt();
        //
        //            if (numeroUsuario % 2 == 0) {
        //                contador++;
        //                suma2 = suma2 + numeroUsuario;
        //
        //            }
        //
        //        }
        //
        //        resultado = suma2 / contador;
        //
        //        System.out.println(resultado);
        // pedir al usuario numeros por teclado hasta que meta un 0. Luego mostrar la suma de los mayores de 10 que haya metido
        //        boolean salir = false;
        //        int suma3 = 0;
        //        Scanner sc2 = new Scanner(System.in);
        //
        //        while (salir == false) {
        //            System.out.println("Introduce un numero");
        //            int numeroUsuario = sc2.nextInt();
        //
        //            if (numeroUsuario > 10) {
        //                suma3 = suma3 + numeroUsuario;
        //            }
        //
        //            if (numeroUsuario == 0) {
        //                salir = true;
        //            }
        //
        //        }
        //        System.out.println(suma3);
        // pedir un numero y escribir en consola todos sus divisores
        // pedir un numero y decir si es primo  - 1 y si mismo CONTAR CUANRTOS DIVISORES TIEME
        //        Scanner sc2 = new Scanner(System.in);
        //        System.out.println("Introduce un numero");
        //        int numeroUsuario = sc2.nextInt();
        //        int contador = 0;
        //
        //        for (int i = 1; i <= numeroUsuario; i++) {
        //            if (numeroUsuario % i == 0) {
        //                contador++;
        //            }
        //        }
        //
        //        if (contador == 2) {
        //            System.out.println("Es primo");
        //        } else {
        //            System.out.println("No es primo");
        //        }
    }

}
