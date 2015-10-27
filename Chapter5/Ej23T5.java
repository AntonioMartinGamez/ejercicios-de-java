/**
*
Ejercicio 23
Escribe un programa que permita ir introduciendo una serie indeterminada de números
mientras su suma no supere el valor 10000. Cuando esto último ocurra, se debe mostrar el
total acumulado, el contador de los números introducidos y la media.
 */
public class Ej23T5 {
  public static void main(String[] args) {
    System.out.println("El programa calculará la media de los impares y el mas grande de los pares");   
    System.out.println("Por favor introduce una lista de 10 numeros de uno en uno ");
    
    
    int n = 0;
    double numero =1 ;
    double total = 0;
    double numero2 = 0;
    
    while (total < 10000  ) {
      numero = Double.parseDouble(System.console().readLine());
      n++;
      total = (numero + total);
      
      if (total < 10000){
      System.out.println("Introduce otro numero");
      System.out.println("La suma actual es " + total); 
      } else {
        System.out.println("Has sobrebrepasado las 10000 unidades vamos a detener el programa");
        }
    if (total > 10000){
      n--;
      total = (total - numero);
    }
    System.out.println("Has introducido " + (n) + " numeros");
    System.out.println(" Media "+ total/n);
    
    }
  }
}


   
