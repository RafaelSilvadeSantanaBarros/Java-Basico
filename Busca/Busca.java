package Busca;

import java.util.Arrays;

public class Busca {
   public static boolean busca(int vet[], int elem) {
      // Iterativo Linear
      for (int i = 0; i < vet.length; i++) {
         if (vet[i] == elem) {
            return true;
         }
      }
      return false;
   }

   public static boolean buscar(int vet[], int elem, int i) {
      // Recursivo Linear
      if (i < vet.length) {
         if (vet[i] == elem) {
            return true;
         } else {
            return buscar(vet, elem, i + 1);
         }
      }
      return false;
   }

   public static boolean buscaS(int vet[], int elem) {
      // Iterativo Linear �ltimas Posi��es
      for (int i = vet.length - 1; i > -1; i--) {
         if (vet[i] == elem) {
            return true;
         }
      }
      return false;
   }

   public static boolean buscaI(int vet[], int elem, int i) {
      // Recursivo Linear �ltimas Posi��es
      if (i > 0) {
         if (vet[i] == elem) {
            return true;
         } else {
            return buscaI(vet, elem, i - 1);
         }
      }
      return false;
   }

   public static int buscaO(int vet[], int elem, int i) {
      Arrays.sort(vet);
      for (i = 0; i < vet.length; i++) {
         if (vet[i] == elem) {
            return i;
         } else if (vet[i] > elem) {
            return vet[i];
         }
      }
      return 0;
   }

   public static void main(String ars[]) {
      int tab[] = { 2, 7, 5, 1, 3, 22, 12 };
      int n = tab.length;
      System.out.println("resultado da busca Itevativa: " + busca(tab, 5));
      System.out.println("resultado da busca recursiva: " + buscar(tab, 5, 0));
      System.out.println("resultado da busca Iterativa a partir das �ltimas Posi��es: " + buscaS(tab, 5));
      System.out.println("resultado da busca recursiva a partir das �ltimas Posi��es: " + buscaI(tab, 5, n - 1));
      System.out.println("resultado da busca Diferenciado a partir das �ltimas Posi��es: " + buscaO(tab, 5, n - 1));

   }
}