/**
Ejercicio 8
Realiza un programa que pida la temperatura media que ha hecho en cada mes de un
determinado año y que muestre a continuación un diagrama de barras horizontales con
esos datos. Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro
carácter.
 * 
 * @author Antonio José Martín Gámez
 */

public class Array08 {

  public static void main(String[] args) {
        
    int[] temperatura = new int[12];
    String[] mes = new String[12];
    
    System.out.println("El programa almacena la temperatura media de un año por meses ");
    System.out.println("Y luego muestra un diagrama de barras con los datos.");
    
    mes[0] = "enero      ";
    mes[1] = "febrero    ";
    mes[2] = "marzo      ";
    mes[3] = "abril      ";
    mes[4] = "mayo       ";
    mes[5] = "junio      ";
    mes[6] = "julio      ";
    mes[7] = "agosto     ";
    mes[8] = "septiembre ";
    mes[9] = "octubre    ";
    mes[10]= "noviembre  ";
    mes[11]= "diciembre  ";
    

    
    
    
    for (int i = 0; i < 12; i++) { // almacena en el Array la temp media del mes
      System.out.print("temperatura del mes " + mes[i]);
      temperatura[i] = Integer.parseInt(System.console().readLine());    }
    
    for (int i = 0; i < 12; i++) { // muestra los numeros
      System.out.print(mes[i]);
      for ( int j = 0; j < temperatura[i]; j++) {
        System.out.print("▄");
       
      }
     System.out.print(temperatura[i]);
     System.out.println(" ");
    }  
  }
}

