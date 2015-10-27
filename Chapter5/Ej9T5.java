/**
* Ejercicio 9
Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 */
public class Ej9T5 {
  public static void main(String[] args) {
      
      System.out.println("Por favor introduzca un numero para conocer sus digitos ");
      int contador = 1;
      int n = 0;
      n = Integer.parseInt(System.console().readLine());
      
      while (n >= 10){
        n = n/10;
        contador++;
      }
      
      System.out.println("Su numero tiene " + contador + " cifras");
      
   
     
  }
}
