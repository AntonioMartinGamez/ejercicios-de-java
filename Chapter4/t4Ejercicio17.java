  /**
Ejercicio 16
Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos está siendo
infiel. El programa irá haciendo preguntas que el usuario contestará con verdadero o falso.
Cada pregunta contestada como verdadero sumará 3 puntos. Las preguntas contestadas con
falso no suman puntos. Utiliza el fichero test_infidelidad.txt para obtener las preguntas
y las conclusiones del programa.
 */
 
 /**
1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.
2. Ha aumentado sus gastos de vestuario
3. Ha perdido el interés que mostraba anteriormente por ti
4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)
5. No te deja que mires la agenda de su teléfono móvil
6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante
7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a
8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo
9. Has notado que últimamente se perfuma más
10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo



Puntuación entre 0 y 10:
¡Enhorabuena! tu pareja parece ser totalmente fiel.

Puntuación entre 11 y 22:
Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.

Puntuación entre 22 y 30
Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.
  * 
  * 
  * 
  * 
  */
public class t4Ejercicio11 {
  public static void main(String[] args) {
    
   System.out.print("Por favor, introduce la hora  ");
  int hora = Integer.parseInt(System.console().readLine());
  System.out.print("Por favor, introduce los minutos  ");
  int minuto = Integer.parseInt(System.console().readLine());
  
  
  int horatotal = (hora * 3600 + minuto * 60);
  System.out.println("Segundos actuales " + horatotal);
  
  System.out.println("Segundos hasta media noche " + ((24*3600) - horatotal));
  
 
  }
}
