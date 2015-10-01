/**
Ejercicio 10
Realiza un conversor de Mb a Kb.
 */
 
public class Ej10 {
  public static void main(String[] args) {
    
   System.out.print("Por favor, introduce los Mb ");
  String linea = System.console().readLine();
  double mb = Double.parseDouble(linea);
  
  
  
 
  System.out.println( mb*1024);
  
 }
}
