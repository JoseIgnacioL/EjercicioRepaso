package ejercicio10a20;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Jose Ignacio
 */
public class Mituiterplus {

    ArrayList<Mensaje> lista = new ArrayList<>();

    public void anadirMensaje(Mensaje m) {
        lista.add(m);
    }

    public void borrarMensaje(int numeroMensaje) {
        for (int i = 0; i < lista.size(); i++) {
            if (i == numeroMensaje) {
                lista.remove(i);
                return;
            }

        }
        System.out.println("El mensaje no existe");
    }

    public void borrarMensajeConTexto(String textobuscado) {
       Iterator<Mensaje> iterator = lista.iterator();
        while (iterator.hasNext()) {
            Mensaje s = iterator.next();
            if (s.equals(textobuscado)) {
                iterator.remove();
            }
        }
    }

    public void consultarMensajes() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

}
