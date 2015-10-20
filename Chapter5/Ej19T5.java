/**
*
*Ejercicio 19
*Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por
*teclado. El carácter con el que se pinta la pirámide también se debe pedir por teclado.
*/
public class Ej19T5 {
  public static void main(String[] args) {
    int altura = 0;
    int contador = 0;
    int caracter = 0;
    System.out.println("Por favor introduce la altura");
    System.out.println("el programa pintará una piramide de la altura establecida");
    altura = Integer.parseInt(System.console().readLine());
    System.out.println("Por favor un caracter para pintar con el");
    caracter = Integer.parseInt(System.console().readLine());
    
    while (contador < altura) {
      contador++;
      if (contador < altura) {
        System.out.print(caracter + " ");
      }
      
    }
  }
}

   
