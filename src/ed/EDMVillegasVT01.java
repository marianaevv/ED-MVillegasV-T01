/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed;
/**
 *
 * @author Mariana Estefanía Villegas Vazquez
 * A00513571
 * 4rto semestre
 */
public class EDMVillegasVT01 {
 
   public static int potencia(int x, int n){//metodo para elevar un número a n potencia.
    if(n<0){//Este if nos arrojara un String diciendo que solo se aceptan valores mayores o iguales a 0 ya que es una de las restricciones
        System.out.println("Solo potencias mayores o iguales a 0");
    }else{ //Si n no es menor a 0 entonces pasará lo siguiente:
        if(n==0){ //CASO BASE si la potencia a la que se eleva x es 0 entonces regresaremos el valor de 1 ya que ese es el valor de cualquier número elevado a la 0.
           System.out.println("El resultado es:");
           return 1;
        }else{ //Si el la potencia ingresada no es igual a 0 pasaremos a lo siguiente
          
          return x * potencia(x, n-1);/* CASO RECURSIVO el valor de x se almacenara para multiplicarse por x restando a n-1 es decir, si tenemos un 5^2 quedara 5* (volvemos a recorrer 
        el método pero ahora regresara como 5^1, vuelve a entrar en este caso y ahora va 5*5 (volvemos a repasar el metodo) ahora tenemos 5^0 que
       ya entra en el primer if solo que ahora regresaremos un 1, quedando al final una operacion asi: 5*5*1 siendo la respuesta 25.*/
      }//cierre del segundo else
        
    } //cierre del primer else
    System.out.println("La potencia que insertaste fue :");//Esto solo se imprimira si el primer if de n<0 es verdadero
     return n;//regresamos la potencia que ingreso mal el usuario
}
}
