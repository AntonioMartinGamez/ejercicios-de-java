/**
Ejercicio 4
Escribe un programa que sume, reste, multiplique y divida dos números introducidos por
teclado.
 */
 
public class Ej04t3 {
  public static void main(String[] args) {
    
   System.out.print("Por favor, introduce un numero ");
  String linea = System.console().readLine();
  int numero1 = Integer.parseInt(linea);
  
  System.out.print("Por favor, introduce otro numero ");
  linea = System.console().readLine();
  int numero2 = Integer.parseInt(linea);
  
  
  
  
  System.out.println(numero1 + numero2);
  System.out.println(numero1 - numero2);
  System.out.println(numero1 * numero2);
  System.out.println((double)numero1 / (double)numero2);
  }
}
