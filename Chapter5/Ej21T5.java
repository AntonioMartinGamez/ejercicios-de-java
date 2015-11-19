/**
*
Ejercicio 21
Realiza un programa que vaya pidiendo números hasta que se introduzca un numero
negativo y nos diga cuantos números se han introducido, la media de los impares
y el mayor de los pares. El número negativo sólo se utiliza para indicar el final de la 
introducción de datos pero no se incluye en el cómputo.
 */
public class Ej21T5 {
  public static void main(String[] args) {
    System.out.println("El programa calculará la media de los impares y el mas grande de los pares");   
    System.out.println("Por favor introduce una lista de 10 numeros de uno en uno ");
    
    
    int n = 0;
    double numero =1 ;
    int imparOpar = 0;
    double aux = 0;
    double numero2 = 0;
    int contador_impar = 0;
    while (numero > 0  ) {
      numero = Double.parseDouble(System.console().readLine());
      imparOpar = (int)numero;
      if (numero >= 0) {
      System.out.println("El numero introducido es positivo \n");
      } else {
          System.out.println("el numero introducido es negativo \n");
        }
      n++;
      imparOpar = (int)numero%2;
      //numero impar
      if (imparOpar ==1){
        contador_impar++;
        aux += numero;
        System.out.println("El numero introducido es impar ");
        
      }
      //numero par 
      if (imparOpar ==0){
       
        
        if (numero > numero2){
          numero2 = numero;
          System.out.println("El numero introducido es par ");
          System.out.println("El numero par positivo mas grande es " + numero);
        } else {
         numero = numero2;
         System.out.println("El numero par positivo mas grande es " + numero);
          
          }
      }
    System.out.println("Introduce otro numero");
    System.out.println("Has introducido " + (n) + " numeros");
    System.out.println(" numeros impares media"+ aux/contador_impar);
    
    }
  }
}

   
