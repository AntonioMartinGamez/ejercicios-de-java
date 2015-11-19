/**
*Ejercicio 1
Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma
total (los puntos que suman entre los tres dados).
**/

public class Ej01 {
  public static void main(String[] args) {

    System.out.println("La tirada de 3 dados aleatorios");
    int suma = 0;
    for (int i = 1; i < 4; i++) {
    int numero = (int)(Math.random()*6 + 1);
    System.out.println((int)(Math.random()*6 + 1) + "  ");
    
    suma = suma + numero;
    }
    System.out.println("la suma es " + suma);

    
  
  
  
  }
}
