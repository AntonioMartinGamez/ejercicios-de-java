/**
* Ejercicio 9
Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 */
public class Ej9T5 {
  public static void main(String[] args) {
      
      System.out.println("Por favor introduzca un numero para multiplicar ");
      int contador = 1;
      int numero = Integer.parseInt(System.console().readLine());  
      do {
        if ((numero >= contador*1) && (numero < contador*10)) {
          System.out.println(contador);
        } else {
            contador ++;
          } while ((numero >= contador*1) && (numero < contador*10));
            
      }
  }
}
    

  
  




   
