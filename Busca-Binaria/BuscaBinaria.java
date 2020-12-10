public class BuscaBinaria {

   public static boolean BuscaBinarie(int vet[], int x) {
      /* Iterativo */
      final int n = vet.length;
      int inicio = 0, fim = n - 1, meio;
      while (inicio <= fim) {
         meio = (inicio + fim) / 2;
         if (x == vet[meio])
            return true;
         else if (vet[meio] < x)
            inicio = meio + 1;
         else
            fim = meio - 1;
      }
      return false;
   }

   public static boolean BuscaBinariA(int vet[], int inicio, int fim, int x) {
      /* Recursivo */
      if (inicio > fim)
         return false;
      else {
         int meio = (inicio + fim) / 2;
         if (x == vet[meio])
            return true;
         else if (vet[meio] < x)
            return BuscaBinariA(vet, meio + 1, fim, x);
         else
            return BuscaBinariA(vet, inicio, meio - 1, x);
      }
   }

   public static boolean BuscaBinariO(int vet[], int x) {
      /* Iterativo Decrescente */

      final int n = vet.length;
      int inicio = n - 1, fim = 0, meio;
      while (inicio >= fim) {
         meio = (inicio + fim) / 2;
         if (x == vet[meio])
            return true;
         else if (vet[meio] < x)
            inicio = meio + 1;
         else
            fim = meio - 1;
      }
      return false;
   }

   public static boolean BuscaBinarias(int vet[], int x, int inicio, int fim) {
      /* Recursivo Decrescente */

      if (fim > inicio)
         return false;
      else {
         int meio = (inicio + fim) / 2;
         if (x == vet[meio])
            return true;
         else if (vet[meio] > x)
            return BuscaBinarias(vet, meio - 1, fim, x);
         else
            return BuscaBinarias(vet, inicio, meio + 1, x);
      }
   }

   public static String BuscaBinariaEmpresa(int vet[], int x) {
      /* Iterativo Empresa */

      int menor, meio, alto;
      menor = 0;
      alto = vet.length - 1;
      while (menor <= alto) {
         meio = (menor + alto) / 2;
         if (x < vet[meio])
            alto = meio - 1;
         else if (x > vet[meio])
            menor = meio + 1;
         else
            return "O valor que busca n�o se encontra no vetor";
      }
      if (x >= vet[vet.length - 1]) {
         return "O valor buscado n�o se encontra no vetor";
      }
      return "O valor buscado deve estar entre as posic�es" + alto + " e " + menor + "do vetor";
   }

   public static void main(String ars[]) {
      // tabela
      int tab[] = { 1, 5, 7, 12, 16, 17, 20 };
      int n = tab.length;

      System.out.println("resultado da busca binaria Itevativa: " + BuscaBinarie(tab, 5));
      System.out.println("resultado da busca binaria Recursivo: " + BuscaBinariA(tab, 0, n - 1, 12));
      System.out.println("resultado da busca binaria Iterativo Decrescente: " + BuscaBinariO(tab, 12));
      System.out.println("resultado da busca binaria Recursivo Decrescente: " + BuscaBinarias(tab, 12, n - 1, 0));
      System.out.println("resultado da busca binaria Iterativo Empresa: " + BuscaBinariaEmpresa(tab, 10));

   }

}