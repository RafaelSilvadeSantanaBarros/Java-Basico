package GeometriaEspacial.Esfera;
import java.util.Scanner;
public class Esfera{

   public static double areatotal(double r) {
      return (4*(Math.PI*(Math.pow(r, 2))));
   }  
   public static double volume(double r) {
      return ((4*Math.PI)*((Math.pow(r, 3)/3)));
   }  

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
   
      try {
         System.out.println("Informe o raio da esfera");
         double raio = in.nextDouble();
         System.out.println("Area total da esfera e: "+areatotal(raio)+"\nVolume da esfera e: "+volume(raio));  
      } finally {
         in.close();
      }
   }
}

