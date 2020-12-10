package Fibonacci;

import java.util.Scanner;

public class Fibonacci {

   /* Codigo para o Fibonacci */
   public static int fib(int n) {
      if (n == 0 || n == 1) {
         // boundary case ( 0th term = 0 and 1st term = 1 )
         return n;
      } else {
         // apply generic recursive formula
         int n_term = fib(n - 1) + fib(n - 2);
         return n_term;
      }
   }

   public static void main(String Args[]) {
      Scanner in = new Scanner(System.in);
      System.out.println("Quer saber o fibonacci de qual n�mero?");
      int numfib = in.nextInt();
      System.out.println("A fibonacci é: " + fib(numfib));
   }
}