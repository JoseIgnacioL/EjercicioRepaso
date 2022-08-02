/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10a20;

/**
 *
 * @author Jose Ignacio
 */
public class Mensaje {
    String autor;
    String contenido;
    String fecha;
    
    public Mensaje(String autor,String contenido,String fecha) {
        this.autor = autor;
        this.contenido = contenido;
        this.fecha = fecha;
    }
    
    public String toString() {
        return autor+" "+contenido+" "+fecha;  
    }
}
