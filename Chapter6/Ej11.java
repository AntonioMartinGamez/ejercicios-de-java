
 /**
Ejercicio 11
Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de
la forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número
de suspensos, el número de suficientes, el número de bienes, etc.
**/
public class Ej11 {
  public static void main(String[] args) {

    System.out.println("Muestra Notas de alumnos aleatorias");
    int i = 0;
    int j = 0;
    int suspensos = 0;
    int bienes = 0;
    int suficientes = 0;
    int notables = 0;
    int sobresalientes = 0;

    for (i = 0; i < 20; i++){
    int modeloCaracter = (int)(Math.random()*6) + 1;
    
      switch(modeloCaracter) {
        case 1:
          suspensos++;
          System.out.println("Suspenso");
          break;
        case 2:
          suficientes++;
          System.out.println("Suficiente");
          break;
        case 3:
          bienes++;
          System.out.println("Bien");
          break;
        case 4:
          notables++;
          System.out.println("Notable");
        break;
        case 5:
          sobresalientes++;
          System.out.println("Sobresaliente");
        default:
        }
    }//for
    System.out.println("N/ Suspensos "+ suspensos + " ");
    System.out.println("N/ Suficientes "+ suficientes + " ");
    System.out.println("N/ bienes "+ bienes + " ");
    System.out.println("N/ notables "+ notables + " ");
    System.out.println("N/ sobresalientes "+ sobresalientes + " ");
      

  }
}


