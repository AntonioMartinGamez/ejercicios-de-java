/**
*
Ejercicio 22
Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 */
public class Ej22T5 {
  public static void main(String[] args) {
    int contador = 2;
    int resto = 0;
    boolean esPrimo = true;
    int otroContador = 1;
    
    while (contador < 100) {
      contador++;
      while ((otroContador <= contador) && (esPrimo)) {
        otroContador++;
        resto = (contador)%otroContador;
        if (resto == 0) {
          esPrimo = false;
        } // else {
          //esPrimo = true;
        //}
        
      }
      if (esPrimo){
        System.out.println(contador);
      } //System.out.println(contador + "este numero es primo");
       
       
      
      otroContador = 2;
    } 
    
  }
}


   
