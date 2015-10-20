/**
*Ejercicio 14
*Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la
*potencia.
 */
public class Ej14T5 {
  public static void main(String[] args) {
    int base = 0;
    int exponente = 0;
    int contador = 0;
    int resultado = 1;
    
    System.out.println("Por favor introduce una base");
    base = Integer.parseInt(System.console().readLine());
    System.out.println("Por favor introduce una potencia para elevar");
    exponente = Integer.parseInt(System.console().readLine());
    
    
    while (contador < exponente  ) {
      resultado =(base * resultado );
      contador++;
      
    }
    System.out.println(resultado);
  }
}



   
