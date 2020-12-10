package GeometriaPlana.Quadrado.Area;

import java.util.Scanner;

public class Area {
   public static double area(double l) {

      return (Math.pow(l, 2));
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      try {
         System.out.println("Informe o distância de um lado do quadrado");
         double lado = in.nextDouble();
         System.out.println("A area do quadrado é: " + area(lado));
      } finally {
         in.close();
      }

   }
}