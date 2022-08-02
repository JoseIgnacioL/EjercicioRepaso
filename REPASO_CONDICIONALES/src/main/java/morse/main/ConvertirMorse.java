package morse.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

public class ConvertirMorse {

    public HashMap<String, String> getDatos() {
        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("A", ".-");
        mapa.put("B", "-...");
        mapa.put("C", "-.-.");
        mapa.put("D", "-..");
        mapa.put("E", ".");
        mapa.put("F", "..-.");
        mapa.put("G", "--");
        mapa.put("H", "....");
        mapa.put("I", "..");
        mapa.put("J", ".---");
        mapa.put("K", "-.-.");
        mapa.put("L", ".-..");
        mapa.put("M", "--");
        mapa.put("N", "-.");
        mapa.put("O", "---.");
        mapa.put("P", ".--.");
        mapa.put("Q", "--.-");
        mapa.put("R", ".-.");
        mapa.put("S", "...");
        mapa.put("T", "-");
        mapa.put("U", "..-");
        mapa.put("V", "...-");
        mapa.put("W", ".--");
        mapa.put("X", "-..-");
        mapa.put("Y", "-.--");
        mapa.put("Z", "--..");

        return mapa;
    }

    public void convertirMorse(String text) {

        HashMap<String, String> mapa = getDatos();

        char letraText = '\0';

        // recorremos el texto y sacamos una a una cada letra
        for (int i = 0; i < text.length(); i++) {
            letraText = text.toUpperCase().charAt(i);

            // convertimos el char en string, pues el mapa tiene string como clave
            // tambien podemos evitar esta linea si ponemos en el mapa la clave como char
            String letrastring = letraText + "";

            // ahora, con la letra, buscamos entre las claves su valor morse
            String valormorse = mapa.get(letrastring);

            // si la letra es una clave del mapa, nos devuelve su valor, si no, nos daria null
            if (valormorse != null) {
                System.out.print(valormorse+" ");

            }
        }
    }
}
