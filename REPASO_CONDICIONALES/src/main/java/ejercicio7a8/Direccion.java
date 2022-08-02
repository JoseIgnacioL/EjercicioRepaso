/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7a8;

/**
 *
 * @author Jose Ignacio
 */
public class Direccion {
    String calle;
    int numero;

    
     public Direccion(String calle,int numero) {
        this.calle = calle;
        this.numero = numero; 
    }
    
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String toString() {
        return calle+numero;
    }
    
   
    
}
