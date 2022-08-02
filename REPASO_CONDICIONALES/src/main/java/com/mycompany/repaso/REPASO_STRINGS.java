package com.mycompany.repaso;

import java.util.Scanner;

/**
 *
 * @author Jose Ignacio
 */
public class REPASO_STRINGS {

    public static void Repaso() {
        //0123456789
        String s = new String("asdcadca");

        String texto = "Hola buenas tardes colega";
        // tamaño
        int t = texto.length();

        // pasara a mayusculas minusculas
        String ttt = texto.toUpperCase();
        System.out.println(texto);
        System.out.println(ttt);

        // un char
        char c = texto.charAt(6);

        int posicion = texto.indexOf("a");      // PRIMERA posic
        int posicio2 = texto.lastIndexOf("a");  // ULTIMAposic
        int posicio3 = texto.indexOf("x");      // devuelve -1 

        // subcadena, un cacho
        String cacho = texto.substring(2, 9);  // 2 inclui 9 excluida
        String cach2 = texto.substring(2);  // 2 inclui y hasta el final
        String cach3 = texto.substring(2, 3);  // 2 inclui y solo la 2

        // replace
        String rem = texto.replace("a", "x");

        // trocear
        String[] trozos = texto.split(" ");

        // contiene
        boolean d = texto.contains("e");

        // es vacia? 
        boolean a = texto.isEmpty();
        boolean i = texto.length() == 0;

        // eliminar espacios delante y detras
        String tex = " hay algio aqui       ";
        String copia = tex.trim();

        // recorrer un string
        for (int j = 0; j < texto.length(); j++) {
            char x = texto.charAt(j);
        }

        for (int l = 0; l < texto.length(); l++) {
            String cadaletra = texto.substring(l, l + 1);
        }

        //escribe el texto cada palabra en una linea
        String[] textoCorta = texto.split(" ");

        for (int j = 0; j < textoCorta.length; j++) {

            System.out.println(textoCorta[j]);
        }

        //escribe LA PRINERA LETRA DE CADA PALABRA en una linea
        for (int l = 0; l < textoCorta.length; l++) {
            char letra = textoCorta[l].charAt(0);
            System.out.println(letra);
        }
        for (int k = 0; k < textoCorta.length; k++) {
            String letraPrin = textoCorta[k].substring(0, 1);

            String letra = textoCorta[k].substring(1);

            String palabra = letraPrin.toUpperCase() + letra;
            System.out.println(palabra);
        }

        //CONVERSION DE INT A STRING 
        int ddd = 4;
        String dd = "" + d;

        //CONERSION STRING EN INT
        String kk = "365";
        int kkk = Integer.parseInt(kk);
    }

    public static void Ejercicio6a5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un texto");
        String texto = sc.nextLine();

