/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7a12;

/**
 *
 * @author Jose Ignacio
 */
public class Movil {

    private int capacidadMaxima;
    private int numeroMaximaAplicaciones;
    private int capacidadUsada = 0;
    private int numeroAplicacionesActuales = 0;

    public Movil(int capacidadMaxima, int numeroMaximaAplicaciones) {
        this.capacidadMaxima = capacidadMaxima;

        this.numeroMaximaAplicaciones = numeroMaximaAplicaciones;
    }

    public void anadirAplicacion(int cap) {
        if (cap > capacidadMaxima) {
            System.out.println("La capacidad no es suficiente");
        } else if ((numeroAplicacionesActuales >= numeroMaximaAplicaciones)) {
            System.out.println("Limite de aplcaciones alcanzado");
        } else {

            this.capacidadUsada = this.capacidadUsada + cap;
            this.numeroAplicacionesActuales = this.numeroAplicacionesActuales + 1;

        }

    }

    public void borrarAplicaciones() {
        this.capacidadUsada = 0;
        this.numeroAplicacionesActuales = 0;

        System.out.println("La capacidada usuada actual es de :" + this.capacidadUsada);
        System.out.println("El numero de aplicaciones actuales es de: " + this.numeroAplicacionesActuales);
    }

    public void mostrarEstado() {
        System.out.println("La capacidad usada es de " + this.capacidadUsada);
        System.out.println("El numero maximo de aplicaciones es de " + this.numeroMaximaAplicaciones);
        System.out.println("Apps instaladas " + this.numeroAplicacionesActuales);
        System.out.println("La memoria es de " + this.capacidadMaxima);
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getNumeroMaximaAplicaciones() {
        return numeroMaximaAplicaciones;
    }

    public void setNumeroMaximaAplicaciones(int numeroMaximaAplicaciones) {
        this.numeroMaximaAplicaciones = numeroMaximaAplicaciones;
    }

    public int getCapacidadUsada() {
        return capacidadUsada;
    }

    public void setCapacidadUsada(int capacidadUsada) {
        this.capacidadUsada = capacidadUsada;
    }

    public int getNumeroAplicacionesActuales() {
        return numeroAplicacionesActuales;
    }

    public void setNumeroAplicacionesActuales(int numeroAplicacionesActuales) {
        this.numeroAplicacionesActuales = numeroAplicacionesActuales;
    }

}
