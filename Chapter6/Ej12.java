
 /**
Ejercicio 12
Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el código
ascii entre el 32 y el 126. Puedes hacer casting con (char) para convertir un entero en un
carácter.
**/
public class Ej12 {
  public static void main(String[] args) {
    int contador = 0;
    System.out.print("\033[32m"); // pinta en verde
    
    while (contador < 2000){
      char caracter = (char)(Math.random() * (126 - 32 + 1) + 32);
      char caracter2 = (char)(Math.random() * (126 - 32 + 1) + 32);
      char caracter3 = (char)(Math.random() * (126 - 32 + 1) + 32);
      char caracter4 = (char)(Math.random() * (126 - 32 + 1) + 32);
      char caracter5 = (char)(Math.random() * (126 - 32 + 1) + 32);
      char caracter6 = (char)(Math.random() * (126 - 32 + 1) + 32);
    System.out.print(caracter);
    
  }
  

  }
}


