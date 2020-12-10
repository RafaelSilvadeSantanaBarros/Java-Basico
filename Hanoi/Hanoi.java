package Hanoi;

public class Hanoi {

   // Método que realiza (imprime) o movimento
   // de um disco entre dois pinos
   private static void mover(int O, int D) {
      System.out.println(O + " -> " + D);
   }

   // Método que implementa a recursão
   // O = pino origem
   // D = pino destino
   // T = pino de trabalho
   public static void hanoi(int n, int O, int D, int T) {
      if (n > 0) {
         hanoi(n - 1, O, T, D);
         mover(O, D);
         hanoi(n - 1, T, D, O);
      }
   }

   public static double potRec(double base, int exp) {
   
      if (exp == 0)
         return 1;
      else
         return base * potRec(base, exp - 1);
   
   }

   public static double potInt(double x, int z) {
      double resultado = 1;
      for (int i = 1; i <= z; i++) {
         resultado = resultado * x;
      }
      return resultado;
   }

   public static void main(String Args[]) {
      // executa o hanoi!
      int n = 3;
      Hanoi.hanoi(n, 1, 3, 2);
      System.out.println(Hanoi.potRec(3, 3));
      System.out.println(Hanoi.potInt(5, 3));
   
   }
}
