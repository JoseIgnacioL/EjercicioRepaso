/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p7a1;

/**
 *
 * @author Jose Ignacio
 */
public class Triangulo {

    private int base;
    private int altura;

    public Triangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getBase() {
        return base;
    }

//    public void calcularPerimetro(int lado1,int lado2,int lado3) {
//        int resultado = lado1 + lado2 + lado3;
//    }
    public int calcularArea() {
        int resultado = base * altura;
        return resultado;
    }

}
