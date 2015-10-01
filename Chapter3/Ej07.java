/**
Ejercicio 7
Escribe un programa que calcule el total de una factura a partir de la base imponible.
 */
 
public class Ej07  {
  public static void main(String[] args) {
    
   System.out.print("Por favor, introduce La base_imponible ");
  String linea = System.console().readLine();
  double base = Double.parseDouble(linea);
  
  double iva = 0.21 ;
 
  System.out.println((base * iva)+ + base);
  
 }
}
