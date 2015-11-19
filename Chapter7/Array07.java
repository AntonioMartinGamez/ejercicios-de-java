/**
Ejercicio 7
Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre
por pantalla separados por espacios. El programa pedirá entonces por teclado dos valores  
y a continuación cambiará todas las ocurrencias del primer valor por el segundo en    
la lista generada anteriormente. Los números que se han cambiado deben aparecer
entrecomillados.
 * 
 * @author Antonio José Martín Gámez
 */

public class Array07 {

  public static void main(String[] args) {
        
    int[] num = new int[100];
    int[] n = new int[2];
 
    System.out.println("El programa almacena 100 numeros aleatorios ");
    System.out.println("Y luego pide dos numeros por teclado para cambiar todos los iguales a el.");


    
    
    
    for (int i = 0; i < 100; i++) { // almacena en el Array 100 numeros aleatorios
      num[i] = (int)(Math.random()*21);
       
    }
    
    for (int i = 0; i < 100; i++) { // muestra los numeros
      System.out.println(num[i]);
    } 
    
    System.out.println("cambio de variable");
    
    for (int j = 0; j < 2; j++) {  // pide dos numros
      n[j] = Integer.parseInt(System.console().readLine());
      
    }
    
    for (int i = 0; i < 100; i++) { // muestra los numeros
      if (num[i] == n[0]){
        num[i] = n[1];
      }
      
      if (num[i] == n[1]){
      System.out.println("\"" + n[1] + "\""); // sacamos los numeros cambiados con comillas
      }else {
      System.out.println(num[i]);  
      }
    } 
    
    
    

    
 
        
  }
}
