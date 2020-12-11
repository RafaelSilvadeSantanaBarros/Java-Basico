package GeometriaEspacial.Cone;
import java.util.Scanner;
public class Cone{

   public static double areadabase(double r) {
      return (Math.PI*(Math.pow(r,2)));
   }
   public static double areadalateral(double r, double g) {
      return (Math.PI*r*g);
   }
   public static double areatotal(double r, double g) {
      return ((Math.PI*r)*(r+g));
   }
   public static double volume(double r, double g, double a) {
      return ((Math.PI*(Math.pow(r, 2)*a))/3);
   }


   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
   
      try {
         System.out.println("Informe o raio da base do cone");
         double raio = in.nextDouble();
         System.out.println("Informe a geratriz do cone");
         double geratriz = in.nextDouble();
         System.out.println("Informe a altura do cone");
         double altura = in.nextDouble();
         System.out.println("A area da base e: "+areadabase(raio)+
            "\nArea da lateral e: "+areadalateral(raio, geratriz)+"\nArea total e: "
            +areatotal(raio, geratriz)+"\nVolume do cone e: "+volume(raio, geratriz,altura));  
      } finally {
         in.close();
      }
   }
}

