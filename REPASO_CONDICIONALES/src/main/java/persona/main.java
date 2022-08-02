/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author Jose Ignacio
 */
public class main {
    public static void main(String[] args) {
         Persona p1 = new Persona("Nacho", 25, "Patata");
         System.out.println(p1.asignarDNI("22222"));
         System.out.println(p1.cuantoHaceMayorEdad(25));
         System.out.println(p1.estaJubilado(25));
    }
   
    
    
}