        int contarVocalesA = 0;
        int contarVocalesE = 0;
        int contarVocalesI = 0;
        int contarVocalesO = 0;
        int contarVocalesU = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a' || texto.charAt(i) == 'á') {
                contarVocalesA = contarVocalesA + 1;
            }

            if (texto.charAt(i) == 'e' || texto.charAt(i) == 'é') {
                contarVocalesE = contarVocalesE + 1;
            }

            if (texto.charAt(i) == 'i' || texto.charAt(i) == 'í') {
                contarVocalesI = contarVocalesE + 1;
            }

            if (texto.charAt(i) == 'o' || texto.charAt(i) == 'ó') {
                contarVocalesO = contarVocalesO + 1;
            }

            if (texto.charAt(i) == 'u' || texto.charAt(i) == 'ú') {
                contarVocalesU = contarVocalesU + 1;
            }

        }

        System.out.println("El numero de vocales con la a son: " + contarVocalesA);
        System.out.println("El numero de vocales con la e son: " + contarVocalesE);
        System.out.println("El numero de vocales con la i son: " + contarVocalesI);
        System.out.println("El numero de vocales con la o son: " + contarVocalesO);
        System.out.println("El numero de vocales con la u son: " + contarVocalesU);
    }

    public static void Ejercicio6a14() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una hora en formato 24 horas con el siguiene formao xx:xx");
        String texto = sc.nextLine();

        String[] horas = texto.split(":");
        String hora = horas[0];
        String minutos = horas[1];

        String formato12Horas = "";
        
        
        int horaint = Integer.parseInt(hora);
        
        if(horaint>12){
            horaint = horaint-12;
        }
        
        hora  = horaint+"";

        
        for (int i = 0; i < horas.length; i++) {
            if(hora.equals("13")) {
              formato12Horas = "1"+":"+minutos;
            }
            if(hora.equals("14")) {
              formato12Horas = "2"+":"+minutos;
            }
            
            if(hora.equals("15")) {
              formato12Horas = "3"+":"+minutos;
            }
            
            if(hora.equals("16")) {
              formato12Horas = "4"+":"+minutos;
            }
            
            if(hora.equals("17")) {
              formato12Horas = "5"+":"+minutos;
            }
            
            if(hora.equals("18")) {
              formato12Horas = "6"+":"+minutos;
            }
            
            if(hora.equals("19")) {
              formato12Horas = "7"+":"+minutos;
            }
            
            if(hora.equals("20")) {
              formato12Horas = "8"+":"+minutos;
            }
            
            if(hora.equals("21")) {
              formato12Horas = "9"+":"+minutos;
            }
            
            if(hora.equals("22")) {
              formato12Horas = "10"+":"+minutos;
            }
            
            if(hora.equals("23")) {
              formato12Horas = "11"+":"+minutos;
            }
            
            if(hora.equals("00")) {
              formato12Horas = "12"+":"+minutos;
            }
            
        }
        System.out.println("La nueva hora es "+formato12Horas);

    }

    public static void Ejercicio6a15() {
        String texto = "Si confesamos nuestros pecados, él es fiel y "
                + "justo para perdonar nuestros pecados y limpiarnos de toda maldad. 1 Juan 1:9";

        String primeraPalabra = "";
        String ultimaPalabra = "";

        String[] split = texto.split(" ");

        for (int i = 0; i < split.length; i++) {
            primeraPalabra = split[0];
            ultimaPalabra = split[split.length - 1];
        }

        System.out.println("La primera palabra es " + primeraPalabra + "y la ultima es " + ultimaPalabra);
    }

    public static void Ejercicio6d1() {

        String[] paises = {"Cuba", "Republica de Colombia", "Reino de Perú", "Nuevo Reino de Canadá",
            "Republica de Argentina", "Honduras", "Republica de Uruguay"};

        int contarRepulica = 0;
        int contarReinos = 0;
        int contarOtros = 0;

        for (int i = 0; i < paises.length; i++) {
            if (paises[i].toLowerCase().contains("republica")) {
                contarRepulica = contarRepulica + 1;
            } else if (paises[i].toLowerCase().contains("reino")) {
                contarReinos = contarReinos + 1;
            } else {
                contarOtros = contarOtros + 1;
            }
        }

        System.out.println("El numero de republicas es de " + contarRepulica);
        System.out.println("El numero de reinos es de " + contarReinos);
        System.out.println("Otros " + contarOtros);
    }

    public static void Ejercicio6d3() {
        Scanner sc = new Scanner(System.in);
        String[] frase;

        System.out.println("Introduce el numero de palabras que forman la frase");
        int largoArray = sc.nextInt();
        frase = new String[largoArray];

        for (int i = 0; i < frase.length; i++) {
            System.out.println("Introduce  palabras " + (i + 1) + " de " + frase.length);
            String palabras = sc.next();
            frase[i] = palabras;
        }

        for (int i = frase.length - 1; i >= 0; i--) {
            System.out.println(frase[i]);
        }
    }

    public static void main(String[] args) {

        //Repaso();
        
        //Ejercicio6a5();
        //Ejercicio6a14();
        //Ejercicio6a15();
        
        //Ejercicio6d1();
        //Ejercicio6d3();
        
    }

}
