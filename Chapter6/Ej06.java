
 /**
Ejercicio 6
Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo
y tiene para ello 5 oportunidades. Después de cada intento fallido, el programa dirá cuántas
oportunidades quedan y si el número introducido es menor o mayor que el número secreto.
**/
public class Ej06 {
  public static void main(String[] args) {
    System.out.println("Estoy pensando en un numero del 0 al 100 , adivinalo!");
    int contador = 5;
    int contrasena = (int)(Math.random()*101);
    int numero = 0;
    
      do {
        numero = Integer.parseInt(System.console().readLine());
        if (contrasena == numero) { 
          contador = 0;
          System.out.println("Has acertado el numero! ");
          
        } else {
            
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
          } //else
      } while (contador > 0); // do 
  }
}


