/**
* Ejercicio 8
* Muestra la tabla de multiplicar de un número introducido por teclado.
 */
public class Ej8T5 {
  public static void main(String[] args) {
      
      System.out.println("Por favor introduzca un numero para multiplicar ");
      
      int numero = Integer.parseInt(System.console().readLine());  
    for (int i = 0; i <= 10; i+= 1) {
      System.out.println(numero + " x " + i + " = "  + i * numero);
      
    }
  
  }
}



   
