package com.mycompany.repaso;

import java.util.Scanner;

public class REPASO_CONDICIONALES {

 
    public static void Ejercicio2() {

        int dia, mes, anyo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un año");
        anyo = sc.nextInt();

        System.out.println("Introduce un mes");
        mes = sc.nextInt();

        System.out.println("Introduce un dia");
        dia = sc.nextInt();

        if (anyo >= 2001 && anyo <= 2100 && mes > 0 && mes < 13 && dia > 0 && dia <= 30) {
            System.out.println("Fecha correcta");
        } else {
            System.out.println("Fecha Incorrecta");
        }

    }

    public static void Ejercicio3() {
        Scanner sc = new Scanner(System.in);
        final String usuarioValida = "pepe";
        final int contrasenyaValida = 123;

        System.out.println("Introduce usuario y contraseña para el login");
        String usuario = sc.nextLine();
        int contrasenya = sc.nextInt();

        if (usuarioValida.equals(usuario) && contrasenyaValida == contrasenya) {
            System.out.println("Login Correcto");
        } else {
            System.out.println("Login Incorrecto");
        }
    }
    
    
    // ########## EJERCICIOS CASA  ##########

    public static void Ejercicio16() {
        Scanner sc = new Scanner(System.in);

        double saldoInicial;
        int cantidadSacar;

        System.out.println("Saldo Inicial");
        saldoInicial = sc.nextDouble();

        System.out.println("Cantidad que desea extraer");
        cantidadSacar = sc.nextInt();

        if (cantidadSacar > saldoInicial) {
            System.out.println("No hay dinero suficiente");
        } else if (cantidadSacar % 10 != 0) {
            System.out.println("No es cantidad correcta");
        } else {
            System.out.println("Su saldo inical es:" + (saldoInicial - cantidadSacar));
        }
    }

    public static void Ejercicio17() {
        Scanner sc = new Scanner(System.in);

        double valorCompra;
       
        System.out.println("Saldo Inicial");
        valorCompra = sc.nextDouble();

        if (valorCompra < 100) {
            double descuento = (valorCompra * 5) / 100;
            System.out.println("La prenda se queda en" + descuento);

        } else if (valorCompra > 100) {
            double descuento = (valorCompra * 10) / 100;
            System.out.println("La prenda se queda en" + descuento);
        }
    }
    
    public static void Ejercicio2b() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numeros = sc.nextInt();
        
        String numero = Integer.toString(numeros);
        
        System.out.println(numero.substring(0, 1));
        
        
    }

    public static void main(String[] args) {
      
        //Ejercicio16();
        //Ejercicio17();
        Ejercicio2b();

    }

    //
//        System.out.println(area);
//         CAST O CONVERTIR
//        int x = 5;
//        double f = 4.98;
//
//        x = (int) f;
//
//        f = x;
//
//         wrappers o envolventes
//        Integer xx = 5;
//        x = xx;
//        xx = x;
//
//        ArrayList<Integer> lis;
//
//         CONDICIONALES
//        if (x == 9) {
//
//        }
//
//        String cadena = "hola";
//        String saludo = "hola";
//
//        int nota = 6;
//
////        if (nota < 5) {
////            System.out.println("la cagaste");
////        } else if (nota < 7) {
////            System.out.println("va bien");
////        } else if (nota > 7 && nota < 9) {
////            System.out.println("notable");
////        } else {
////            System.out.println("sobresaliente");
////        }
//        
//         CASSTING SRING INT
//        int k = Integer.parseInt("54343");
//        String kkk = String.valueOf(44);
//        String kk2 = Integer.toString(33);
//        String kk3 = 2345 +"";
//        
//
//        
//        Scanner sc = new Scanner(System.in);   
//        
//        System.out.println("Dime un numero");
//
//        System.out.println("Dime una cadena");
//        String texto = sc.nextLine();
//        
//                
//         System.out.print("adfc adcadc a\n asdc asc");   
//        
//        
//         RANDOM
//        Random ran = new Random();
//        int m = ran.nextInt(200);   // entre 0 y 199
//        int azar = ran.nextInt(160) + 40;  // entre 40 y 200
//        
//        int ekk =(int)( Math.random()*200);
//        int kok = (int) (Math.random()*160 )+ 40;
}
