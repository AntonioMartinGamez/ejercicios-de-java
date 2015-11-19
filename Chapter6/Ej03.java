/**
Ejercicio 3
Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de 40 cartas:
2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
**/

public class Ej03 {
  public static void main(String[] args) {

    System.out.println("Muestra una carta por teclado de la baraja francesa");
  
    String palo = " ";
    String figura = " ";
      int modeloPalo = (int)(Math.random()*4) + 1;
    
    switch(modeloPalo) {
      case 1:
        palo = "Oros";
        break;
      case 2:
        palo = "Espadas";
        break;
      case 3:
        palo = "Copas";
        break;
      case 4:
        palo = "Bastos";
      default:
    }
    int numeroPalo = (int)(Math.random()*13) + 1;
    
    switch (numeroPalo) {
      case 1: 
        figura = "As";
        break;
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
        figura = String.valueOf(numeroPalo);
        break;
      case 10:
        figura = "Sota";
        break;
      case 11:
        figura = "Caballo";
        break;
      case 12:
        figura = "Rey";
        default:
    
      }
      System.out.println("La carta es " + figura + " de " + palo);

      
    
    
  }
}
