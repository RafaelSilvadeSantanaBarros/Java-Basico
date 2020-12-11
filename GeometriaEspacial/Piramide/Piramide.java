package GeometriaEspacial.Piramide;
import java.util.Scanner;
public class Piramide{
   
   
   public static double areabase(double l,double c) {
      return (l*c);
   }   
   public static double volume(double b,double c,double a) {
      return (c*(b*(a/3)));
   }  

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
   
      try {
         System.out.println("Informe a largura da piramide");
         double largura = in.nextDouble();
         System.out.println("Informe o comprimento da piramide");
         double comprimento = in.nextDouble();
         System.out.println("Informe a altura da piramide");
         double altura = in.nextDouble();        
         System.out.println("A area da base da piramide e: "+areabase(largura, comprimento)+
         "\nVolume da piramide e: "+volume(largura, comprimento,altura));  
      } finally {
         in.close();
      }
   }
}



