package GeometriaPlana.Hipotenusa;
import java.util.Scanner;
public class Hipotenusa {

   public static double hipotenusa(double ca, double co) {
      return (Math.sqrt ((Math.pow(ca, 2)+(Math.pow(co, 2)))));
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
   
      try {
         System.out.println("Informe o cateto adjacente");
         double cadjacente = in.nextDouble();
         System.out.println("Informe o cateto oposto");
         double coposto = in.nextDouble();
         System.out.println("A hipotenusa é: "+ hipotenusa(cadjacente,coposto));   
      } finally {
         in.close();
      }
   }
}

