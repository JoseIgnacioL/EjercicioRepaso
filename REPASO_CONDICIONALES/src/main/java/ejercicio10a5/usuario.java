
package ejercicio10a5;



public class usuario {
    
    private String nombreUsarioValido = "nacho";
    private String contrasenaValida = "123";
   
    
    private String nombreIntroducido;
    private String contrasenaIntroducida;
    private int intentos = 3;
   
    public usuario(String nombreIntroducido, String contrasenaIntroducida) {
        this.nombreIntroducido = nombreIntroducido;
        this.contrasenaIntroducida = contrasenaIntroducida;
    }
    
    public usuario() {
        
    }
    
    public void setNombreIntroducido(String nombreIntroducido) {
        this.nombreIntroducido = nombreIntroducido;
    }

    public void setContrasenaIntroducida(String contrasenaIntroducida) {
        this.contrasenaIntroducida = contrasenaIntroducida;
    }
    
    public String getUsuarioIntroducido() {
        return nombreIntroducido;
    }
    
     public String getContrasenaIntroducido() {
        return contrasenaIntroducida;
    }
  
    public int getIntentos() {
        return intentos;
    }
    
    public String getNombreUsario() {
        return nombreUsarioValido;
    }

    public String getContrasena() {
        return contrasenaValida;
    }
}
