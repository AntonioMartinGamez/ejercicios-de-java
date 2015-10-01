/*
 *Ejercicio 4
*Escribe un programa que calcule el total de una factura a partir de la base imponible (precio
sin IVA). La base imponible estará almacenada en una variable.
 * @author Antonio José Martín Gámez.
 */

public class Ej06 {
  public static void main(String[] args) {
    
    double importe_base;
    importe_base = 1400;
    
    double iva;
    iva =  0.21;
    
    double iva_del_producto;
    iva_del_producto = importe_base * iva;
    
    double total;
    total = (importe_base * iva) + importe_base ; 
    
    
    System.out.println("Importe base " + importe_base + " €");
    System.out.println("Iva del producto " + iva_del_producto + " €");
    System.out.println("Precio total " + total + " €");
    
  }
}
