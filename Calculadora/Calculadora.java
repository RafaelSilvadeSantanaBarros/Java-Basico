package Calculadora;

import java.util.Scanner;

public class Calculadora {

   static double soma(double a, double b) {
      return (a + b);
   }

   static double subtracao(double a, double b) {
      return (a - b);
   }

   static double multiplicacao(double a, double b) {
      return (a * b);
   }

   static double divisao(double a, double b) {
      return (a / b);
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      try {
         System.out.println("Informe o primeiro valor");
         double primeiroValor = in.nextDouble();

         System.out
               .println("Informe a a��o a ser executada\n Divis�o(/)\n Multiplica��o(*)\n Soma(+)\n Subtra��o(-)\n");
         String acao = in.next();

         System.out.println("Informe o segundo valor");
         double segundoValor = in.nextDouble();

         if (acao.equals("+")) {
            System.out.println(soma(primeiroValor, segundoValor));
         } else if (acao.equals("-")) {
            System.out.println(subtracao(primeiroValor, segundoValor));
         } else if (acao.equals("/")) {
            System.out.println(divisao(primeiroValor, segundoValor));
         } else if (acao.equals("*")) {
            System.out.println(multiplicacao(primeiroValor, segundoValor));
         } else {
            System.out.println("Algo de errado nao est� certo!!");
         }
      } finally {
         in.close();
      }

   }
}