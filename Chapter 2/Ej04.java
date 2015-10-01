/**
 *Ejercicio 4
*Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere convertir deberá
*estar almacenada en una variable.
 * @author Antonio José Martín Gámez.
 */

public class Ej04 {
  public static void main(String[] args) {
    
    double Euro;
    Euro = 5;
    
    int Pesetas;
    Pesetas = (int)(Euro * 166.386);
    
    //System.out.println(Euro + "€"  + " Son "  + Pesetas + "Pesetas");
    System.out.printf( "%.2f euros son %d pesetas ", Euro, Pesetas);
  }
}
