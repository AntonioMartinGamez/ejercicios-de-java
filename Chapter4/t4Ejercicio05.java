/**
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax 2 + bx + c =
 * 0).
 *
 * @author Antonio José Martin Gamez
 */

public class t4Ejercicio05 {
  public static void main(String[] args) {


/**
 * formula de la ecuacion de segundo grado
 * -b+raiz b^2 -4 * a * c
 *   -     ---------------
 *            2 * a
 */
 
 
  double sol1 , sol2;
    System.out.println("Este programa resuelve ecuaciones de segundo grado del tipo ax^2 + bx  + c = 0");
    System.out.print("Por favor, introduzca el valor de a: ");
    Double a = Double.parseDouble(System.console().readLine());
    System.out.print("Ahora introduzca el valor de b: ");
    Double b = Double.parseDouble(System.console().readLine());
    System.out.print("Ahora introduzca el valor de c: ");
    Double c = Double.parseDouble(System.console().readLine());
    

  if ((a == 0) && (b == 0) && (c == 0))  {
    System.out.println("Esa ecuación tiene infinitas soluciones reales.");
  } 
  
  if ((a == 0) && (b == 0) && (c != 0)) {
    System.out.println("La ecuación no tiene solución.");
  }
  
  if ((a != 0) && (b != 0) && (c == 0)) {
    System.out.println("sol1 = 0");
    System.out.println("sol2 = " + (-b / a));
  }
  
  if ((a == 0) && (b != 0) && (c != 0)) {
    System.out.println("sol1 = sol2 = " + (-c / b));
  }
  
  if ((a != 0) && (b != 0) && (c != 0)) {	

  double discriminante = b*b - (4 * a * c);

  if (raiz < 0) {
    System.out.println("La ecuación no tiene soluciones reales");
  }	else {
        System.out.println("sol1 = " + (-b + Math.sqrt(raiz))/(2 * a ));
        System.out.println("sol2 = " + (-b - Math.sqrt(raiz))/(2 * a ));
      }
  
  
    } 
  }
}

