/**
* Ejercicio 7
*Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
*El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el
*mensaje “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se
*ha abierto satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte.
 */
public class Ej7T5 {
  public static void main(String[] args) {
    System.out.println("por favor introduza una contraseña");
    int contador = 0;
    int contrasena = Integer.parseInt(System.console().readLine());
    
    do {
      
      if (contrasena == 1234) { 
   
      System.out.println("La caja fuerte está abierta ");
      } else 
        System.out.println("La contraseña no es correcta");
        System.out.println("por favor introduza la contraseña de nuevo ");
        contador ++;
        contrasena = Integer.parseInt(System.console().readLine());
      
      if (contador == 3) {
        System.out.println("Están intentando forzar la caja!");
      }
    } while (contador < 3);
  }
}


   
