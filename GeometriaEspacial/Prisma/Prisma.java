package GeometriaEspacial.Prisma;
import java.util.Scanner;
public class Prisma{
/* ATEN��O EST� CLASSE EST� EM MANUTEN��O
Math.sin(a);
Math.cos(a);
Math.tan(a);
*/
   public static double areadalateral(double n, double l, double a) {
      return (n*l*a);
   }
   public static double areatotal(double n, double l, double a) {
      return (n*l*a);
   }
   public static double volume(double n, double l, double a) {
      return (n*l*a);
   }   


   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
   
      try {
         System.out.println("Informe o n�mero de faces laterais");
         double qlaterais = in.nextDouble();
         System.out.println("Informe a medida da aresta da base");
         double m = in.nextDouble();
         System.out.println("Informe a altura do prisma");
         double altura = in.nextDouble();
         System.out.println();  
      } finally {
         in.close();
      }
   }
}

