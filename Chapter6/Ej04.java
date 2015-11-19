/**
Ejercicio 4
Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por
espacios.
**/

public class Ej04 {
  public static void main(String[] args) {

    System.out.println("Los numeros son");
    for (int i = 0; i < 20; i++) {
    int numero = (int)(Math.random()*11);
    if (i == 19) {
      System.out.print(numero);
     }else {
     System.out.print(numero + ", ");
     }
    
    
    }
    
   
    

    
  
  
  
  }
}
