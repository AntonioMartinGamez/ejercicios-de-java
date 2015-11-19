
 /**
Ejercicio 7
Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14
partidos y el pleno al quince (15 filas).
**/
public class Ej06 {
  public static void main(String[] args) {
    System.out.println("por favor introduza una contraseña");
    int contador = 5;
    int contrasena = (int)(Math.random()*101);
    int numero = 0;
    
      do {
        if (contrasena == numero) { 
          System.out.println("Has acertado el numero! ");
        } else 
            System.out.println("Te has equivocado");
            System.out.println("Prueba de nuevo ");
            contador --;
            numero = Integer.parseInt(System.console().readLine());
        
        if (numero < contrasena){
          System.out.println("El numero en el que estoy pensando es más grande");
        }
        if (numero > contrasena){
          System.out.println("El numero en el que estoy pensando es más pequeño");
        }
        
        if (contador == 0) {
          System.out.println("Te has quedado sin intentos");
        }
        System.out.println("Te quedan " + contador + " intentos");
      } while (contador > 0);
  }
}


