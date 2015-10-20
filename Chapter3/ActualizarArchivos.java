/**
Ejercicio 2
Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere convertir debe
ser introducida por teclado.
 */
 
public class ActualizarArchivos {
  public static void main(String[] args) {
    
   System.out.print("Por favor, introduce una cantidad de euros ");
  String linea = System.console().readLine();
  double euros;
  euros = Double.parseDouble(linea);
  
  int pesetas = (int)(euros*166);
  
  System.out.println(pesetas + " Pesetas");
  

  }
}
