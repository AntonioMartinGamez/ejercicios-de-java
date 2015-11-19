
 /**
Ejercicio 9
Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no
termine de generar números hasta que no saque el 24. El programa deberá decir al final
cuántos números se han generado.
**/
public class Ej09 {
  public static void main(String[] args) {
    System.out.println("Voy a generar numeros hasta que encuentre el 24 , siempre del 0 al 100");
    System.out.println("Los numeros son");
    int numero = (int)(Math.random()*101);
    int contador = 0;
    while (numero != 24) {
    numero = (int)(Math.random()*101);
    
      System.out.print(numero + " ");
      contador++;
    }
    System.out.println("");
    System.out.println("Se han generado " + contador + " numeros");
  }
}


