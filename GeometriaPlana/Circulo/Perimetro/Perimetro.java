package GeometriaPlana.Circulo.Perimetro;

import java.util.Scanner;

public class Perimetro {
   public static double perimetro(double r) {
      return (2*Math.PI*r);
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);   
   
      try {
         System.out.println("Informe o nÃºmero do raio");
         double raio = in.nextDouble();
         System.out.println("A area Ã©: " + perimetro(raio));
      } finally {
         in.close();
      }
   }
}