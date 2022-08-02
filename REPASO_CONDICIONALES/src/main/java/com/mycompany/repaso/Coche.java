/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repaso;

public class Coche {
     // ATRIBUTOS ---------------
    private String marca;
    private int precio = 100;
    private String matricula;
    public static  int iva = 21;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int nuevoprecio) {
        this.precio = nuevoprecio;
    }

    public Coche(String marca, int precio, String matricula) {
        this.marca = marca;
        this.precio = precio;
        this.matricula = matricula;
    }
    public Coche(String marca, int precio) {
        this.marca = marca;
        this.precio = precio;
    }
    Coche() {

    }

    // metodos
    public  void rebajar() {
        precio = precio - 10;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
