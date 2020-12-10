import java.util.Scanner;
public class NumeroTabuada{
   public static void main(String[] args){
   
      Scanner in = new Scanner(System.in);
   
      System.out.println("Informe o número da tabuada que deseja ver: ");
      int valorTabuada = in.nextInt();
   
      for(int i = 0;i<=10;i++){
         System.out.println(valorTabuada+" X "+i+" = "+(valorTabuada*i));
      }
   }
}