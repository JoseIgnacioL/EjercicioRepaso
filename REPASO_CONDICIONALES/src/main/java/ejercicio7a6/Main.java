/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7a6;

/**
 *
 * @author Jose Ignacio
 */
public class Main {


    public static void main(String[] args) {

        System.out.println("Datos coche 1");
        Coche c1 = new Coche("honda", "rojo", 100, 12200.00, 40.01, 2001, 1000, "aaaa");
        System.out.println(c1.getAno());
        System.out.println(c1.getKm());
        System.out.println(c1.getCoclor());
        System.out.println(c1.getPrecio());
        System.out.println(c1.getMarca());
        System.out.println(c1.getDniTitula());
        System.out.println(c1.getFactorContaminacion());
        System.out.println(c1.getMatricula());

        c1.setMatricula("aaaaaaa");
        System.out.println(c1.getMatricula());
        c1.anadirKm(200);

        System.out.println("Datos del coche 2");
        Coche c2 = new Coche("renault", "rojo", 100, 12200.00, 50.00, 2001, 1000, "aaaa");
        System.out.println(c2.getAno());
        System.out.println(c2.getKm());
        System.out.println(c2.getCoclor());
        System.out.println(c2.getPrecio());
        System.out.println(c2.getMarca());
        System.out.println(c2.getDniTitula());
        System.out.println(c2.getFactorContaminacion());
        System.out.println(c2.getMatricula());

        c2.setMatricula("aafasf");
        System.out.println(c2.getMatricula());

        Coche c3 = new Coche("ford", "rojo", 100, 12200.00, 45.01, 2001, 1000, "aaaa");
        System.out.println(c3.getAno());
        System.out.println(c3.getKm());
        System.out.println(c3.getCoclor());
        System.out.println(c3.getPrecio());
        System.out.println(c3.getMarca());
        System.out.println(c3.getDniTitula());
        System.out.println(c3.getFactorContaminacion());
        System.out.println(c3.getMatricula());

        double precios = (c1.getPrecio() + c2.getPrecio() + c3.getPrecio());
        double media = precios / 3;

        System.out.println("La media de los precios es " + media);

        if (c1.getFactorContaminacion() > c2.getFactorContaminacion()) {
            if (c1.getFactorContaminacion() > c3.getFactorContaminacion()) {
                System.out.println("Numero mayor es " + c1.getMarca());
            }else {
                System.out.println("Numero mayor es "+c3.getMarca());
            }

                } else if (c2.getFactorContaminacion() > c3.getFactorContaminacion()) {
                    System.out.println("Numero mayor es "+c2.getMarca());
                } else {
                    System.out.println("Numero mayor es "+c3.getMarca());
                }

        }
    }
