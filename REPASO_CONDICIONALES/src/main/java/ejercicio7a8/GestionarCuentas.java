/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7a8;

/**
*
* @author Jose Ignacio
*/
public class GestionarCuentas {
public static void main(String[] args) {

          Direccion d1 = new Direccion("la piruleta", 0);
          Persona p1 = new Persona("nacho", 12, "222222",d1);
          CuentaBancaria c2 = new CuentaBancaria(2000, "ES9000",p1);
          System.out.println("Saldo actual "+c2.consultarSaldo());
          c2.ingreso(100);
          
          System.out.println("El saldo actual es de "+c2.consultarSaldo());
          double extraccion = c2.extraccion(100);
          System.out.println("El saldo acutal es de "+c2.consultarSaldo());
          
          System.out.println(c2.getTitular().getEdad());
          System.out.println(c2.getTitular().getDireccion().calle);
          
          
          
    }
    
}
