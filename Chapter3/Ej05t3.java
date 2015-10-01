/**
Ejercicio 5
Escribe un programa que calcule el área de un rectángulo.
 */
 
public class Ej05t3 {
  public static void main(String[] args) {
    
   System.out.print("Por favor, introduce La base ");
  String linea = System.console().readLine();
  double base = Double.parseDouble(linea);
  
  System.out.print("Por favor, introduce La altura ");
  linea = System.console().readLine();
  double altura = Double.parseDouble(linea);
  
  System.out.println(base * altura);
  
 }
}
