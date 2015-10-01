/**
Ejercicio 3
Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere convertir
debe ser introducida por teclado.
 */
 
public class Ej03t3 {
  public static void main(String[] args) {
    
   System.out.print("Por favor, introduce una cantidad de pesetas ");
  String linea = System.console().readLine();
  int pesetas;
  pesetas = Integer.parseInt(linea);
  
  double euros = (int)(pesetas/166);
  
  System.out.printf("%.2feuros", euros);
  

  }
}
