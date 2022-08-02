package ejercicio10a5hashmap;

import com.sun.crypto.provider.HmacMD5;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Jose Ignacio
 */
public class Usuario {

    private HashMap<Integer, String> hm = new HashMap<>();
    private String nombreIntroducido;
    private int contrasenaIntroducida;
    private String nombreValido;
    private int intentos = 3;

    public Usuario() {
        hm.put(123, "nacho");
        hm.put(12334, "paco");
    }

    public HashMap<Integer, String> getDatos() {
        return this.hm;
    }

    public boolean checkDatos(int contrasena, String usuario) {

        return hm.containsKey(contrasena) && hm.containsValue(usuario);

    }

    public void setNombreIntroducido(String nombreIntroducido) {
        this.nombreIntroducido = nombreIntroducido;
    }

    public void setContrasenaIntroducida(int contrasenaIntroducida) {
        this.contrasenaIntroducida = contrasenaIntroducida;
    }

    public String getUsuarioIntroducido() {
        return nombreIntroducido;
    }

    public int getContrasenaIntroducido() {
        return contrasenaIntroducida;
    }

    public int getIntentos() {
        return intentos;
    }

}
