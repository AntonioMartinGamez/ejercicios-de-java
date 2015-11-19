/**
 * Define un array de 12 números enteros con nombre num y asigna los valores según la tabla
 * que se muestra a continuación. Muestra el contenido de todos los elementos del array. ¿Qué
 * sucede con los valores de los elementos que no han sido inicializados?
 * 
 * @author Antonio Jose Martín Gámez
 */

public class Array01 {
  public static void main(String[] args) {
        
    int[] n; // se define n como un array de enteros
    n = new int[12]; // se reserva espacio para 4 enteros
            
    n[0] = 39;
    n[1] = -2;
   // n[2] = ;
   // n[3] = ;
    n[4] = 0;
   // n[5] = ;
    n[6] = 14;
   // n[7] = ;
    n[8] = 5;
    n[9] = 120;
   // n[10] = ;
   // n[11] = ;
    
    
    System.out.print("Los valores del array n son los siguientes: ");
    System.out.print(n[0] + ", " + n[1] + ", " + n[2] + ", " + n[4] + ", " + n[5] + ", ");
    System.out.print(n[6] + ", " + n[7] + ", " + n[8] + ", " + n[9] + ", " + n[10]);
    System.out.print(n[11]);
    
  }
}
