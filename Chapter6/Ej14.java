
 /**
Ejercicio 14
Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El programa
intentará adivinar el número que estás pensando - un número entre 0 y 100 - teniendo para
ello 5 oportunidades. En cada intento fallido, el programa debe preguntar si el número que
estás pensando es mayor o menor que el que te acaba de decir.
**/
public class Ej14 {
  public static void main(String[] args) {
    System.out.println("Piensa en un numero y trataré de adivinarlo");
    int contador = 5;
    int numeroPensado = (int)(Math.random()*101);
    String numero = " ";
    boolean acertado = false;
    
      do {
        System.out.println(" El numero es el  " + numeroPensado + " ?");
        numero = System.console().readLine();
        
        if (acertado = si) { 
          System.out.println("He acertado el numero! ");
        }
          
       /** } else {
            
            System.out.println("Te has equivocado! prueba de nuevo");
            System.out.println("Te quedan " + contador + " intentos");
            contador --;
            
            if (numero < contrasena){
              System.out.println("El numero en el que estoy pensando es más grande");
            }
            
            if (numero > contrasena){
              System.out.println("El numero en el que estoy pensando es más pequeño");
            }
            
            if (contador == 0) {
              System.out.println("Te has quedado sin intentos");
            }
          } //else **/
      } while (contador > 0); // do 
  }
}


