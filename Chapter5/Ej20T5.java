/**
*
*Ejercicio 19
*Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por
*teclado. El carácter con el que se pinta la pirámide también se debe pedir por teclado.
*/
public class Ej20T5 {

  public static void main(String[] args) {
    
  System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca el carácter de relleno: ");
    String relleno = System.console().readLine();
    
    int altura = 1;
    int i = 0;
    int espacios = alturaIntroducida-1;
    
    while (altura <= alturaIntroducida) {
      
      // inserta espacios delanteros
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      System.out.print(relleno);
      for (i = alturaIntroducida-1; i <= alturaIntroducida; i++) {
        System.out.print(" ");
        
      }
      System.out.println();

      altura++;
      espacios--;
    }
  }
}

   
