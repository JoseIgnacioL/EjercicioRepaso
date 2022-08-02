/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10a3;

/**
 *
 * @author Jose Ignacio
 */
public class Palabras {

    String contenido;
    int tamanyo;
    boolean prohibida;

    public Palabras(String contenido, int tamanyo, boolean prohibida) {
        this.contenido = contenido;
        this.prohibida = prohibida;
        this.tamanyo = tamanyo;
    }
    
    public Palabras(String contenido) {
        this.contenido = contenido;
    } 

    public Palabras() {

    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getTamanyo() {
        return tamanyo;
    }

    public void setTamanyo(int tamanyo) {
        this.tamanyo = tamanyo;
    }

    public boolean isProhibida() {
        return prohibida;
    }

    public void setProhibida(boolean prohibida) {
        this.prohibida = prohibida;
    }
    
    public String toString() {
        return contenido;
    }

   

}
