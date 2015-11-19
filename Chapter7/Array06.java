/**
Ejercicio 6
Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota
los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición
1, el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la
posición 0. Finalmente, muestra el contenido del array.
 * 
 * @author Antonio José Martín Gámez
 */

public class Array06 {

  public static void main(String[] args) {
        
    int[] n = new int[11];
    int ultimo = 0;
    System.out.println("El programa almacena 10 numeros por teclado ");
    System.out.println("Y luego los muestra moviendolos una fila.");

    for (int i = 0; i < 10; i++) {
      n[i] = Integer.parseInt(System.console().readLine());
     
    }
    ultimo = n[9];
      for (int j = 9; j > 0; j--) {
      n[j] = n[j-1];
     
    }
  
    
    System.out.print(ultimo + "  ");
    for (int i = 0; i < 9; i++) {
      System.out.print(n[i] + "  ");
    }
 
        
  }
}
