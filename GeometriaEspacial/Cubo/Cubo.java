package GeometriaEspacial.Cubo;
import java.util.Scanner;
public class Cubo{

   public static double areatotal(double a) {
      return (6*(Math.pow(a,2)));
   }
   public static double volume(double a) {
      return (Math.pow(a,3));
   }  

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
   
      try {
         System.out.println("Informe a distancia da aresta do cubo");
         double aresta = in.nextDouble();
         System.out.println("Area total e: "+areatotal(aresta)+"\nVolume e: "+volume(aresta));  
      } finally {
         in.close();
      }
   }
}

