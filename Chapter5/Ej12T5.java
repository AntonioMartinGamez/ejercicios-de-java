/**
*Ejercicio 12
*Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer
*término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos
*anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
*144... El número n se debe introducir por teclado.
 */
public class Ej12T5 {
  public static void main(String[] args) {
      
    System.out.println("Por favor introduce un numero por teclado para elevar al cuadrado y al cubo ");
    System.out.println("El programa el programa calculará los cuatro numeros siguientes al introducido mas el mismo");
    
    int n = 0;
    int contador = 0;
    int numero1 = (0);
    int numero2 = (1);
    int aux;
    n = Integer.parseInt(System.console().readLine());
    while (contador <= n ) {
      aux = numero1;
      numero1 = numero2;
      numero2 = numero1 + aux;
      contador++;
      System.out.print(aux + " ");
      
    }
  }
}



   
