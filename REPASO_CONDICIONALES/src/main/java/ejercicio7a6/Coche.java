/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7a6;

/**
 *
 * @author Jose Ignacio
 */
public class Coche {

    private String marca;
    private String coclor;
    private int Km = 0;
    private double precio;
    private double factorContaminacion;
    private int ano;
    private   String matricula;
    private double impuestoMatricula;
    private String dniTitula;

    public Coche(String marca, String color, int Km, double precio, double factorContaminacion, int ano, double impuestoMatricula, String dniTitula) {
        this.marca = marca;
        this.coclor = color;
        this.Km = Km;
        this.precio = precio;
        this.factorContaminacion = factorContaminacion;
        this.ano = ano;
        this.dniTitula = dniTitula;
        this.impuestoMatricula = impuestoMatricula;

    }

    public String getMarca() {
        return marca;
    }

    public String getCoclor() {
        return coclor;
    }

    public void setCoclor(String coclor) {
        this.coclor = coclor;
    }

    public int getKm() {
        return Km;
    }

    public void setKm(int Km) {
        this.Km = Km;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getFactorContaminacion() {
        return factorContaminacion;
    }

    public int getAno() {
        return ano;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getImpuestoMatricula() {
        return impuestoMatricula;
    }

    public void setImpuestoMatricula(double impuestoMatricula) {
        this.impuestoMatricula = impuestoMatricula;
    }

    public String getDniTitula() {
        return dniTitula;
    }

    public void setDniTitula(String dniTitula) {
        this.dniTitula = dniTitula;
    }

    public void anadirKm(int km) {
        this.Km = this.Km + km;
        
    }
}
