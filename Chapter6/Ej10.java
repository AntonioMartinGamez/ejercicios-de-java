
 /**
Ejercicio 10
Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. El carácter
con el que se pinta cada línea se elige de forma aleatoria entre uno de los siguientes: *, -, =,
., |, @. Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.
**/
public class Ej10 {
  public static void main(String[] args) {

    System.out.println("Muestra una carta por teclado de la baraja francesa");
    int i = 0;
    int j = 0;
    String caracter = " ";
    int longitud = 0;
    for (i = 0; i < 10; i++){
    int modeloCaracter = (int)(Math.random()*6) + 1;
    
      switch(modeloCaracter) {
        case 1:
          caracter = "*";
          break;
        case 2:
          caracter = "-";
          break;
        case 3:
          caracter = "=";
          break;
        case 4:
          caracter = "|";
        break;
        case 5:
          caracter = "@";
        default:
        }
        //System.out.println(caracter);
        longitud = (int)(Math.random()*41) + 1;
      for (j = 0; j < longitud; j++){
        
        System.out.print(caracter);
      }
      System.out.println(" ");
    }//for
      

  }
}


