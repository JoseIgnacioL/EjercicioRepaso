/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10a20;

/**
 *
 * @author Jose Ignacio
 */
public class Main {

    public static void main(String[] args) {
        Mensaje mensaje = new Mensaje("nacho", "vida", "23/02/22");
        Mensaje mensaje1 = new Mensaje("patata", "roja", "21/02/22");
        Mituiterplus mituiterplus = new Mituiterplus();

        mituiterplus.anadirMensaje(mensaje);
        mituiterplus.anadirMensaje(mensaje1);
        //mituiterplus.borrarMensaje(1);
        mituiterplus.borrarMensajeConTexto("nacho");
        mituiterplus.consultarMensajes();
    }

}
