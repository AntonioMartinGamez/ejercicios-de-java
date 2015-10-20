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
    int numero = 0;
    int contador = 1;
    int resultado = 0;
    int esPrimo = 0;
    System.out.println("Por favor introduce una numero");
    numero = Integer.parseInt(System.console().readLine());
    
    
    while (contador < (numero/2)  ) {
      resultado = numero/contador;
      esPrimo = numero%contador;
      contador++;
     
/**     if esPrimo {
        System.out.println("El numero introducido es primo");
      } else {
        System.out.println("El numero introducido no es primo");
      
   } */ 
    
  } if (esPrimo == 0) {
        System.out.println("El numero que has introducido es primo!");
      } else {
        System.out.println("El numero que has introducido no es primo!");
}
}
}


   
