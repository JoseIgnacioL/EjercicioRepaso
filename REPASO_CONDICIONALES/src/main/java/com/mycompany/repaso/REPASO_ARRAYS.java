package com.mycompany.repaso;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose Ignacio
 */
public class REPASO_ARRAYS {

    public static void Ejercicio4a2() {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[11];;
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 1; i < 11; i++) {
            System.out.println("Introduce 10 numeros: " + i + " de 10");
            int numeroUsuario = sc.nextInt();

            array[i] = numeroUsuario;

            if (array[i] % 2 == 0) {
                sumaPares = sumaPares + numeroUsuario;
            } else {
                sumaImpares = sumaImpares + numeroUsuario;
            }

        }

        System.out.println("La suma de los numeros pares es: " + sumaPares);
        System.out.println("La sumad de los numero impares es: " + sumaImpares);
    }

    public static void Ejercicio4a3() {
        Scanner sc = new Scanner(System.in);
        int[] temperaturas = new int[7];

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Introduce 7 temperaturas " + i + " de 6");
            int temperatura = sc.nextInt();
            temperaturas[i] = temperatura;
        }

        System.out.println("Introduce un nueva temperatura");
        int temperaturaNueva = sc.nextInt();

        for (int j = 0; j < temperaturas.length; j++) {
            if (temperaturaNueva == temperaturas[j]) {
                System.out.println("La temperatura ya existe en estos dias:" + j);
            }
        }
    }

    public static void Ejercicio4a6() {
        double[] notas = new double[8];
        Scanner sc = new Scanner(System.in);
        double notaUsuario;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Introduce 8 notas" + (i + 1) + "de 8");
            notaUsuario = sc.nextDouble();
            notas[i] = notaUsuario;
            if (!(notas[i] >= 0 && notas[i] <= 10)) {
                System.out.println("Nota mal introducida,introducela de nuevo");
                notaUsuario = sc.nextDouble();
            }
        }

        double mayor = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        double suma = 0;
        double notaMedia = 0;
        int aprobados = 0;
        int suspensos = 0;
        

        for (int i = 0; i < notas.length; i++) {
            suma = (suma + notas[i]);
            notaMedia = suma / notas.length;

            if(notas[i] > mayor){
                mayor = notas[i];
            }
            
            if(notas[i] < menor){
                menor = notas[i];
            }
            
            if (notas[i] >= 5) {
                aprobados++;
            }

            if (notas[i] < 5) {
                suspensos++;
            }

        }
        
        System.out.println("El mayor es  " + mayor);
        System.out.println("El menor es "+menor);
        System.out.println("La nota media es"+notaMedia);
        System.out.println("El numero de aprobados es" + aprobados);
        System.out.println("El numerod e suspensos es" + suspensos);
                

    }

    public static void Ejericio4a8() {
        int[] arrayOriginal = new int[10];
        int[] arrayPar = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce 10 numeros " + i + " de 10");
            int numero = sc.nextInt();
            arrayOriginal[i] = numero;
            System.out.println(arrayOriginal[i]);
        }
        for (int i = 0; i < 10; i++) {
            if (arrayOriginal[i] % 2 == 0) {
                arrayPar[i] = arrayOriginal[i] * 2;
                System.out.println(arrayPar[i]);
            } else {
                arrayPar[i] = arrayOriginal[i] * 3;
                System.out.println(arrayPar[i]);
            }
        }

    }

    public static void Ejercicio4a9() {
        int[] numeros;
        int aleatorio = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Di el tamaño del array numeros");
        int tamano = sc.nextInt();

        numeros = new int[tamano];

        System.out.println("Introduce un numero par saber sus multiplos");
        int multiplo = sc.nextInt();

        for (int i = 0; i < numeros.length; i++) {

            aleatorio = (int) (Math.random() * 100 + 1);

            numeros[i] = aleatorio;

            System.out.println("Los numeros generado son " + numeros[i]);

            if (numeros[i] % multiplo == 0) {
                System.out.println("Son multiplo " + numeros[i]);
            }

        }

    }

    public static void Ejercicio4a10() {
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce 10 numeros " + (i + 1) + " de 10");
            int numero = sc.nextInt();
            array[i] = numero;
        }

        for (int i = 0; i < array.length - 1; i++) {
            int posiOriginal = array[i];
            int posiSiguiente = array[i + 1];

            if (posiOriginal == posiSiguiente) {
                System.out.println("El numero es igual " + array[i]);
            }

        }
    }

    public static void Ejercicio4a17() {
        int[] numeros = new int[20];
        int[] cuadrados = new int[20];
        int[] cubos = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            int numero = ((int) (Math.random() * 100));
            numeros[i] = numero;

            int cuadradado = numero * numero;
            cuadrados[i] = cuadradado;

            int cubo = numero * numero * numero;
            cubos[i] = cubo;

            System.out.println("Numero original " + numeros[i]);

            System.out.println("Numero al cuadradro " + cuadrados[i]);

            System.out.println("Numero al cubo " + cubos[i]);

            System.out.println("----------------------------------------");

        }
    }

    public static void main(String[] args) {
        //Ejercicio4a2();
        //Ejercicio4a3();
        Ejercicio4a6();
        //Ejericio4a8();
        //Ejercicio4a9();
        //Ejercicio4a10();
        //Ejercicio4a17();
//        int xxx = 0;
//
//        // CRAR ARRAY 
//        int[] x;
//        x = new int[4];
//
//        int[] a = new int[3];
//        // 0  1   2  3  4  5  6
//        int[] q = {2, 56, 2, 3, 2, 4, 2};
//
//        String[] frutas = {"peras", "manzanas"};
//
//        q[2] = 44;
//
//        int k = q[4] + 3;
//
//        // RECORRER UN ARRAY
//        // 
//        int[] array = {2, 5, 3, 8, 111, 7, 2, 2, 8};
//
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 == 0) {
//                System.out.println(array[i]);
//            }
//
//        }
//
////Si tenemos de inicio un array   
////construir un programa que copie miarray en otro array llamado copiaDeDatos, pero sumando 2 a cada elemento, 
////y que escriba el array copiaDeDatos por pantalla, esto es, que salga :
////   "el elemento 1 de copiadedatos es 10”
////   "el elemento 2 de copiadedatos es 4"
////   "el elemento 3 de copiadedatos es 7"
////   "el elemento 4 de copiadedatos es 6"
////   …etc…
//        int[] miarray = {8, 2, 5, 4, 9, 1, 0, 8, 9, 3};
//        int[] copiaDeDatos;
//
//        copiaDeDatos = new int[miarray.length];
//
//        for (int i = 0; i < miarray.length; i++) {
//
//            copiaDeDatos[i] = miarray[i];
//            System.out.println("El elemento " + i + " de copiadedatos es " + copiaDeDatos[i]);
//        }
//
////    Dados estos arrays
////	
////Hacer un bucle que nos diga los nombres de los alumnos que han aprobado y su nota, esto es, debe dar como salida por pantalla:
////Luis ha aprobado con un 8
////Carlos ha aprobado con un 5
////Juanjo ha aprobado con un 9
//        String[] nombreDeCadaAlumno = {"Luis", "Jose", "Carlos", "Pedro", "Juanjo"};
//        int[] notasDeCadaAlumno = {8, 2, 5, 4, 9};
//
//        for (int i = 0; i < nombreDeCadaAlumno.length; i++) {
//            if (notasDeCadaAlumno[i] >= 5) {
//                System.out.println(nombreDeCadaAlumno[i] + " ha aprobado con un " + notasDeCadaAlumno[i]);
//            }
//        }
//            Ejercicios 4.a.8
    }
}
