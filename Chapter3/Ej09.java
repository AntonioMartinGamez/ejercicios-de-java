/**
Ejercicio 9
Escribe un programa que calcule el volumen de un cono según la fórmula V = 1/3 πr 2 h
 */
 
public class Ej09  {
  public static void main(String[] args) {
    
   System.out.print("Por favor, introduce el radio ");
  String linea = System.console().readLine();
  int radio = Integer.parseInt(linea);
  
  System.out.print("Por favor, introduce la altura");
  linea = System.console().readLine();
  int altura = Integer.parseInt(linea);
  
 
  System.out.println( (radio * 3.14 * altura * 2)/3);
  
 }
}
