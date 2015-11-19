/**
Ejercicio 2
Define un array de 10 caracteres con nombre simbolo y asigna valores a los elementos
según la tabla que se muestra a continuación. Muestra el contenido de todos los elementos
del array. ¿Qué sucede con los valores de los elementos que no han sido inicializados?
* 
* @author Antonio Jose Martín Gámez
*/

public class Array02 {
  public static void main(String[] args) {
        
    String[] n; // se define n como un array de enteros
    n = new String[10]; // se reserva espacio para 4 enteros
            
    n[0] = "a";
    n[1] = "x";
   // n[2] = ;
   // n[3] = ;
    n[4] = "@";
   // n[5] = ;
    n[6] = "' '";
    n[7] = "+";
    n[8] = "Q";
    //n[9] = ;
   
    
    System.out.print("Los valores del array n son los siguientes: ");
    System.out.print(n[0] + ", " + n[1] + ", " + n[2] + ", " + n[4] + ", " + n[5] + ", ");
    System.out.print(n[6] + ", " + n[7] + ", " + n[8] + ", " + n[9]);
    
    
  }
}
