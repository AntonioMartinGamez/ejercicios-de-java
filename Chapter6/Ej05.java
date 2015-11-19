/**
Ejercicio 5
Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por
espacios. Muestra también el máximo, el mínimo y la media de esos números.
**/

public class Ej05 {
  public static void main(String[] args) {

    System.out.println("Los numeros son");
    int contador = 0;
    double suma = 0;
    int numero = 0;
    int numeroGrande = 199;
    int numeroPequeno = 100;
    int i = 0;
    while ( i < 51 ) { //Media
      numero = (int)(Math.random()*101)+100;
          System.out.print(numero + ", ");
      suma += numero;
      i++;
    //Numero más grande
      if (numero < numeroGrande){
            numeroGrande = numero;
      }
    //numero más pequeño
      if (numero > numeroPequeno ){
            numeroPequeno = numero;
      }
         
    } 
    System.out.println(" ");
    System.out.println("La media es "+((suma - numero)/(i-1))); //Media
    System.out.println("El numero positivo mas grande es " + numeroGrande);//numero Mayor
    System.out.println("El numero positivo mas pequeño es " + numeroPequeno);//numero Menor
    

    
  
  
  
  }
}
