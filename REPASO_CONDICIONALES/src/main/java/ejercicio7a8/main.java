/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7a8;

/**
 *
 * @author Jose Ignacio
 */
public class main {

    public static void main(String[] args) {
        Direccion d1 = new Direccion("la piruleta", 0);
        Persona p1 = new Persona("nacho", 12, "222222",d1);
        CuentaBancaria c1 = new CuentaBancaria(2000, "ES901",p1);
        System.out.println(c1.ingreso(1000));
        System.out.println(c1.extraccion(3000));
    }
}
