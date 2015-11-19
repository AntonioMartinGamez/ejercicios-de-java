/**
Ejercicio 13
Escribe un programa que simule la tirada de dos dados. El programa deberá continuar
tirando los dados una y otra vez hasta que en alguna tirada los dos dados tengan el mismo
valor.
**/

public class Ej13 {
  public static void main(String[] args) {
    
    
    System.out.println("");
    int i = 0;
    int j = 0;
    int contador = 0;
    do {
    i = (int)(Math.random()*6 + 1);
    j = (int)(Math.random()*6 + 1);
    contador++;
    System.out.println("Tirada " + contador + " " + i + " " + j);
    
    
    } while ( i != j);
    

    
  
  
  
  }
}
