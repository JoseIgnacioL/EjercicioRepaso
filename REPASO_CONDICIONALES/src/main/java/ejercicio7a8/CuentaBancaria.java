/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7a8;

/**
 *
 * @author Jose Ignacio
 */
public class CuentaBancaria {

    private double saldo;
    private String numeroCuenta;
    private Persona titular;

    public Persona getTitular() {
        return titular;
    }
    
    public String toString() {
        return titular+numeroCuenta+titular; 
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public CuentaBancaria(double saldo, String numeroCuenta, Persona titular) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public double consultarSaldo() {
        
        return this.saldo;
    }

    public double ingreso(double cantidad) {
        if(this.saldo >= 1000) {
        double incremento  = (this.saldo + cantidad) * 0.02;
       return this.saldo =  this.saldo + incremento;
        } else {
            return this.saldo = this.saldo + cantidad;
        }
    }

    public double extraccion(double cantidad) {
        
        return this.saldo = this.saldo - cantidad;
    }

    
    
    
}
