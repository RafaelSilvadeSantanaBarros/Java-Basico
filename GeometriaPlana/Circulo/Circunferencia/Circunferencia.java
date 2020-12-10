package GeometriaPlana.Circulo.Circunferencia;

import java.util.Scanner;

public class Circunferencia {
   public static double circunferencia(double r) {
      return (2*Math.PI*r);
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);   
   
      try {
         System.out.println("Informe o nÃºmero do raio");
         double raio = in.nextDouble();
         System.out.println("A area Ã©: " + circunferencia(raio));
      } finally {
         in.close();
      }
   }
}