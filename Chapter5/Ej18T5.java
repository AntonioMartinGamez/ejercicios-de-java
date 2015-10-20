/**
*
*Ejercicio 18
*Escribe un programa que obtenga los números enteros comprendidos entre dos números
*introducidos por teclado y validados como distintos, el programa debe empezar por el
*menor de los enteros introducidos e ir incrementando de 7 en 7.
 */
public class Ej18T5 {
  public static void main(String[] args) {
    int numero1 = 0;
    int numero2 = 0;
    int contador = 0;
    int aux = 0;
    System.out.println("Por favor introduce un numero");
    System.out.println("el programa devuelve los numeros consiguientes incrementados de 7 en 7");
    numero1 = Integer.parseInt(System.console().readLine());
    System.out.println("Por favor introduce un numero");
    numero2 = Integer.parseInt(System.console().readLine());
    
    if (numero1 > numero2) {
      aux = numero1;
      numero1 = numero2;
      numero2 = aux;
      
    }
    
    if (numero1 == numero2) {
      System.out.println("Los dos numeros son iguales :/"); 
    }
      
    while (numero1 < (numero2 - 7)) {
      
      numero1 += 7;
      System.out.println(numero1);
    }
  }
}

   
