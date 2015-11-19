/**
 * Ejercicio 3
Escribe un programa que lea 10 números por teclado y que luego los muestre en orden
inverso, es decir, el primero que se introduce es el último en mostrarse y viceversa.
 * 
 * @author Antonio José Martín Gámez
 */

public class Array03 {

  public static void main(String[] args) {
        
    int[] n = new int[10];
 
    System.out.println("El programa almacena 10 numeros por teclado ");
    System.out.println("Y luego los muestra en orden.");

    for (int i = 0; i < 10; i++) {
      n[i] = Integer.parseInt(System.console().readLine());
    }
    for (int i = 0; i < 10; i++) {
      System.out.print(n[i] + "  ");
    }
    
    for (int i = 9; i >= 0; i--) {
      System.out.print(n[i] + "  ");
    }
    
    
 
        
  }
}
