/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10a4;
import java.util.*;
/**
 *
 * @author Jose Ignacio
 */
public class treeSet {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        TreeSet<Integer> todosLosNumeros = new TreeSet<Integer>();
        TreeSet<Integer> soloPares = new TreeSet<Integer>();
        TreeSet<Integer> soloImpares = new TreeSet<Integer>();

        
        
         for (int i=0; i<9; i++) {
            System.out.println("Introduce nueve numeros "+(i+1)+" de 9");
            int numero = sc.nextInt();
            todosLosNumeros.add(numero);
            
        }
        
       Iterator<Integer> iterator = todosLosNumeros.iterator();
        while(iterator.hasNext()) {
            int a = iterator.next();
            if (a % 2 == 0) {
                soloPares.add(a);
            } else {
                soloImpares.add(a);
            } 
                
        }
        
        
   
        if(soloPares.size() > soloImpares.size()) {
            System.out.println("La cantidad de numeros pares es mayot");
        } else if(soloPares.size() < soloImpares.size()){
            System.out.println("La cantidad de numeros impares es mayor");
        } else {
            System.out.println("La cantidad de pares e impares son iguales ");
        }
    }
}
