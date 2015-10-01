/**
 * Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura de un
*color diferente. 
 */

public class C01ejercicio04 { // Clase principal
  public static void main(String[] args) {
  

String rojo = "\033[31m";
String verde = "\033[32m";
String naranja = "\033[33m";
String azul = "\033[34m";
String morado = "\033[35m";
String blanco = "\033[37m";
  
  
  
  
  
  
  
  
  
  
    System.out.println(         naranja +"\t\tLun"+ verde +"\tMart"+ azul + "\tMie"+ morado + "\tJueves"+ rojo + "\tViernes");
    System.out.println(naranja +"8:15 9:15"+ morado +"  \tFol\tProg\tSin\tProg\tBD");
    System.out.println(naranja +"9:15 10:15"+ morado +" \tFol\tProg\tSin\tProg\tBD");
    System.out.println(naranja +"10:15 11:15"+ verde +"\tFol\tProg\tSin\tProg\tBD");
    System.out.println(naranja +"11:45 12:40"+ naranja +"\tProg\tBD\tSin\tED\tProg");
    System.out.println(naranja +"12:40 13:45"+ azul +"\tProg\tBD\tSin\tProg\tBD");
    System.out.println(naranja +"13:45 14:30"+ blanco +"\tProg\tBD\tSin\tProg\tBD");
    
    
    

  }
}
