/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed;

/**
 *
 * @author Mariana Villegas
 */
public class Escalera {
    
     public static int escalon(int n){//Metodo para reducir imprimir el numero de escalones que se van bajando.
        if (n == 0){//Caso base, condicion en la que cuando se cumpla, el metodo dejara de llamarse.
           return n;
        } else {
            System.out.println("Vas en el escalon" + " " + n);//Dominio, mientras el caso base no se cumpla vamos a imprimir n.
            return escalon(n-1); // Se va a seguir llamando al metodo para reducir el numero de escalones y poder imprimirlos cuando se vuelva llamar.
            
        }
      
    }
    
    
}
