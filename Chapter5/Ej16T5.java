/**
*
* Ejercicio 16
*Escribe un programa que diga si un número introducido por teclado es o no primo. Un
*número primo es aquel que sólo es divisible entre él mismo y la unidad.
*
* Ejercicio numero primos dividir el numero entre todos los numeros hasta la mitad de 
* su cifra 
* creamos una boolean esPrimo = true 
* creamos un if esPrimo {
* Print es primo}
* else que no lo es
 */
public class Ej16T5 {
  public static void main(String[] args) {
    long numero = 0;
    long contador = 2;
    long resto = 0;
    boolean esPrimo = true;
    System.out.println("Por favor introduce una numero");
    numero = Long.parseLong(System.console().readLine());
    
    
    while (contador < (numero/2)  ) {
      resto = numero%contador;
      contador++;
    
    
      if (resto == 0) {
        esPrimo = false;
      } 
    } 
    if (esPrimo == false){
    System.out.println("El numero introducido no es primo :(");
    } else {
      System.out.println("El numero introducido es primo ");
      }
        
     
  }
}

   
