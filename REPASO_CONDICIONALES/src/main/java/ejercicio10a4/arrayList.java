package ejercicio10a4;

import java.util.*;


public class arrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> todosLosNumeros = new ArrayList<Integer>();
        ArrayList<Integer> soloPares = new ArrayList<Integer>();
        ArrayList<Integer> soloImpares = new ArrayList<Integer>();

        for (int i=0; i<9; i++) {
            System.out.println("Introduce nueve numeros "+(i+1)+" de 9");
            int numero = sc.nextInt();
            todosLosNumeros.add(numero);
            
            if(todosLosNumeros.get(i) % 2 == 0) {
                soloPares.add(todosLosNumeros.get(i));
            } else  {
                soloImpares.add(todosLosNumeros.get(i));
            }   
            
        }
        
        System.out.println("Array de numeros pares "+soloPares);
        System.out.println("Array de numeros impares "+soloImpares);
        
        if(soloPares.size() > soloImpares.size()) {
            System.out.println("La cantidad de numeros pares es mayot");
        } else if(soloPares.size() < soloImpares.size()){
            System.out.println("La cantidad de numeros impares es mayor");
        } else {
            System.out.println("La cantidad de pares e impares son iguales ");
        }
    }
}
