/**
Ejercicio 10
Realiza un conversor de Mb a Kb.
 */
 
public class Ej11 {
  public static void main(String[] args) {
    
   System.out.print("Por favor, introduce los kb ");
  String linea = System.console().readLine();
  double kb = Double.parseDouble(linea);
  
  
  
 
  System.out.println( kb/1024);
  
 }
}
