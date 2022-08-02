/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7a15;

/**
 *
 * @author Jose Ignacio
 */
public class Vestido {

    private String nombre;
    private int talla;
    private String marca;
    private double precio;
    private boolean temporadaRebajas;
    private int unidadesEnAlmacen;

    public Vestido(String nombre, int talla, String marca, double precio, boolean temporadaRebajas, int unidadesEnAlmacen) {
        this.nombre = nombre;
        this.talla = talla;
        this.marca = marca;
        this.precio = precio;
        this.temporadaRebajas = temporadaRebajas;
        this.unidadesEnAlmacen = unidadesEnAlmacen;
    }

    public Vestido(String nombre, int talla, String marca, boolean temporadaRebajas, int unidadesEnAlmacen) {
        this.nombre = nombre;
        this.talla = talla;
        this.marca = marca;
        this.temporadaRebajas = temporadaRebajas;
        this.unidadesEnAlmacen = unidadesEnAlmacen;
    }

    public Vestido() {

    }

    public void cambairTemporada() {
        if (temporadaRebajas == true) {
            System.out.println(this.precio = this.precio * 0.4);
        } else if (temporadaRebajas == false) {
            System.out.println(this.precio = this.precio);
        }
    }

    public double precioEnRebajas() {
        if (temporadaRebajas == true) {
            System.out.println("El precio es de ");
            return this.precio = this.precio * 0.4;
        } else {
            System.out.println("El precio con rebaja es de ");
            return this.precio = precio * 0.4;
        }
        
    }
    
    public boolean retirarUnidades(int uni) {
        if(unidadesEnAlmacen <= 0) {
            return false;
        } else {
            this.unidadesEnAlmacen  = this.unidadesEnAlmacen - uni;
            return true;
        }
    }

    public double importeEnAlmacen() {
        if(temporadaRebajas == true) {
            return this.precio = (this.precio * unidadesEnAlmacen) * 0.4;
        } else {
             return this.precio = (this.precio * unidadesEnAlmacen);
        }
    }
    
    public void aumentarPrecio(int porcentaje) {
        System.out.println("El precio acutal es "+(this.precio*porcentaje)/100);
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean getTemporadaRebajas() {
        return temporadaRebajas;
    }

    public int getUnidadesEnAlmacen() {
        return unidadesEnAlmacen;
    }

    public String toString() {
        return nombre+precio+talla+marca;
    }
}
