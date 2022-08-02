package TecladoEstropeado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Pulsar la tecla - es lo mismo que pulsar la telca Inicio
        //Pulsar la tecla + es lo mismo que pulsar la tecla Fin
        //Pulsar la tecla * es lo mismo que pulsar  la tecla flecha derecha
        //Pulsar 3 es lo mismo que pulsar la tecla super

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cadena");
        String texto = sc.nextLine();
        for (int i = 0; i < texto.length(); i++) {
            System.out.println(texto);
        }


    }
}
