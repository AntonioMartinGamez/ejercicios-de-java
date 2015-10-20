/**
*Ejercicio 13
*Escribe un programa que lea una lista de diez números y determine cuántos son positivos,
*y cuántos son negativos.
 */
public class Ej13T5 {
  public static void main(String[] args) {
      
    System.out.println("Por favor introduce una lista de 10 numeros");
    System.out.println("El programa calculará cuantos son positivos y cuantos negativos");
    
    int n = 0;
    double numero ;
    n = 0;
    while (n < 10  ) {
      numero = Double.parseDouble(System.console().readLine());
      System.out.println(numero );
      if (numero >= 0) {
        System.out.println("El numero introducido es positivo \n");
      } else {
        System.out.println("el numero introducido es negativo \n");
        }
      n++;
      System.out.println("Introduce otro numero");
    }
  }
}



   
