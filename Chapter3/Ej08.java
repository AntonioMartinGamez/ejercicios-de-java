/**
Ejercicio 8
Escribe un programa que calcule el salario semanal de un empleado en base a las horas
trabajadas, a razón de 12 euros la hora.
 */
 
public class Ej08  {
  public static void main(String[] args) {
    
   System.out.print("Por favor, introduce el numero de horas ");
  String linea = System.console().readLine();
  int horas = Integer.parseInt(linea);
  
  System.out.print("Por favor, introduce los dias que trabaja, numericamente");
  linea = System.console().readLine();
  int dias = Integer.parseInt(linea);
 
  System.out.println((horas * dias) * 12 );
  
 }
}
