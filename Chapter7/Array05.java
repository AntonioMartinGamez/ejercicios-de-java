/**
Ejercicio 5
Escribe un programa que pida 10 números por teclado y que luego muestre los números
introducidos junto con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo
respectivamente.
 * 
 * @author Antonio José Martín Gámez
 */

public class Array05 {

  public static void main(String[] args) {
        
    int[] n = new int[10];
    int maximo = 0;
    int minimo = 0;
    System.out.println("El programa almacena 10 numeros por teclado ");
    System.out.println("Y luego los muestra en orden.");

    for (int i = 0; i < 10; i++) {
      n[i] = Integer.parseInt(System.console().readLine());
      if (n[i] > maximo){
        maximo = n[i];
      }
      if (n[i] < minimo){
        minimo = n[i];
      }
    }
    for (int i = 0; i < 10; i++) {
      System.out.print(n[i] + "  ");
    }
    System.out.println(" ");
    System.out.println("Maximo = " + maximo);
    System.out.println("Minimo  = " + minimo);
 
        
  }
}
