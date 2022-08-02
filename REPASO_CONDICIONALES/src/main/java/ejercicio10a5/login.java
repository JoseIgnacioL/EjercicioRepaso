package ejercicio10a5;

import java.util.Scanner;

/**
 *
 * @author Jose Ignacio
 */
public class login {

    public void conectarWeb() {

        usuario usuario = new usuario();
        boolean estado = true;
        int intentos = usuario.getIntentos();


        while (estado == true) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el nombre de usuario");
            String ususario = sc.nextLine();
            System.out.println("Introduce la contraseña del usuario");
            String contrasena = sc.nextLine();

            usuario.setNombreIntroducido(ususario);

            usuario.setContrasenaIntroducida(contrasena);
            
            intentos--;

            if ((usuario.getNombreUsario().equals(usuario.getUsuarioIntroducido()) && usuario.getContrasena().equals(usuario.getContrasenaIntroducido()))) {
                estado = false;
            } 
            
            if(intentos == 0) {
                System.out.println("Has supertado el numero de inentos");
                estado = false;
            }
        }

    }

}
