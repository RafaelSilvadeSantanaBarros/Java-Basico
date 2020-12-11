package GeometriaEspacial.Cilindro;
import java.util.Scanner;
public class Cilindro{

   public static double areatotal(double r, double a) {
      return (areadasbases(r)+arealateral(r, a));
   }
   public static double areadasbases(double r) {
      return (2*(Math.PI*(Math.pow(r, 2))));
   }
   public static double arealateral(double r, double a) {
      return ((2*(Math.PI*r))*a);
   }

   public static double volume(double r, double a) {
      return (Math.PI*(Math.pow(r, 2))*a);
   }  

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
   
      try {
         System.out.println("Informe o raio da base do cilindro");
         double raio = in.nextDouble();
         System.out.println("Informe a altura do cilindro");
         double altura = in.nextDouble();
         System.out.println("Informe o diametro do cilindro");
         double diametro = in.nextDouble();        
         System.out.println("Area lateral do cilindro e: "+arealateral(raio,diametro)+"\nArea das bases e: "+areadasbases(raio)+
         "\nArea total do cilindroe e: "+areatotal(raio,altura)+"\nVolume do cilindro e: "+volume(raio,altura));  
      } finally {
         in.close();
      }
   }
}

