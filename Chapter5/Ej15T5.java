/**
*Ejercicio 15
*Escribe un programa que dados dos números, uno real (base) y un entero positivo
*(exponente), saque por pantalla todas las potencias con base el numero dado y exponentes
*entre uno y el exponente introducido. No se deben utilizar funciones de exponenciación.
*Por ejemplo, si introducimos el 2 y el 5, se deberán mostrar 2 1 , 2 2 , 2 3 , 2 4 y 2 5 .
 */
public class Ej15T5 {
  public static void main(String[] args) {
    double base = 0;
    int exponente = 0;
    int contador = 0;
    double resultado = 1;
    
    System.out.println("Por favor introduce una base");
    base = Double.parseDouble(System.console().readLine());
    System.out.println("Por favor introduce una potencia para elevar");
    exponente = Integer.parseInt(System.console().readLine());
    
    
    while (contador < exponente  ) {
      resultado =(base * resultado );
      contador++;
      System.out.println(base + " * " + contador + " = " + resultado);
    }
    
  }
}



   
