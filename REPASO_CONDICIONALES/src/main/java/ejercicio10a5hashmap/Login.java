package ejercicio10a5hashmap;

import java.util.Scanner;

/**
 *
 * @author Jose Ignacio
 */
public class Login {

    public void conectarWeb() {
        Usuario us = new Usuario();
        Scanner sc = new Scanner(System.in);
        boolean estado = false;
        int intentos = us.getIntentos();

        while (estado == false) {

            System.out.println("Introduce un nombre de usuario");
            String usuarioIntroducido = sc.nextLine();
            System.out.println("Introduce una contraseña");
            int contrasenaIntroducida = Integer.parseInt(sc.nextLine());

            intentos--;

            if (us.checkDatos(contrasenaIntroducida, usuarioIntroducido)) {
                System.out.println("Correcto");
                estado = true;
            }

            if (intentos == 0) {
                System.out.println("Numero de intentos agotado");
                estado = true;
            }

        }
        sc.close();
    }

}
