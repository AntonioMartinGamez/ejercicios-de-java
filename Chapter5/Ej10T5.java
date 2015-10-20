/**
* Ejercicio 10
Escribe un programa que calcule la media de un conjunto de números positivos introduci-
dos por teclado. A priori, el programa no sabe cuántos números se introducirán. El usuario
indicará que ha terminado de introducir los datos cuando meta un número negativo.
 */
public class Ej10T5 {
  public static void main(String[] args) {
      
      System.out.println("Por favor introduce numeros por teclado para hacer la media ");
      System.out.println("El programa terminará cuando introduzca un numero negativo ");
      int contador = 0;
      int numero = 0;
      double suma = 0;
    while (numero >= 0) {
      System.out.println("Por favor introduce otro numero ");
      numero = Integer.parseInt(System.console().readLine());
      contador++;
      suma += numero;
      
    } 
  System.out.println((suma - numero)/(contador - 1));
  }
}



   
