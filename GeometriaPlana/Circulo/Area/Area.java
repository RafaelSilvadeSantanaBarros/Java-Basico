package GeometriaPlana.Circulo.Area;

import java.util.Scanner;

public class Area {
   public static double area(double r) {

      return (Math.PI * (Math.pow(r, 2)));
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      try {
         System.out.println("Informe a distância do raio");
         double raio = in.nextDouble();
         System.out.println("A area é: " + area(raio));
      } finally {
         in.close();
      }

   }
}