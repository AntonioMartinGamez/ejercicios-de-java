/**
Ejercicio 4
Define tres arrays de 20 números enteros cada una, con nombres numero , cuadrado y cubo .
Carga el array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben
almacenar los cuadrados de los valores que hay en el array numero . En el array cubo se
deben almacenar los cubos de los valores que hay en numero . A continuación, muestra el
contenido de los tres arrays dispuesto en tres columnas.
 * 
 * @author Antonio José Martín Gámez
 */

public class Array04 {

  public static void main(String[] args) {
        
    int[] num = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
 
    System.out.println("El programa almacena 10 numeros por teclado ");
    System.out.println("Y luego los muestra en orden.");

    for (int i = 0; i < 20; i++) { // muestra los numeros
      num[i] = (int)(Math.random()*101);
    }
    
   /* for (int i = 0; i < 10; i++) {
      System.out.print(num[i] + "  ");
    }*/ 
    

    for (int i = 0; i < 20; i++) { // muestra el cuadrado
      cuadrado[i] = num[i]*num[i];
    }
    /*
    for (int i = 0; i < 10; i++) {
      System.out.print(cuadrado[i] + "  ");
    } */
    
    
    for (int i = 0; i < 20; i++) { // muestra el cuadrado
      cubo[i] = num[i]*num[i]*num[i];
    }
    
    for (int i = 0; i < 10; i++) {
      System.out.println(num[i] + " " + cuadrado[i] + "  " + cubo[i]);
    } 
   
 
        
  }
}
