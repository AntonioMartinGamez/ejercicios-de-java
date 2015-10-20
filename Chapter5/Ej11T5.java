/**
*Ejercicio 11
*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros
*números enteros a partir de uno que se introduce por teclado.
 */
public class Ej11T5 {
  public static void main(String[] args) {
      
    System.out.println("Por favor introduce un numero por teclado para elevar al cuadrado y al cubo ");
    System.out.println("El programa el programa calculará los cuatro numeros siguientes al introducido mas el mismo");
    
    int numero = 0;
    int contador = 0;
    numero = Integer.parseInt(System.console().readLine());
    while (contador <= 4 ) {
      
      contador++;
      System.out.println((numero) + "²" + " = " + (numero * numero) + " , " + (numero) + "³" + " = " + (numero * numero * numero));
      numero++;
    }
  }
}



   
