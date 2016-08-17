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
public class MetodosDeBusqueda {
 
   //public static int arr[] = new int[50];
  public static int arr[] = {1,9,2,6,7,3,4,8,5,0,10,11,41,13,14,15,16,20,34,19,17,22,25,23,24,21,30,27,44,
      29,26,31,48,33,18,35,36,37,38,49,45,12,42,43,28,40,46,47,32,39}; //arreglo de 50 elementos
  
    public static void busquedaSecuencial(int n){//metodo para buscar un elemento en un arreglo de manera secuencial
        boolean ban = false;//declaramos una bandera con valor falso
        for (int i=0;i < arr.length;i++){//Ciclo para recorrer las posiciones de nuestro arreglo
            if(arr[i]== n){//Si la posicion del arreglo en la que estamos es igual al número que queremos buscar la bandera se hara verdadera declarando que el elemento ha sido encontrado.
                ban = true;//bandera cambia a true;
                System.out.println("El número proporcionado a traves de una busqueda SECUENCIAL se encuentro despues  de:" +" "+ i + " busquedas");// imprimimos el número de veces que tuvo que recorrerse el ciclo para encontrar el número
              }
        }
        if(!ban){//Ya recorrido el arreglo la bandera se hara verdadera y declararemos que el elemento no fue encontrado
            System.out.println("El elemento no se encuentra en el arreglo");
        }
        
    }
    
    public static int busquedaBinaria(int n){//Método para buscar un elemento de manera binaria
        //Utilizaremos ciclos anidados para comparar las posiciones del arreglo
         for(int i=0;i<(arr.length-1);i++){//Este for empieza en la posicion 0 y se le va sumando uno para recorrer todas las posiciones
            for(int j=i+1;j<arr.length;j++){//Este for utiliza otra variable que hará que siempre vaya una posicion despues que la del ciclo anterior
                if(arr[i]>arr[j]){/*Este if nos dice que si el elemento localizado en la variable que se encuentra en la posicion del 
                    primer ciclo es mayor que el elemento declarado en la posicion del segundo ciclo*/
                    //Si el la condicion del if es verdadera los valores se intercambiaran
                    int aux=arr[i];//Primero una variable aux guardara el valor de i
                    arr[i]=arr[j];//Luego la posicion i tomara el valor de j
                    arr[j]=aux;// y j tomara el valor de i que se almacenó en la variable auxiliar
 
                }
            }
        }
  //Una vez ordenado el ciclo comenzamos a buscar el elemento proporcionado de manera binaria
        int ini, fin, centro, valorCentro;//Declaramos variables
        ini = arr[0];// ini tendrá la posicion 0 porque es la inicial
        fin = arr.length;//fin tendrá la ultima posicion del arreglo
        int i=0;//declaramos una variable i igual a 0 que nos servira como contador
        while(ini<fin){ //iniciamos un ciclo en el que nuestra condicion es que mientras la posicion inicia es menor a la final haremos lo siguiente:
            i++;// a la variable contadora le sumaremos 1 
            centro = ((ini+ fin)/2);//para sacara la posicion central sumaremos la inicial con la final y la dividiremos entre 2 
            valorCentro = centro;//en esta variable quedara guardada la posicion de centro previamente obtenida
            if(valorCentro == n){ //Si valorCentro es igual al número que queremos encontrar imprimiremos lo siguiente:
                System.out.println("El número proporcionado a traves de busqueda BINARIA se encuentro despues  de:" +" "+ i + " busquedas");
            return 0;// regresamos 0 para que el metodo termine
        }else{//si no se cumple lo del if pasaremos a lo siguiente
            if(n<valorCentro){/*si el número que buscamos es menor que la posicion del centro sacado, la variable fin va a ser
                igual al valor de centro menos 1*/
                fin = centro-1;
            }else{ // si no es menor, la variable ini va a ser igual a la posicion del centro + 1;
                ini = centro+1;
            }
        }
        //El ciclo vuelve a comenzar
        } 
       
       return 0; //regresamos 0 para terminar       
    }
}
