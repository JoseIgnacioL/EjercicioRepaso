package com.mycompany.repaso;




import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Jose Ignacio
 */
public class EJERCICIOS_ENTRADA_SALIDA {

    public static void Ejercicio1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Como te llamas?");

        String textoUsuario = sc.nextLine();

        System.out.println("buenas tardes, Sr" + textoUsuario);

    }

    public static void Ejercicio2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");

        int numeroUsuario = sc.nextInt();

        System.out.println("el numero es " + numeroUsuario);
    }

    public static void Ejercicio3() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numeros");

        int numero1 = sc.nextInt();

        System.out.println("Introduce segundo numeros");

        int numero2 = sc.nextInt();

        System.out.println("los numeros son" + numero1 + " e " + numero2);
    }

    public static void Ejercicio4() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");

        int numero1 = sc.nextInt();

        System.out.println("Introduce segundo numero");
        int numero2 = sc.nextInt();

        int resultado = numero1 + numero2;

        System.out.println("los suma de ambos numeros " + numero1 + " + " + numero2 + "es " + resultado);

    }

    public static void Ejercicio5() {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Como te llamas?");
        String nombre = sc.nextLine();
        System.out.println("Que edad tienes?");
        int edad = sc.nextInt();

        System.out.println("me llamo " + nombre + " y tengo " + edad + " años");

    }

    public static void Ejercicio6() {
        double numero1 = 4.5;

        int numero2 = (int) numero1;

        System.out.println("Numero tipo double " + numero1 + " numero tipo int " + numero2);

    }

    public static void Ejercicio7() {
        final double pi = 3.14;

        //pi = 4; 
    }

    public static void Ejercicio8() {
        Random r = new Random();

        int numeroAleatorio = r.nextInt(100);

        System.out.println(numeroAleatorio);
    }

    public static void Ejercicio9() {
        Random r = new Random();
        int numeroAleatorio = r.nextInt(20) + 1;

        System.out.println(numeroAleatorio);
    }

    public static void Ejercicio10() {
        Scanner sc = new Scanner(System.in);

        String nombre;
        int edad;

        System.out.println("Como te llamas?");
        nombre = sc.nextLine();

        System.out.println("Que edad tienes?");
        edad = sc.nextInt();

        int resultado = edad - 18;

        System.out.println("El señor " + nombre + "y hace " + resultado + " que es mayor de edad");

    }

    public static void Ejercicio1A1() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");

        int radio = sc.nextInt();

        double area = 2 * Math.PI * radio;

    }

    public static void Ejercicio1A2() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");

        int radio = sc.nextInt();

        double circunferencia = 2 * Math.PI * radio;

    }

    public static void Ejercicio1A3() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");

        int numero1 = sc.nextInt();

        System.out.println("Introduce un segundo numero");
        int numero2 = sc.nextInt();

        System.out.println(numero1);
        System.out.println(numero2);

        int aux = numero1;
        numero1 = numero2;
        numero2 = aux;

        System.out.println("Cambio valores");
        System.out.println(numero1);
        System.out.println(numero2);
    }

    public static void Ejercicio1A4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una temperatura en Celsius y se pasara a Fahrenheit");
        double temperatura = sc.nextDouble();

        double temperaturaFharenhit = (9 / 5) * temperatura + 32;

        System.out.println(temperatura +" grados Celsius son y grados fahrenhit " + temperaturaFharenhit);

    }

    public static void Ejercicio1A6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para saber su doble");
        int numero = sc.nextInt();

        int resultado = numero * 2;

        System.out.println(resultado);

    }
    
    public static void Ejercicio1A7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un precio");
        double precio = sc.nextDouble();
        
        final  double iva = 0.21;
        double resultado = (precio * iva)+precio;
        
        System.out.println("El precio con el IVA es: "+resultado);
    }
    
    public static void Ejercicio1A9() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el numero de hombres del aula");
        int numHombres = sc.nextInt();
        System.out.println("Introduce el numero de mujeres del aula");
        int numMujeres = sc.nextInt();
        
        int total = numHombres+numMujeres;
        double porcentMujeres = (numMujeres*100)/total;
        double porcentHombres = (numHombres*100)/total;
        
        System.out.println("El porcentaje de hombres es "+porcentHombres+" y el de mujeres "+porcentMujeres);
                
        
    }
    

    public static void main(String[] args) {

//        Ejercicio1();
//        Ejercicio2();
//        Ejercicio3();
//        Ejercicio4();
//        Ejercicio5();
//        Ejercicio6();
//        Ejercicio8();
//        Ejercicio9();
//        Ejercicio10();
//        Ejercicio1A1();
//        Ejercicio1A2();
//        Ejercicio1A3();
//        Ejercicio1A4();
//        Ejercicio1A6();
//        Ejercicio1A7();
//        Ejercicio1A9();

    }

}
