/**
*
Ejercicio 26
Realiza un programa que pida primero un número y a continuación un dígito. El programa
nos debe dar la posición (o posiciones) contando de izquierda a derecha que ocupa ese
dígito en el número introducido.
 */
public class Ej26T5 {
  public static void main(String[] args) {
      
    System.out.println("Por favor introduzca un numero para conocer sus digitos ");
    int contador = 0;
    long n = 0;
    long n2 = 0;
    int digito = 0;
    long volteado = 0;
    int imparOpar = 0;
    int cifra = 0;
    
    //pedimos numero por teclado
    n = Long.parseLong(System.console().readLine());
    System.out.println("Por favor introduzca el segundo numero ");
    n2 = Long.parseLong(System.console().readLine());
    
    
    while (n > 0) {// muestra el volteado
       
      volteado = (volteado * 10) + (n % 10);
      n /= 10; 
      
    

      
      
    }      
   
    while (volteado > 0){//muestra los digitos uno a uno
      contador++;
      
   
      
      
        System.out.println("En el digito "+ contador + " Tienes la cifra " + volteado % 10);
        
         imparOpar = (int)volteado%2;
      
      if (imparOpar ==1){
        System.out.println("El digito introducido del primer numero es impar ");
      }
      
      if (imparOpar ==0){
          System.out.println("El digito introducido del primer numero es par ");
      }
      
      volteado /= 10;
    }     
    
  }
}




   
