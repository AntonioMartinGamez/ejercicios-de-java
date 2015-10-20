/**
*
*Ejercicio 17
*Realiza un programa que sume los 100 números siguientes a un número entero y positivo
*introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es un
*número positivo).
 */
public class Ej17T5 {
  public static void main(String[] args) {
    int numero = 0;
    int contador = 0;
    int n = 100;
    int aux = 0;
    int numero2 = 0;
    System.out.println("Por favor introduce una numero");
    System.out.println("El programa devolverá los 100 numeros siguientes al introducido");
    numero = Integer.parseInt(System.console().readLine());
    
    if (numero <= 0) {
      System.out.println("El numero introducido no es positivo!");
    } else {
      
        while (contador < n) {
          
          contador++;
          aux = numero + aux;
          numero2 = (numero++ +(aux));
           
        }
        System.out.println("Esta es la suma de los 100 numeros siguientes al que tu has introducido");
        System.out.println(numero2);
      }
  }
}

   
