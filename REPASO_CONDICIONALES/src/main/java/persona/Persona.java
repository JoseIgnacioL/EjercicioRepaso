/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;


/**
 *7a6 sin mejo
 * 7a8 mejora 1,2
 *7a12 sin mejo
 * 7a15 mejo 1
 * 
 * @author Jose Ignacio
 */
public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    
    public Persona(String nombre,int edad,String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
    
    public void esMayorDeEdad() {
            if(this.edad > 18) {
                System.out.println("La persona es mayor de edad");
            } else {
                System.out.println("La persona no es mayor de edad");
            }
    }
    
    public int cuantoHaceMayorEdad(int edadMayoria) {
       if(edadMayoria < edad) {
        return 0;
      }
       int tiempoMayorEdad = this.edad - 18;
       
       return tiempoMayorEdad;
    }
    
    public boolean asignarDNI(String dni) {
        if(dni.length() > 9 ) {
            this.dni = dni;
            return true;
        }
        return false;
    }
    
    public boolean estaJubilado(int edadJubulacion) {
        if(edadJubulacion < edad) {
            return true;
        }
        return false;
    }
    
}
